# TMPC Go : TP1

## Useful links

* [Sujet du TP ici](http://users.polytech.unice.fr/~eg/TMPC/Tds/Td1/sujet.html)

## 1. Serveur TCP

Fichier [gosimpleserv.go](http://users.polytech.unice.fr/~eg/TMPC/Tds/Td1/sujet.html)

Ajouter une goroutine sur le handleConnection permet de ne pas être bloquant à cet endroit et donc d'accepter plusieurs clients.

## 2. Création de goroutines

### 1. Création goroutines

Bien prendre en compte la synchronisation des goroutines, le programme main s'arrête dès qu'elle arrive à la fin, pour que toutes les goroutines terminent il faut alors attendre qu'elles terminent. pour cela on peut résoudre le probème avec des *WaitGroup* ou *Channel*.

Pour voir le nombre de ligne juste faire un `go run goroutines.go | wc -l`

### 2. Affichage temps pris par le programme

Utilisation de la lib time, affichage directement avec `%s` pour conversion automatique dans la grandeur adéquate.

### 3. GOMAXPROCS

Lors que la variable __GOMAXPROCS__ est supérieur à 1, le temps d'exécution est plus long. Paralléliser un programme aussi peu couteu fait ralentir le programme, la gestion de la division des routines sur plusieurs coeurs ajoute de la latence.

### 4. ??

?

## 3. Un for compliqué

Sans un deuxième channel de confirmation, le programme termine avant de pouvoir effetuer son dernier `Printf`. *Pourquoi ?* Car lorsque `main` a terminé d'écrire dans le channel, le programme s'arrête, l'execution est tellement rapide que la goroutine ne peut pas terminer.
Avec un deuxième channel, l'éxecution de la goroutine dans channel c est garentie car il doit traiter dans son select (qui est bloquant) la dernière requête du canal *c*, et les requêtes de *done*. Une sorte de handshake/ping-pong est effectué entre le main et la goroutine :

1. *main* indique que le travail est terminé `done <- true`
2. *affichage* traite ce cas `case <-done: done<- true` et réécrit true dans le channel pour confirmer de son côté, d'où le côté handshake/ping-pong.
3. *main* termine.

Après quelques tests, la réponse de la goroutine ne semble pas nécessaire, je pense que le temps décrire true dans le channel *done* permet de garantir le temps de printf, mais autant garder le processus de confirmation qui est plus sûr.

## 4. Fonctions leep et Tick

Boucle infinie que compare à chaque intération le temps actual au temps de l'appelle de la fonction auquel on avait ajouté la durée à dormir.
Pour Tick, on fragmente la durée en 20 parties et on s'endore 20 fois 1/20 du temps et on affiche un `.` à haque itération.