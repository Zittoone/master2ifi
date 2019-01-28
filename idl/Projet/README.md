# Projet fil rouge

## Sujet 2 : Smart Home Data Fusion DSL

> In this subject, your objective is full development environment based on an appropriate language to manipulate time series from sensors in order to construct higher abstraction level understanding then the data themselves.  For instance, If someone sits in her office for 2 hours then stand up, open the kitchen door, open the fridge, leave the kitchen 5 minutes later and then sit again in her office, then one can deduce five minute break for refreshing or eating something. More elaborated, if someone goes to the toilets “too often”, one can recommend this person to have an appointment with his doctor. Etc. Your goal is to provide a language to (1) define the different sensors that are used by the system, together with their position in a flat; and to (2) elaborate the construction of time series reasoning as shown earlier. Below is an example of such language.
> In https://archive.ics.uci.edu/ml/datasets/Activities+of+Daily+Living+%28ADLs%29+Recognition+Using+Binary+Sensors# or https://archive.ics.uci.edu/ml/datasets/Localization+Data+for+Person+Activity or http://traces.cs.umass.edu/index.php/Smart/Smart or more generally here https://archive.ics.uci.edu/ml/datasets.html?format=&task=&att=&area=&numAtt=&numIns=&type=ts&sort=nameUp&view=table you will find an example of a time series obtained based on (home) monitoring. Depending on the evolution you want to give to your language you can decide to mock some sensors (e.g., to create test scenario), to link with existing sensors (for example through MQTT) or to read open data bases.  In any cases, the time in your execution/debug session and from the sensor should be synchronized. You are the decider concerning the expressiveness of your language; however it is obviously required to deal with temporal and concurrent actions. During the development of your language, you should be aware of what is the State of your system (and document it) and if it allows for exhaustive exploration as well as V&V activities.

## Outils utilisés

* Gemoc Studio
* xText
* ...

## Mon DSL

Mon DSL permet de définir :

* Des capteurs
* Des scénarios

La fusion des deux permet la détection d'évènement

## Déroulement du développement

### Première itération

#### CSVSensor

CSVSensor est un capteur qui est simulé à partir d'un fichier d'évènements de capteur.
Faire un `csvsensor` qui chargera un fichier contenant des évènements de capteur, un fichier par capteur ou tous les évènements dans un fichier au choix.
En général les fichiers de données ont les attributs suivants :
`̀Start time          	End time            	Location	Type		Place`

Sensor -> SensorType -> Magnétique | Préssion | ...

Scenario {
    
}

### Compile etc.

1. Clique model.genmode > Generate all
2. smarthomedsl.smartome > SmartHome.xtext > Run as Generate xtext artifacts...