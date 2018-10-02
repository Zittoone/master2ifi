# Techniques Modernes de Programmation Concurrente : Rendu TP1

Auteur : *Alexis Couvreur*

## Exercice 8 : Crible

1. We create an initial channel where the generator will be generating an infinity of numbers (it is better to deal with infinite data flow than finite, finite data flow means go routines must find an agreement to stop working)
2. We launch one go routine on the initial filter call so we can enter processing prime numbers on the channel
3. A filter assumes that the first input that goes through the channel (that we call *p*) is a prime number.
4. We then create a new channel that is the input channel of the next filter call.
5. We then proceed to send into a new channel all non p multiple forever (Which can be call the filtering...)
6. We can from here see a recursive effect which will be nicely terminated by the main thread once it has read all the prime numbers.

## Exercice 9 : Un serveur de chat multi-utilisateur

#### 1. Go Routine per user

Every time a user connects, a new goroutine is created to handle the user behavior, this goroutine dies as soon as the user is no longer in the server (logout, kicked) :

The goroutine will handle in and out communications between the user and the server, first of all when the user connects he will be asked his nickname so he can interacts with the other users, while his nickname is not set he will not be logged into the chatroom. A nickname cannot be taken twice, so if the user enter an already taken nickname he will be prompted to use another one.
The goroutine will then handle the incoming messages from the user and spread it among all the users, updating his `lastActivity` field so he won't be disconnected for idle.

#### 2. Main Thread

The main thread will first instantiate a network listener so users can connect through with netcat for example. To manipulate the users that logs in i created a map with the __username__ as the *key* and a __User__ structure which is as follows :

```Go
type User struct {
	conn         net.Conn
	name         string
	lastActivity time.Time
}
```

Where `conn` is the connection to the user where we can user `read` or `write` functions to interact, and `name` the username that the user chose upon login and finally `lastActivity` which stores the last time the user sent a message to the chat (empty messages do not count as a user activity).

Once this map is created we wait for incomming connections and when someones connect we can send the map with the goroutine. By design map are passed by *reference* and *not by value* which means we don't have to create a pointer to the map. __Except that maps are not *thread safe*__ so in addition to that i created a mutex so specific routines can lock the resource to use it (avoiding memory leaks/double writing/ writing and reading...).

A workaround would be to use channel and so redirect the resource usage into channel's being thread safe, but i did it with mutex as we already used the channels a lot with previous exercices, i wanted to give it a try.

#### 3. Go Routine idle

On top of that the main thread created a go routine which checks if a user is idle, when created the user map is passed and so every seconds it checks for every connected users if the user's lastActivity property minus current date is superior to an arbitrary time (here it is 30seconds).