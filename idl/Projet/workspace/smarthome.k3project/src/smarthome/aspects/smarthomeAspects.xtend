package smarthome.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension smarthome.aspects.HomeAspect.*
import static extension smarthome.aspects.NamedEntityAspect.*
import static extension smarthome.aspects.ValueAspect.*
import static extension smarthome.aspects.SensorAspect.*
import static extension smarthome.aspects.AnalogSensorAspect.*
import static extension smarthome.aspects.DigitalSensorAspect.*
import static extension smarthome.aspects.CSVSensorAspect.*
import static extension smarthome.aspects.RoomAspect.*
import static extension smarthome.aspects.PatternAspect.*
import static extension smarthome.aspects.RuleAspect.*
import static extension smarthome.aspects.PersonAspect.*
import static extension smarthome.aspects.PredicateAspect.*
import static extension smarthome.aspects.SensorPredicateAspect.*
import static extension smarthome.aspects.PersonPredicateAspect.*
import static extension smarthome.aspects.DurationAspect.*
import smarthome.Home
import smarthome.NamedEntity
import smarthome.Value
import smarthome.Sensor
import smarthome.AnalogSensor
import smarthome.DigitalSensor
import smarthome.CSVSensor
import smarthome.Room
import smarthome.Pattern
import smarthome.Rule
import smarthome.Person
import smarthome.Predicate
import smarthome.SensorPredicate
import smarthome.PersonPredicate
import smarthome.Duration

@Aspect(className=Home)
class HomeAspect {

}

@Aspect(className=NamedEntity)
abstract class NamedEntityAspect {

}

@Aspect(className=Value)
class ValueAspect {

}

@Aspect(className=Sensor)
abstract class SensorAspect extends NamedEntityAspect {

}

@Aspect(className=AnalogSensor)
class AnalogSensorAspect extends SensorAspect {

}

@Aspect(className=DigitalSensor)
class DigitalSensorAspect extends SensorAspect {

}

@Aspect(className=CSVSensor)
class CSVSensorAspect {

}

@Aspect(className=Room)
class RoomAspect extends NamedEntityAspect {

}

@Aspect(className=Pattern)
class PatternAspect extends NamedEntityAspect {

}

@Aspect(className=Rule)
class RuleAspect {

}

@Aspect(className=Person)
class PersonAspect extends NamedEntityAspect {

}

@Aspect(className=Predicate)
abstract class PredicateAspect {

}

@Aspect(className=SensorPredicate)
class SensorPredicateAspect extends PredicateAspect {

}

@Aspect(className=PersonPredicate)
class PersonPredicateAspect extends PredicateAspect {

}

@Aspect(className=Duration)
class DurationAspect {

}



