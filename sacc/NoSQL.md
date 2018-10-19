# NoSQL

*Not Only SQL*

## First : RDBMS (1983)

Principes ACID :

* **Atomicity** : Transaction réussit ou échoue complètement
* **Consistency** : une momoaction amène l db d'un état valide à un autre état lui aussi valide. "Valide" concerne la BD et non l'application.
* **Isolation** : 'état obtenu par l'éxecution de plusieurs transactions en // est le même que celui obtenu par l'execution séquentielle.
* **Durability** : Le résultat d'une transaction doit être maintenu pmalgré les pannes.

## Théorème de CAP

![CAP Theorem](https://cdn-images-1.medium.com/max/1600/1*WPnv_6sG9k4oG3S1A09MDA.jpeg)

Il y a 3 propriétés principales pour un système distribué à large échelle.
* **C** : consistency
* **A** : Availability (système disponible en permanence)
* **P** : Partition tolerance (continuer à fonctionner si plusieurs noeuds sont isolés)

**On ne peut en vérifier que 2 à la fois !**

## NoSQL (Brewer)

Principes BASE :

*Basically Available, Soft state & Eventual consistency.*

* **Basically Available** : Le système fournira toujours des données, même si elles sont dans un état non consistent, voire non disponible ou en cours de modification.
* **Soft state** : L'état interne peut changer sans intervention extérieur.
* **Eventual consistency** : En l'absence d'intervention extérieur le système arrivera à un état cohérent en un temps fini.

> *Moyen mémotéchnique : acido-basique solution chimique (principes ACID et BASIC)*


![alt](https://image.slidesharecdn.com/nosql-140604141545-phpapp01/95/nosql-databases-25-638.jpg?cb=1401891441)

## Problème avec des réplicats

*Cohérence stricte vs non-stricte*

* **Atomic consistency** : Les opérations doivent être éxecutées dans le même ordre sur tous les réplicats dans l'ordre où elles ont été émises. Nécessite une horloge globale.
* **Causal consistency** : Seules les opérations causalement liées doivent être ordonnées.
* **Eventual consistency** : see BASE#Eventual consistency.

## Types de BD NoSQL

* **Key-value** : chaque élément est stocké sous forme de clé-valeur (*DynamoD, Voldemort, MemCache,...*)
* **Document store** : Utilise une clé pour référencer des objets arbitrairement complexes (*MongoDB, ...*)
* **Graph store** : stock des graphs.
* **Wide column store** : Les données sont stockées sous de forme de column. (*Cassandra, google BigTable, ...*)

### Assurer la fiabilité des données

#### Réplication : ou copie n fois de la donnée

* **Réplication active** : le client met à jour tous les réplicats
* **Réplication passive synchrone** : un réplicat est le master qui reçoit les requêtes. Il bloque tant que les réplicats ne sont pas à jour.
* **Optimiste** : n'importe quel réplicat peut accepter une modification et doit la propager (synchrone vs asynchrone)

Horloge Lomport -> Vector clock -> Version clock
On considère $n$ machines. A chaque focument $D$ on associe un vecteur $[x_1, ... x_n]_D$ qui maintient le nombre de modifications connues de ce document.

> Un vecteur $X = [x_i, ..., x_n]$ domine un vecteur $Y = [y_i, ..., y_n]$ si $\bigvee i (x_i >= y_i)$

Protocole de mise à jour des vecteurs
* Une modif de $D$ sur la machine $i$ fait $x_i++$
* Une mise à jour de réplicat se fait en envoyant l'horloge locale
* Quand une machine $j$ avec le vecteur $Y$ reçoit une modif de $i$ avec le vecteur $X$ :
    * Si $X$ domine $Y$, la mse à jour est acceptée et $X$ remplace $Y$
    * Si $X$ ne domine pas $Y$, om y a conflit à résoudre. Une fois résolu, $Y$ deviendra $Max(x_i, y_i)$ et on incrémente $y_i$

