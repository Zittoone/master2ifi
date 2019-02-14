package model.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor
import fr.inria.diverse.k3.al.annotationprocessor.Step

@Aspect(className=Sensor)
class SensorAspect extends NamedEntityAspect {

	int currentValue
	
	@Step
	def void assign(int newValue) {
		_self.currentValue = newValue
	}

}