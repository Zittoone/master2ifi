#/user/bin/env elixir

defmodule PingPong do
  def ping() do
    receive do
      { "ping", pongpid } ->
        IO.puts("PING")
        Process.sleep(500)

        send(pongpid, {"pong", self()})
      _ ->
        IO.puts(:stderr, "Weird message")
    end
    ping()        # loop to wait the next ping
  end

  def pong() do
    receive do
      { "pong", pingpid } ->
        IO.puts("PONG")
        Process.sleep(500)

        send(pingpid, {"ping", self()})
      _ ->
        IO.puts(:stderr, "Weird message")
    end
    pong()        # loop to wait the next pong
  end

  def run() do
    pi = spawn(PingPong, :ping, [])
    po = spawn(PingPong, :pong, [])
    send(pi, {"ping", po})
  end
end

PingPong.run()

receive do
  _ -> :ok
end
