package model.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Room
import fr.inria.diverse.k3.al.annotationprocessor.Step

@Aspect(className=Room)
class RoomAspect extends NamedEntityAspect {

	@Step
	def void exec(){
		println(_self.name)
	}

}