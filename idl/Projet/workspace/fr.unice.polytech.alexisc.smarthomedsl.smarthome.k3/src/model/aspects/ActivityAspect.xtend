package model.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity

@Aspect(className=Activity)
class ActivityAspect {
	
	@Step
	def void exec(){
		
	}
}