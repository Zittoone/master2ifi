package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import smarthome.DigitalSensor;
import smarthome.aspects.SensorAspect;

@Aspect(className = DigitalSensor.class)
@SuppressWarnings("all")
public class DigitalSensorAspect extends SensorAspect {
}
