# TMPC Clojure : TP2

## Useful links

* [Sujet du TP ici](http://users.polytech.unice.fr/~eg/TMPC/Tds/Td2/sujet.html)

## 1. Création de threads

### 1.1 

le problème est que println n'étant pas thread safe est dû à son implémentation, la sortie standard va se mélanger...
Un `println` est décomposé de la manière suivante : `println "Any string" anyVar => (print "Any string") (print anyVar) (print '\n')`. On décompose un appel en trois donc.