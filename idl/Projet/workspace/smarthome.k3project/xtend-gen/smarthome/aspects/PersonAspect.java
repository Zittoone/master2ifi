package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import smarthome.Person;
import smarthome.aspects.NamedEntityAspect;

@Aspect(className = Person.class)
@SuppressWarnings("all")
public class PersonAspect extends NamedEntityAspect {
}
