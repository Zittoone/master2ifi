# TMPC Elixir : TP3

## Useful links

* [Sujet du TP ici](http://users.polytech.unice.fr/~eg/TMPC/Tds/Td3/sujet.html)

## Exerice 1 : Encore du ping-pong

Factorisation des méthodes ping et pong en une seule méthode, on utilise le pattern-matching pour identifier les différents cas d'utilisation.

## Exercice 2 : Encore Fibonacci

### 2.1 Version 1

Définir la signature fonction `compute` était cruciale, un point important à comprendre est que : $fibonacci(n) = fibonacci(n-1) + n$

Ainsi notre fonction aura la signature `compute(a, b)` où on appelle avec $a$ et $b$ `compute(b, a + b)`. On a donc $a$ qui correspond à $fibonacci(a)$ et $b$  à $fibonacci(a+1)$

### 2.2 Version 2

L'utilisation des agents facilite grandement l'écriture, on peut voir que l'on a plus besoin d'utiliser send et les pid par exemple.