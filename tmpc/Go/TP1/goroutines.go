package main

import (
	"fmt"
	"math/rand"
	"sync"
	"time"
)

func printAndWait(message string) {
	fmt.Printf(message)

	delay := rand.Intn(50)

	time.Sleep(time.Duration(delay))
}

func main() {

	start := time.Now()

	var wg sync.WaitGroup
	for i := 0; i < 1000; i++ {
		wg.Add(1)
		go func() {
			printAndWait(fmt.Sprintf("I am the number %d, now i wait !\n", i))
			wg.Done()
		}()
	}

	wg.Wait()

	timeElapsed := time.Since(start)
	fmt.Printf("The program took %s\n", timeElapsed)
}
