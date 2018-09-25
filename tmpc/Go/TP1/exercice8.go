package main

import "fmt"

func filter(in chan int, out chan int) {

	p := <-in // First number which is supposed to always be prime

	next := make(chan int) // Create next 'in' channel

	go filter(next, out)

	go func() {
		for v := range in {
			if v%p != 0 {
				next <- v

			}
		}
	}()

	out <- p // Send the prime number to the channel
}

func primesNumbers() chan int {

	in := make(chan int)
	out := make(chan int)

	go filter(in, out)

	go func() {
		for v := 2; ; v++ {
			in <- v
		}
	}()

	return out
}

func main() {
	limit := 100
	c := primesNumbers()
	for n := <-c; n < limit; n = <-c { // Affichage des nombres premiers < 100
		fmt.Println(n)
	}
}
