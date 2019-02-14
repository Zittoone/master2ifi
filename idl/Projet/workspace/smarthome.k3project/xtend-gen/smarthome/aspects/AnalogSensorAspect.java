package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.AnalogSensor;
import smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties;
import smarthome.aspects.SensorAspect;

@Aspect(className = AnalogSensor.class)
@SuppressWarnings("all")
public class AnalogSensorAspect extends SensorAspect {
  @Step
  public static void tick(final AnalogSensor _self) {
    final smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties _self_ = smarthome.aspects.AnalogSensorAspectAnalogSensorAspectContext.getSelf(_self);
     if (_self instanceof smarthome.AnalogSensor){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							smarthome.aspects.AnalogSensorAspect._privk3_tick(_self_, (smarthome.AnalogSensor)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"AnalogSensor","tick");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof smarthome.Sensor){
    					smarthome.aspects.SensorAspect.tick((smarthome.Sensor)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_tick(final AnalogSensorAspectAnalogSensorAspectProperties _self_, final AnalogSensor _self) {
  }
}
