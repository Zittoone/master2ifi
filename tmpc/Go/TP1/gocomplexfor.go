package main

import (
	"fmt"
)

func main() {
	c := make(chan int)
	done := make(chan bool)
	go affichage(c, done)

	for i := 0; i < 10; i++ {
		c <- i
	}

	done <- true
	<-done
}

func affichage(c chan int, done chan bool) {
	for {
		select {
		case val := <-c:
			fmt.Println(val)
		case <-done:
			done <- true
		}
	}
}
