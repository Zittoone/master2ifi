# /user/bin/env elixir

defmodule PingPong do
  def pingpong(n) do
    if n > 0 do
      receive do
        {"ping", pid} ->
          IO.puts("PING")
          Process.sleep(500)

          send(pid, {"pong", self()})

        {"pong", pid} ->
          IO.puts("PONG")
          Process.sleep(500)

          send(pid, {"ping", self()})

        _ ->
          IO.puts(:stderr, "Weird message")
      end

      # loop to wait the next ping/pong
      pingpong(n - 1)
    else
      IO.puts("Terminé")
    end
  end

  def run(n \\ 2) do
    pi = spawn(PingPong, :pingpong, [n])
    po = spawn(PingPong, :pingpong, [n])
    send(pi, {"ping", po})
  end
end

PingPong.run()

receive do
  _ -> :ok
end
