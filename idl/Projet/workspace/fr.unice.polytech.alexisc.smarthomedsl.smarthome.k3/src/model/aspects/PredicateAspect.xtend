package model.aspects

import fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step

@Aspect(className=Predicate)
abstract class PredicateAspect {
	
	boolean currentValue
	
	@Step
	def boolean eval()
	
}

@Aspect(className=SensorPredicate)
class SensorPredicate extends PredicateAspect {
	
}

@Aspect(className=PersonPredicate)
class PersonPredicate extends PredicateAspect {
	
}