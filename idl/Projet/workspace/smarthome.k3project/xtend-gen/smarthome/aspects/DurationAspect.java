package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
  
  @Step
  public static void debug(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_debug(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Duration","debug");
    } else {
    	command.execute();
    }
    ;;
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
  
  private static boolean currentValue(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentValue(_self_, _self);;
    return (boolean)result;
  }
  
  private static void currentValue(final Duration _self, final boolean currentValue) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    _privk3_currentValue(_self_, _self,currentValue);;
  }
  
  protected static void _privk3_init(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    DurationAspect.validSince(_self, System.currentTimeMillis());
  }
  
  protected static void _privk3_reset(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    DurationAspect.validSince(_self, System.currentTimeMillis());
  }
  
  protected static boolean _privk3_isDone(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    long _currentTimeMillis = System.currentTimeMillis();
    long _validSince = DurationAspect.validSince(_self);
    long _minus = (_currentTimeMillis - _validSince);
    int _time = _self.getTime();
    int _value = _self.getPrecision().getValue();
    int _multiply = (_time * _value);
    boolean _greaterThan = (_minus > _multiply);
    DurationAspect.currentValue(_self, _greaterThan);
    return DurationAspect.currentValue(_self);
  }
  
  protected static void _privk3_debug(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    InputOutput.println();
    long _currentTimeMillis = System.currentTimeMillis();
    String _plus = ("{ Current:" + Long.valueOf(_currentTimeMillis));
    String _plus_1 = (_plus + ", validSince:");
    long _validSince = DurationAspect.validSince(_self);
    String _plus_2 = (_plus_1 + Long.valueOf(_validSince));
    String _plus_3 = (_plus_2 + ", diff:");
    long _currentTimeMillis_1 = System.currentTimeMillis();
    long _validSince_1 = DurationAspect.validSince(_self);
    long _minus = (_currentTimeMillis_1 - _validSince_1);
    String _plus_4 = (_plus_3 + Long.valueOf(_minus));
    String _plus_5 = (_plus_4 + ", duration:");
    int _time = _self.getTime();
    String _plus_6 = (_plus_5 + Integer.valueOf(_time));
    String _literal = _self.getPrecision().getLiteral();
    String _plus_7 = (_plus_6 + _literal);
    String _plus_8 = (_plus_7 + ", valid: ");
    boolean _currentValue = DurationAspect.currentValue(_self);
    String _plus_9 = (_plus_8 + Boolean.valueOf(_currentValue));
    /* (_plus_9 + "}"); */
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
  
  protected static boolean _privk3_currentValue(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isCurrentValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final DurationAspectDurationAspectProperties _self_, final Duration _self, final boolean currentValue) {
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
