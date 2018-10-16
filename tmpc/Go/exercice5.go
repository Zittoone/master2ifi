package main

import "fmt"

func main() {
	baton := make(chan int)
	quit := make(chan int)

	// Faire partir le premier coureur
	go coureur(baton, quit)
	baton <- 1
	<-quit
	fmt.Println("Fin de la course")
}

func coureur(baton chan int, quit chan int) {
	x := <-baton

	fmt.Printf("Coureur %d court avec le bâton\n", x)

	if x == 4 {
		fmt.Printf("Coureur %d a terminé\n", x)
		quit <- 1
	}

	fmt.Printf("Coureur %d en position\n", x+1)
	fmt.Printf("Coureur %d échange le bâton avec Coureur %d\n", x, x+1)

	go coureur(baton, quit)
	baton <- x + 1
}
