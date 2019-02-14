package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import smarthome.Sensor;
import smarthome.aspects.NamedEntityAspect;

@Aspect(className = Sensor.class)
@SuppressWarnings("all")
public abstract class SensorAspect extends NamedEntityAspect {
}
