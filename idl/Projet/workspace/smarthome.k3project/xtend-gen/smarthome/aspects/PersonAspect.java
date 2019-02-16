package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smarthome.Activity;
import smarthome.Person;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.PersonAspectPersonAspectProperties;
import smarthome.aspects.TagAspect;

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
  
  @Step
  public static void init(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_init(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Person","init");
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
  
  @Step
  public static void debug(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
     if (_self instanceof smarthome.Person){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							smarthome.aspects.PersonAspect._privk3_debug(_self_, (smarthome.Person)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Person","debug");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof smarthome.NamedEntity){
    					smarthome.aspects.NamedEntityAspect.debug((smarthome.NamedEntity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
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
  
  private static double STANDING_RATIO(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_STANDING_RATIO(_self_, _self);;
    return (double)result;
  }
  
  private static double SITTING_RATIO(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_SITTING_RATIO(_self_, _self);;
    return (double)result;
  }
  
  private static double LAYING_RATIO(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_LAYING_RATIO(_self_, _self);;
    return (double)result;
  }
  
  private static double DELTA(final Person _self) {
    final smarthome.aspects.PersonAspectPersonAspectProperties _self_ = smarthome.aspects.PersonAspectPersonAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_DELTA(_self_, _self);;
    return (double)result;
  }
  
  protected static void _privk3_tick(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    PersonAspect.determineActivity(_self);
  }
  
  protected static void _privk3_init(final PersonAspectPersonAspectProperties _self_, final Person _self) {
  }
  
  protected static void _privk3_determineActivity(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    final Double cy = TagAspect.y(_self.getChest());
    final Double by = TagAspect.y(_self.getBelt());
    final double cb = DoubleExtensions.operator_minus(cy, by);
    final Double aly = TagAspect.y(_self.getAnkleLeft());
    final Double ary = TagAspect.y(_self.getAnkleRight());
    double _plus = DoubleExtensions.operator_plus(aly, ary);
    double _divide = (_plus / 2);
    final double ba = ((by).doubleValue() - _divide);
    double _STANDING_RATIO = PersonAspect.STANDING_RATIO(_self);
    boolean _greaterThan = ((ba / cb) > _STANDING_RATIO);
    if (_greaterThan) {
      PersonAspect.currentActivity(_self, Activity.STANDING);
    } else {
      double _SITTING_RATIO = PersonAspect.SITTING_RATIO(_self);
      boolean _greaterThan_1 = ((ba / cb) > _SITTING_RATIO);
      if (_greaterThan_1) {
        PersonAspect.currentActivity(_self, Activity.SITTING);
      } else {
        PersonAspect.currentActivity(_self, Activity.LAYING);
      }
    }
  }
  
  protected static Activity _privk3_getCurrentActivity(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    return PersonAspect.currentActivity(_self);
  }
  
  protected static void _privk3_debug(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    InputOutput.println();
    String _name = _self.getName();
    String _plus = ("Person[" + _name);
    /* (_plus + "]{"); */
    InputOutput.println();
    String _string = _self.getChest().toString();
    /* ("\t" + _string); */
    InputOutput.println();
    String _string_1 = _self.getBelt().toString();
    /* ("\t" + _string_1); */
    InputOutput.println();
    String _string_2 = _self.getAnkleLeft().toString();
    /* ("\t" + _string_2); */
    InputOutput.println();
    String _string_3 = _self.getAnkleRight().toString();
    /* ("\t" + _string_3); */
    InputOutput.<String>println("}");
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
  
  protected static double _privk3_STANDING_RATIO(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSTANDING_RATIO") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (double) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.STANDING_RATIO;
  }
  
  protected static double _privk3_SITTING_RATIO(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSITTING_RATIO") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (double) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.SITTING_RATIO;
  }
  
  protected static double _privk3_LAYING_RATIO(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLAYING_RATIO") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (double) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.LAYING_RATIO;
  }
  
  protected static double _privk3_DELTA(final PersonAspectPersonAspectProperties _self_, final Person _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDELTA") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (double) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.DELTA;
  }
}
