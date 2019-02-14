package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Duration;
import smarthome.aspects.DurationAspectDurationAspectProperties;

@Aspect(className = Duration.class)
@SuppressWarnings("all")
public class DurationAspect {
  @Step
  public static void init(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_init(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Duration","init");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void reset(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_reset(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Duration","reset");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static boolean isDone(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_isDone(_self_, _self));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Duration","isDone");
    } else {
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (boolean)result;
  }
  
  private static long validSince(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_validSince(_self_, _self);;
    return (long)result;
  }
  
  private static void validSince(final Duration _self, final long validSince) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    _privk3_validSince(_self_, _self,validSince);;
  }
  
  protected static void _privk3_init(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    DurationAspect.validSince(_self, System.currentTimeMillis());
  }
  
  protected static void _privk3_reset(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    DurationAspect.validSince(_self, System.currentTimeMillis());
  }
  
  protected static boolean _privk3_isDone(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    long _validSince = DurationAspect.validSince(_self);
    int _time = _self.getTime();
    return (_validSince > _time);
  }
  
  protected static long _privk3_validSince(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValidSince") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.validSince;
  }
  
  protected static void _privk3_validSince(final DurationAspectDurationAspectProperties _self_, final Duration _self, final long validSince) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValidSince")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, validSince);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.validSince = validSince;
    }
  }
}
