package model.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Home
import fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension model.aspects.SensorAspect.*

@Aspect(className=Home)
class HomeAspect {
	
	@Main
	def void doIt(){
		for(s : _self.sensors){
			s.exec()
		}
	}

}

@Aspect(className=NamedEntity)
class NamedEntityAspect {

}

@Aspect(className=Sensor)
class SensorAspect extends NamedEntityAspect {

@Step
def void exec(){
	println(_self.name)
}

}



