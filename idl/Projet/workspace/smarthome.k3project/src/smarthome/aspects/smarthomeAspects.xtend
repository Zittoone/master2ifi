package smarthome.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension smarthome.aspects.HomeAspect.*
import static extension smarthome.aspects.NamedEntityAspect.*
import static extension smarthome.aspects.TagAspect.*
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
import smarthome.Tag
import smarthome.Person
import smarthome.Predicate
import smarthome.SensorPredicate
import smarthome.PersonPredicate
import smarthome.Duration
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import smarthome.Activity
import smarthome.Operator
import java.io.File
import java.io.BufferedReader
import java.io.FileReader

@Aspect(className=Home)
class HomeAspect {
	
	BufferedReader br
	String currentString
	String nextString
	String value
	
	@Main
	def void doIt() {
		
		// Definition
    	_self.br = new BufferedReader(new FileReader(new File(_self.fileEvents)))
    	_self.currentString = _self.br.readLine();
    
		for(Room r : _self.rooms) {
			r.init()
		}
		
		for(Person p : _self.persons) {
			p.init()
		}
		
		/*while((_self.nextString = _self.br.readLine()) != null) {
			
		}*/
		
	}
	
	@Step
	def void tick() {
		
		for(Room r : _self.rooms) {
			r.tick()
		}
		
		for(Person p : _self.persons) {
			p.tick()
		}
		
		for(Pattern p : _self.patterns) {
			// Je sais c'est obvious
			if(p.eval() == true) {
				p.exec()
			}
		}
	}
	
	
}

@Aspect(className=NamedEntity)
abstract class NamedEntityAspect {

	@Step
	def void debug() {
		println _self.toString()
	}
	
	@Step
	def String toString() {
		return "name=" + _self.name
	}
	
	@Step
	def String getName() {
		return _self.name
	}
	
	/*
	@Step
	def void setName(String name) {
		_self.name = name
	}*/
}

@Aspect(className=Sensor)
abstract class SensorAspect extends NamedEntityAspect {

	protected Double currentValue
	
	@Step
	def void tick()
	
	@Step
	def void init()
	
	@Step
	def void debug() {
		println _self.toString()
	}
	
	@Step
	def String toString() {
		return "Sensor[" + _self.name + "] = " + _self.currentValue
	}
	
	@Step
	def void setValue(Double value) {
		_self.currentValue = value
	}
	
	@Step
	def void readSource() {
		
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
	
	@Step
	def void debug() {
		
		println "Room[" + _self.name + "]{"
		for(Sensor s : _self.sensors) {
			println "\t" + s.toString()
		}
		println("}")
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
	
	@Step
	def void debug() {
		
		println "Pattern[" + _self.name + "]{"
		for(Rule r : _self.rules) {
			println "\t" + r.toString()
		}
		println("}")
	}
	
	
	@Step
	def void exec() {
		println "Pattern[" + _self.name + "] append !"
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
	
	@Step
	def void debug() {
		
		println("{")
		for(Predicate p : _self.predicates) {
			println p.toString()
		}
		println("}")
	}
}

@Aspect(className=Tag)
class TagAspect extends NamedEntityAspect {
	
	public Double x
	public Double y
	public Double z
	
	@Step
	def void tick() {
		
	}
	
	 
	
}

@Aspect(className=Person)
class PersonAspect extends NamedEntityAspect {
	
	Activity currentActivity
	
	final double STANDING_RATIO = 1.8
	final double SITTING_RATIO = 1.0
	final double LAYING_RATIO = 0.0
	final double DELTA = 0.4
	
	@Step
	def void tick(){
		_self.determineActivity()
	} 
	
	@Step
	def void init() {
		
	}
	
	def void determineActivity() {
		
		// TODO: Determine activity based on chest belt ankles
		//_self.currentActivity = Activity.STANDING
		
		val cy = _self.chest.y
		val by = _self.belt.y
		val cb = cy - by;
		
		val aly = _self.ankleLeft.y
		val ary = _self.ankleRight.y
		val ba = ( by - ((aly + ary) / 2))
	
		if( ba / cb > _self.STANDING_RATIO)
			_self.currentActivity = Activity.STANDING
		
		else if(ba / cb > _self.SITTING_RATIO) 
			_self.currentActivity = Activity.SITTING
			
		else _self.currentActivity = Activity.LAYING
		
	}

	def Activity getCurrentActivity() {
		return _self.currentActivity()
	}
	
	@Step
	def void debug() {
		
		println "Person[" + _self.name + "]{"
		// TODO: print all tags and current activity
		println "\t" + _self.chest.toString()
		println "\t" + _self.belt.toString()
		println "\t" + _self.ankleLeft.toString()
		println "\t" + _self.ankleRight.toString()
		println("}")
	}

}

@Aspect(className=Predicate)
abstract class PredicateAspect {
	
	@Step
	def boolean eval()
		
}

@Aspect(className=SensorPredicate)
class SensorPredicateAspect extends PredicateAspect {

	boolean currentValue
	
	@Step
	def boolean eval() {
		switch(_self.operator) {
			case Operator.EQUAL: {
					_self.currentValue = _self.sensor.currentValue == _self.value
					return _self.currentValue
				} 
			case Operator.SUPERIOR: {
					_self.currentValue = _self.sensor.currentValue > _self.value
					return _self.currentValue 
				}
			case Operator.INFERIOR: {
					_self.currentValue = _self.sensor.currentValue < _self.value
					return _self.currentValue 
				}
		}
		_self.currentValue = false
		return _self.currentValue
	}
	
	@Step
	def void debug() {
		println "{" + _self.sensor.toString() + " " + _self.operator.literal + " " + _self.value + " = " + _self.currentValue + "}"
	}
		
}

@Aspect(className=PersonPredicate)
class PersonPredicateAspect extends PredicateAspect {
	
	boolean currentValue
	
	@Step
	def boolean eval() {
		_self.currentValue = _self.person.getCurrentActivity().equals(_self.activity)
		return _self.currentValue
	}
	
	@Step
	def void debug() {
		
		println "{" + _self.person.toString() + " is " + _self.activity.literal + " = " + _self.currentValue + "}"

	}
	
}

@Aspect(className=Duration)
class DurationAspect {

	long validSince
	boolean currentValue
	
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
		_self.currentValue = (System.currentTimeMillis - _self.validSince) > (_self.time * _self.precision.value)
		return _self.currentValue
	}
	
	@Step
	def void debug() {
		
		println "{ Current:" + System.currentTimeMillis + ", validSince:" + _self.validSince + ", diff:" + (System.currentTimeMillis - _self.validSince) + ", duration:" + _self.time + _self.precision.literal + ", valid: " + _self.currentValue + "}"

	}
}



