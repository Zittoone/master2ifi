# Course #1

Course date : *Spetmber 26th, 2018*

## Complexité Algorithmique

- Intersting [wikipedia page](https://en.wikipedia.org/wiki/Iterated_logarithm)
- Complexité asympthotique : étude de la complexité qui tend vers l'infini
- Quadratique : multiplier données par 2 = multiplier temps par 4
- log normal = multiplication
- log*/log étoile = puissance (log*(4) = 65536)

### Calcul d'une multiplication

- **Classique** : n*n => évolution quadratique
- **Egyptienne/du paysan** : O(n.log(n))\
    11  137  \
     5  274  \
     2  548  \
     1 1096
- **Karatsuba** (deux entiers de taille 2n) :\
    (a.2^n+b)(c2^n+d) = ac4^n+ad+bc(2^n)+bd+(4n) = 4(T(2n))\
    (a+b)(c+d)=ac+bc+ad+bd = T(4n) = 3T(2n) => O(nlog2⁽³⁾)
- **Schönhage-Strassen** (FFT) => O(nlog*log(log(n)))
- **Fürer** (2007) O(n.log(n)*2^log\*(n))

## Les tris

### Les choix d'entrée ?

- entrée tableau mélangé
    - 1 à n mélangé
    - 1 à n random
    - 1 à racine(n) random
- tableau trié / trie inverse
- reverse engeenering

### Estimation

- __/!\\__ on estime uniquement la fonction à tester
- nombreux tests : 2, 4, 8, 16, 32...2¹⁶, 2¹⁸
- Mettre une limite de temps sur un test : test intelligent qui n'attend pas une éternité
- Visualiser les résultats : échelle logarithmique

> Pourquoi échelle logarithmique ?\
> t = n^a => log(t) = a.log(n)

> T(n) = n^a.(log(n))^b.2^c => log(T) = a.log(n)+b.log(log(n))+c.log(2)