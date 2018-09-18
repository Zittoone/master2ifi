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
