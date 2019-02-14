package model.aspects

import fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

@Aspect(className=NamedEntity)
class NamedEntityAspect {
	
	@Step
	def void exec(){
		println(_self.name)
	}
	
}


