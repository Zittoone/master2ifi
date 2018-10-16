# /user/bin/env elixir

defmodule Fibonacci do
  def start() do
    spawn_link(Fibonacci, :compute, [0, 1])
  end

  def next(pid) do
    send(pid, {:next, self()})
    receive do
      n-> n
    end
  end

  def restart(pid) do
    send(pid, {:restart})
  end

  def compute(a, b) do
    receive do
      {:next, caller} ->
        send(caller, a)
        compute(b, a+b)
      {:restart} ->
        {:restart}
        compute(0, 1)
    end
  end
end
