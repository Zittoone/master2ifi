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

## 5. Course de relai

Un point important était de rappeler une goroutine à l'intérieur d'une goroutine, cela permet de mettre en place une récursivité.

## 6. Scheduler

Déferrer le close avec un wg.wait(), le consumer fera un wg.done() pour débloquer.

## 8. Crible

1. On créé un channel initial où le générateur générera une infinité de nombre (il est préférable d'utiliser une infinité de nombre pour que le main termine le process à la place de mettre en place un channel pour que les goroutines se disent qu'elles terminent si on a un nombre fini de nombres).
2. On démarre une go routine pour le filtre (il semblerait que cela ne soit pas nécessaire mais je n'ai pas trouvé d'autre moyen)
3. Le filtre prend le premier nombre du channel qui est par définition de notre récursivité un nombre premier.
4. On met en place la prochaine go routine de *filter* qui aura son channel d'entrée où l'on y enverra les nombres après filtrage.
5. On tmbe dans une récursivité infinie qui sera terminé par le programme principal.

## 9. Chat

Afin de créer le chat, j'ai voulu utiliser une go routine par connexion afin de ne pas bloquer le programme (comme dans l'exercice 1), j'ai créé suite à ça une go routine pour gérer l'idle. Parler des mutex pour l'accès concurrent des map