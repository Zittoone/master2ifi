package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.DigitalSensor;
import smarthome.aspects.DigitalSensorAspectDigitalSensorAspectProperties;
import smarthome.aspects.SensorAspect;

@Aspect(className = DigitalSensor.class)
@SuppressWarnings("all")
public class DigitalSensorAspect extends SensorAspect {
  @Step
  public static void tick(final DigitalSensor _self) {
    final smarthome.aspects.DigitalSensorAspectDigitalSensorAspectProperties _self_ = smarthome.aspects.DigitalSensorAspectDigitalSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tick()
    if (_self instanceof smarthome.DigitalSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.DigitalSensorAspect._privk3_tick(_self_, (smarthome.DigitalSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "DigitalSensor", "tick");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void init(final DigitalSensor _self) {
    final smarthome.aspects.DigitalSensorAspectDigitalSensorAspectProperties _self_ = smarthome.aspects.DigitalSensorAspectDigitalSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void init()
    if (_self instanceof smarthome.DigitalSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.DigitalSensorAspect._privk3_init(_self_, (smarthome.DigitalSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "DigitalSensor", "init");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_tick(final DigitalSensorAspectDigitalSensorAspectProperties _self_, final DigitalSensor _self) {
  }
  
  protected static void _privk3_init(final DigitalSensorAspectDigitalSensorAspectProperties _self_, final DigitalSensor _self) {
  }
}
