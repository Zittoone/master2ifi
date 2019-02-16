package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Tag;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.TagAspectTagAspectProperties;

@Aspect(className = Tag.class)
@SuppressWarnings("all")
public class TagAspect extends NamedEntityAspect {
  @Step
  public static void tick(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_tick(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Tag","tick");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static Double x(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_x(_self_, _self);;
    return (java.lang.Double)result;
  }
  
  public static void x(final Tag _self, final Double x) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    _privk3_x(_self_, _self,x);;
  }
  
  public static Double y(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_y(_self_, _self);;
    return (java.lang.Double)result;
  }
  
  public static void y(final Tag _self, final Double y) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    _privk3_y(_self_, _self,y);;
  }
  
  public static Double z(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_z(_self_, _self);;
    return (java.lang.Double)result;
  }
  
  public static void z(final Tag _self, final Double z) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    _privk3_z(_self_, _self,z);;
  }
  
  protected static void _privk3_tick(final TagAspectTagAspectProperties _self_, final Tag _self) {
  }
  
  protected static Double _privk3_x(final TagAspectTagAspectProperties _self_, final Tag _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getX") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Double) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.x;
  }
  
  protected static void _privk3_x(final TagAspectTagAspectProperties _self_, final Tag _self, final Double x) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setX")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, x);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.x = x;
    }
  }
  
  protected static Double _privk3_y(final TagAspectTagAspectProperties _self_, final Tag _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getY") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Double) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.y;
  }
  
  protected static void _privk3_y(final TagAspectTagAspectProperties _self_, final Tag _self, final Double y) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setY")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, y);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.y = y;
    }
  }
  
  protected static Double _privk3_z(final TagAspectTagAspectProperties _self_, final Tag _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getZ") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Double) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.z;
  }
  
  protected static void _privk3_z(final TagAspectTagAspectProperties _self_, final Tag _self, final Double z) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setZ")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, z);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.z = z;
    }
  }
}
