package smarthome.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension smarthome.aspects.HomeAspect.*
import static extension smarthome.aspects.NamedEntityAspect.*
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
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import smarthome.Activity
import smarthome.Operator

@Aspect(className=Home)
class HomeAspect {
	
	
	@Main
	def void doIt() {
		
		// Definition
		for(Room r : _self.rooms) {
			r.init()
		}
		
	}
	
	@Step
	def void tick() {
		for(Room r : _self.rooms) {
			r.tick()
		}
	}
	
	
}

@Aspect(className=NamedEntity)
abstract class NamedEntityAspect {

	@Step
	def String toString() {
		return "name=" + _self.name
	}
}

@Aspect(className=Sensor)
abstract class SensorAspect extends NamedEntityAspect {

	protected Double currentValue
	
	@Step
	def void tick()
	
	@Step
	def void init()
	
	@Step
	def void setValue(Double value) {
		_self.currentValue = value
	}
	
}

@Aspect(className=AnalogSensor)
class AnalogSensorAspect extends SensorAspect {

	
	@Step
	def void tick() {
		// TODO: fetch data from sensor ?
	}
	
}

@Aspect(className=DigitalSensor)
class DigitalSensorAspect extends SensorAspect {
	
	@Step
	def void tick() {
		// TODO: fetch data from sensor ?
	}
}

@Aspect(className=CSVSensor)
class CSVSensorAspect {

	// TODO: load file
	
}

@Aspect(className=Room)
class RoomAspect extends NamedEntityAspect {

	@Step
	def void init() {
		for(Sensor s : _self.sensors) {
			s.init()
		}
	}
	
	@Step
	def void tick() {
		for(Sensor s : _self.sensors) {
			s.tick()
		}
	}
	
}

@Aspect(className=Pattern)
class PatternAspect extends NamedEntityAspect {

	@Step
	def boolean eval() {
		
		for(Rule r : _self.rules) {
			if(! r.eval()) {
				return false
			}
		}
		
		return true
	}
	
}

@Aspect(className=Rule)
class RuleAspect {

	@Step
	def boolean eval() {
		
		// Evaluate all the predicates
		for(Predicate p : _self.predicates) {
			if(! p.eval()) {
				
				// Has a @Step so easy to debug
				_self.duration.reset()
				
				return false
			}
		}
		
		return _self.duration.isDone()
	}
}

@Aspect(className=Person)
class PersonAspect extends NamedEntityAspect {
	
	Activity currentActivity
	
	@Step
	def void tick(){
		_self.determineActivity()
	} 
	
	def void determineActivity() {
		
		// TODO: Determine activity based on chest belt ankles
		_self.currentActivity = Activity.STANDING
	}

	def Activity getCurrentActivity() {
		return _self.currentActivity()
	}

}

@Aspect(className=Predicate)
abstract class PredicateAspect {
	
	@Step
	def boolean eval()
	
}

@Aspect(className=SensorPredicate)
class SensorPredicateAspect extends PredicateAspect {

	@Step
	def boolean eval() {
		switch(_self.operator) {
			case Operator.EQUAL:
				return _self.sensor.currentValue == _self.value 
			case Operator.SUPERIOR:
				return _self.sensor.currentValue > _self.value
			case Operator.INFERIOR:
				return _self.sensor.currentValue < _self.value
		}
		return false
	}
	
}

@Aspect(className=PersonPredicate)
class PersonPredicateAspect extends PredicateAspect {
	
	@Step
	def boolean eval() {
		return _self.person.getCurrentActivity().equals(_self.activity)
	}
	
}

@Aspect(className=Duration)
class DurationAspect {

	long validSince
	
	@Step
	def void init() {
		_self.validSince = System.currentTimeMillis
	}
	
	@Step
	def void reset() {
		_self.validSince = System.currentTimeMillis
	}
	
	@Step
	def boolean isDone() {
		return _self.validSince > _self.time
	}
}



