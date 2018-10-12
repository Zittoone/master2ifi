# Course #2

Course date : *October 10th, 2018*

## File de priorité et structures de recherche

Opérations / Structures | Tas | Arbres* | Tables de Hashage
|---|---|---|---|
| Récupérer une valeur | Non | Oui | Oui ($O(1)$ amorti) |
| Retrouver le nième élément | Non | Oui | Non |
| Retrouver le minimum | Oui | Oui | Non |
| Retrouver le plus petit > c | Non | Oui | Non |
| Filtrer > c | Non | Oui | Non

*\*Arbres: Arbres de recherches comme les AVLs et Rouge-Noir*

## AVLs

### Définition

Arbre binaire qui vérifie que un sommet a toujours une valeur comprise entre left et right (chaque valeur est unique). Un AVL spécifie : $|hl - hr| <= 1$ donc un arbre équilibré.

### Equilibrage de l'arbre

Insertion : descendre jusqu'à ce que l'on tombe sur une feuille et on insert notre valeur (toujours avec les tests inf ou sup pour left ou right).
Rotations : à chaque insertions on descend jusqu'à 