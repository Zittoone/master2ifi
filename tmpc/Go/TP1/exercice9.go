package main

import (
	"bufio"
	"fmt"
	"log"
	"net"
	"strings"
	"time"
)

// User : here you tell us what Salutation is
// Printer : what is this?
// Greet : describe what this function does
// CreateMessage : describe what this function does
type User struct {
	conn         net.Conn
	name         string
	lastActivity time.Time
}

const idleTime = 30000

func logger(message string) {
	fmt.Println(time.Now().Format("2006/01/02 15:04:05"), message)
}

func message(source *User, msg string, users map[string]User) {

	// commented out for td purpose
	/*defer func() {
		// in any case, if this func is triggered then user is not idle
		source.lastActivity = time.Now()
	}()*/

	if msg == "\n" {
		return
	}

	for _, user := range users {
		if user.name != source.name {
			fmt.Fprintf(user.conn, "%s: %s", source.name, msg)
		}
	}
	source.lastActivity = time.Now()
}

func broadcast(message string, users map[string]User) {

	for _, user := range users {
		fmt.Fprintf(user.conn, "%s", message)
	}
}

func login(reader *bufio.Reader, conn net.Conn, users map[string]User) (user User) {

	fmt.Fprintf(conn, "Nickname?")

	line, _ := reader.ReadString('\n')

	name := strings.TrimSuffix(line, "\n")

	// Check if Nickname is already taken
	var _, ok = users[name]
	for ; ok; _, ok = users[name] {
		fmt.Fprintf(conn, "Nickname already taken. Please choose another one.\n")
		fmt.Fprintf(conn, "Nickname?")
		line, _ = reader.ReadString('\n')
		name = strings.TrimSuffix(line, "\n")
	}

	fmt.Fprintf(conn, "Welcome on board %s\n", name)
	logger("Login of " + name + ".")

	user.conn = conn
	user.name = name
	user.lastActivity = time.Now()

	return user
}

func logout(user *User, users map[string]User, message string) {
	if _, ok := users[user.name]; ok {
		delete(users, user.name)
		broadcast(message, users)
		logger("Logout of " + user.name)
		user.conn.Close()
	}

}

// Note : instead of a pointer, user the map which is passed by ref
func idle(user *User, users map[string]User) {

	var dur time.Duration = idleTime * time.Millisecond

	// While user is connected check for idle
	for _, ok := users[user.name]; ok; {
		now := time.Now()
		if (now.Sub(user.lastActivity)) > dur {
			logger(user.name + " seems to be out (" + now.Sub(user.lastActivity).String() + "). Force disconnection.")
			fmt.Fprintf(user.conn, "Idle for a too long time. I disconnect you !\n")
			logout(user, users, user.name+" was idle too long and was disconnected.\n")
			return
		}
		time.Sleep(1000)

	}
}

func handleConnection(conn net.Conn, users map[string]User) {

	reader := bufio.NewReader(conn)

	user := login(reader, conn, users)
	broadcast(user.name+" has joined.\n", users)
	users[user.name] = user
	go idle(&user, users)

	// Once logged, defer the closing, removing and goodbye
	defer func() {
		//WARN: might cause a problem with idle
		logout(&user, users, user.name+" is gone.")
	}()
	for {
		line, err := reader.ReadString('\n')
		if err != nil {
			log.Println(err)
			return
		}
		message(&user, line, users)
	}
}

func main() {
	listener, err := net.Listen("tcp", "localhost:1234")
	logger("Server localhost:1234 ready.")
	if err != nil {
		log.Fatal(err)
	}

	users := make(map[string]User)

	for {
		conn, err := listener.Accept()
		if err != nil {
			log.Println(err)
			continue
		}
		go handleConnection(conn, users)
	}
}
