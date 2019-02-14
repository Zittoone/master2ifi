package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Activity;
import smarthome.Person;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.PersonAspectPersonAspectProperties;

@Aspect(className = Person.class)
@SuppressWarnings("all")
public class PersonAspect extends NamedEntityAspect {
  @Step
  public static void tick(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_tick(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Person","tick");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static void determineActivity(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    _privk3_determineActivity(_self_, _self);;
  }
  
  public static Activity getCurrentActivity(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getCurrentActivity(_self_, _self);;
    return (smarthome.Activity)result;
  }
  
  private static Activity currentActivity(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentActivity(_self_, _self);;
    return (smarthome.Activity)result;
  }
  
  private static void currentActivity(final Person _self, final Activity currentActivity) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    _privk3_currentActivity(_self_, _self,currentActivity);;
  }
  
  protected static void _privk3_tick(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    PersonAspect.determineActivity(_self);
  }
  
  protected static void _privk3_determineActivity(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    PersonAspect.currentActivity(_self, Activity.STANDING);
  }
  
  protected static Activity _privk3_getCurrentActivity(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    return PersonAspect.currentActivity(_self);
  }
  
  protected static Activity _privk3_currentActivity(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentActivity") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (smarthome.Activity) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentActivity;
  }
  
  protected static void _privk3_currentActivity(final PersonAspectPersonAspectProperties _self_, final Person _self, final Activity currentActivity) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentActivity")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentActivity);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentActivity = currentActivity;
    }
  }
}
