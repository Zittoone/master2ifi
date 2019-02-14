package model.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor;
import model.aspects.NamedEntityAspect;
import model.aspects.SensorAspectSensorAspectProperties;

@Aspect(className = Sensor.class)
@SuppressWarnings("all")
public class SensorAspect extends NamedEntityAspect {
  @Step
  public static void assign(final Sensor _self, final int newValue) {
    final model.aspects.SensorAspectSensorAspectProperties _self_ = model.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void assign(int)
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			model.aspects.SensorAspect._privk3_assign(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor)_self,newValue);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {newValue}, command, "Sensor", "assign");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  private static int currentValue(final Sensor _self) {
    final model.aspects.SensorAspectSensorAspectProperties _self_ = model.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int currentValue()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor){
    	result = model.aspects.SensorAspect._privk3_currentValue(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor)_self);
    };
    return (int)result;
  }
  
  private static void currentValue(final Sensor _self, final int currentValue) {
    final model.aspects.SensorAspectSensorAspectProperties _self_ = model.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentValue(int)
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor){
    	model.aspects.SensorAspect._privk3_currentValue(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor)_self,currentValue);
    };
  }
  
  protected static void _privk3_assign(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final int newValue) {
    SensorAspect.currentValue(_self, newValue);
  }
  
  protected static int _privk3_currentValue(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final int currentValue) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValue);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentValue = currentValue;
    }
  }
}
