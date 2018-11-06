#
# Module Logger
#
defmodule Log do
  def message(str) do
    fmt = fn nb -> nb |> Integer.to_string |> String.pad_leading(2, "0") end

    {{d,m,y}, {h,min,s}}  = :calendar.local_time()
    IO.puts("#{fmt.(y)}/#{fmt.(m)}/#{fmt.(d)} " <>
            "#{fmt.(h)}:#{fmt.(min)}:#{fmt.(s)} #{str}")
  end
end

#
# Module Client
#
defmodule Client do

  def initialize(socket, server) do
    spawn(Client, :loop, [socket, server, ""])
  end

  defp write_line(line, socket) do
    :gen_tcp.send(socket, line)
  end

  def read_line(socket, server, username) do
    case :gen_tcp.recv(socket, 0) do
      {:ok, line} ->
        line
      {:error, :closed} ->
        if username != "" do
          send(server, {:disconnect, [username]})
        end
        Process.exit(self(), :closed)
      {:error, :enotconn} ->
        Log.message("No more listener")
        Process.exit(self(), :enotconn)
    end
  end

  def loop(socket, server, username) do

    if username == "" do
      # Ask for username
      "Nickname? " |> write_line(socket)

      # Read the usenamre
      newUsername = Client.read_line(socket, server, username) |> String.replace("\n", "");

      # Inform the server of our nickname
      send(server, {:register, [newUsername, socket, self()]})
      loop(socket, server, newUsername)
    else
      message = Client.read_line(socket, server, username) |> String.replace("\n", "")
      send(server, {:broadcast, [username, message]})
      loop(socket, server, username)
    end
      # loop with nickname

  end
end

#
# Module Server
#
defmodule Server do

  @idleSeconds 10

  defp write_line(line, socket) do
    :gen_tcp.send(socket, line)
  end

  def broadcast(users, message, source) do
    if source == nil do
      # Broadcast to everyone
      Enum.each users, fn {_, v} ->
        "> #{message}\n" |> write_line(v[:socket])
      end
    else
      Enum.each users, fn {k, v} ->
        if source != k do
          "#{source}: #{message}\n" |> write_line(v[:socket])
        end
      end
    end
  end

  def broadcastExcept(users, message, except) do
    Enum.each users, fn {k, v} ->
      if except != k do
        "> #{message}\n" |> write_line(v[:socket])
      end
    end
  end

  def listen(users) do
    # IO.inspect users
    receive do
      {:broadcast, [source, message]} ->
        if source != nil do
          newUsers = Map.put(users, source, [socket: users[source][:socket], lastActivity: :os.system_time(:seconds), pid: users[source][:pid]])
          broadcast(newUsers, message, source)
          listen(newUsers)
        else
          broadcast(users, message, source)
          listen(users)
        end
      {:register, [username, socket, pid]} ->
        if users[username] == nil do
          Log.message("Login of #{username}")
          broadcast(users, "L'utilisateur #{username} s'est connecté.", nil)
          newUsers = Map.put(users, username, [socket: socket, lastActivity: :os.system_time(:seconds), pid: pid])
          listen(newUsers)
        else
          # Error
          write_line("already taken", socket)
          listen(users)
        end
      {:disconnect, [username]} ->
        newUsers = Map.delete(users, username)
        broadcast(newUsers, "L'utilisateur #{username} s'est déconnecté.", nil)
        Log.message("Logout of #{username}")
        listen(newUsers)
      :timeout ->
        curr = :os.system_time(:seconds)
        newUsers = :maps.filter fn k, v ->
          if (curr - v[:lastActivity]) > @idleSeconds do
            broadcastExcept(users, "L'utilisateur #{k} a été déconnecté pour innactivité.", k)
            "Vous avez été déconnecté pour innactivité." |> write_line(v[:socket])
            Log.message("#{k} seems out. Force disconnection.")
            :gen_tcp.shutdown(v[:socket], :read_write)
            Process.exit(v[:pid], "Timed out")
            false
          else
            true
          end
        end, users

        listen(newUsers)
    end
  end

  def accept(socket, server) do
    {:ok, client} = :gen_tcp.accept(socket)     # Wait a client
    Client.initialize(client, server)           # Serve new client
    accept(socket, server)                              # Loop back
  end

  def idle(server) do
    Process.sleep(10000)
    send(server, :timeout)
    idle(server)
  end

  def run(port) do
    # Create our user map
    users = %{}

    Log.message("Running server on port #{port}")
    {:ok, socket} = :gen_tcp.listen(port, [:binary, packet: :line, active: false,
                                           reuseaddr: true])

    # Spawn a process to the listen function of this instance with users in it
    server = spawn(fn -> listen(users) end)

    # Idle timeout
    spawn(fn -> idle(server) end)

    # Accept new client with our server process
    accept(socket, server)
  end

  def main() do
    {options, _, _} = OptionParser.parse(System.argv, switches: [port: :integer])
    run(if options[:port], do: options[:port], else: 12345)
  end
end

Server.main()
