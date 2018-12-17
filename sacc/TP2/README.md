# Software Architecture in Cloud Computing : TP2

Teacher in charge : *Fabrice Huet* - [fabrice.huet@unice.fr](mailto:fabrice.huet@unice.fr)

## Useful links

* [GitHub course](https://fhermeni.github.io/sacc/)
* [Google Cloud Platform : java-docs-samples](https://github.com/GoogleCloudPlatform/java-docs-samples)
* [GCP DataStore sample](https://github.com/GoogleCloudPlatform/java-docs-samples/tree/master/flexible/datastore)
* [TP2 Link](https://docs.google.com/document/d/1xnqIqd7NnxHzjTOwfJ_t_00D2VIn7KFcqj4Jsv0GY9w/edit#)

## Commands

`mvn appengine:deploy`

## Entités et requêtes simples

1. Afficher : `https://clouddatastore-220611.appspot.com/artciles`
2. Créer : `curl -s -d '{"name": "boom", "price": "2.99", "quantity": "10"}' -H "Content-Type: application/json" -X POST https://clouddatastore-220611.appspot.com/articles`
3. Supprimer : `curl -s -d '{"name": "boom"}' -H "Content-Type: application/json" -X DELETE https://clouddatastore-220611.appspot.com/articles`

## Ancestor paths et transactions

1. Afficher : `https://clouddatastore-220611.appspot.com/magasins`
2. Créer : `curl -s -d '{"name": "boom", "price": "2.99", "quantity": "10", "magasin": "Jouet Club"}' -H "Content-Type: application/json" -X POST https://clouddatastore-220611.appspot.com/magasins`
3. Supprimer : `curl -s -d '{"name": "boom", "magasin": "Jouet Club"}' -H "Content-Type: application/json" -X DELETE https://clouddatastore-220611.appspot.com/magasins`