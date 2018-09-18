package main

import (
	"fmt"
	"time"
)

func main() {
	fmt.Print("Start Sleeping ")
	Sleep(3 * time.Second)
	fmt.Println(" Done")

	fmt.Print("Start Ticking ")
	Tick(3 * time.Second)
	fmt.Println(" Done")
}

func Sleep(t time.Duration) {
	wakeUpAt := time.Now().Add(t)

	for {
		if time.Now().After(wakeUpAt) {
			return
		}
	}
}

func Tick(t time.Duration) {
	start := time.Now()
	wakeUpAt := start.Add(t)
	duration := wakeUpAt.Sub(start) / 20

	for i := 0; i < 20; i++ {
		Sleep(duration)
		fmt.Print(".")
	}
}
