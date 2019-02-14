package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import smarthome.AnalogSensor;
import smarthome.aspects.SensorAspect;

@Aspect(className = AnalogSensor.class)
@SuppressWarnings("all")
public class AnalogSensorAspect extends SensorAspect {
}
