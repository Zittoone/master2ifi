package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import smarthome.Home;
import smarthome.Pattern;
import smarthome.Person;
import smarthome.Room;
import smarthome.aspects.HomeAspectHomeAspectProperties;
import smarthome.aspects.PatternAspect;
import smarthome.aspects.PersonAspect;
import smarthome.aspects.RoomAspect;

@Aspect(className = Home.class)
@SuppressWarnings("all")
public class HomeAspect {
  @Main
  public static void doIt(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    _privk3_doIt(_self_, _self);;
  }
  
  @Step
  public static void tick(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_tick(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Home","tick");
    } else {
    	command.execute();
    }
    ;;
  }
  
  private static BufferedReader br(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_br(_self_, _self);;
    return (java.io.BufferedReader)result;
  }
  
  private static void br(final Home _self, final BufferedReader br) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    _privk3_br(_self_, _self,br);;
  }
  
  private static String currentString(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentString(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void currentString(final Home _self, final String currentString) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    _privk3_currentString(_self_, _self,currentString);;
  }
  
  private static String nextString(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_nextString(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void nextString(final Home _self, final String nextString) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    _privk3_nextString(_self_, _self,nextString);;
  }
  
  private static String value(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_value(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void value(final Home _self, final String value) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    _privk3_value(_self_, _self,value);;
  }
  
  protected static void _privk3_doIt(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
      String _fileEvents = _self.getFileEvents();
      File _file = new File(_fileEvents);
      FileReader _fileReader = new FileReader(_file);
      BufferedReader _bufferedReader = new BufferedReader(_fileReader);
      HomeAspect.br(_self, _bufferedReader);
      HomeAspect.currentString(_self, HomeAspect.br(_self).readLine());
      EList<Room> _rooms = _self.getRooms();
      for (final Room r : _rooms) {
        RoomAspect.init(r);
      }
      EList<Person> _persons = _self.getPersons();
      for (final Person p : _persons) {
        PersonAspect.init(p);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_tick(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    EList<Room> _rooms = _self.getRooms();
    for (final Room r : _rooms) {
      RoomAspect.tick(r);
    }
    EList<Person> _persons = _self.getPersons();
    for (final Person p : _persons) {
      PersonAspect.tick(p);
    }
    EList<Pattern> _patterns = _self.getPatterns();
    for (final Pattern p_1 : _patterns) {
      boolean _eval = PatternAspect.eval(p_1);
      boolean _equals = (_eval == true);
      if (_equals) {
        PatternAspect.exec(p_1);
      }
    }
  }
  
  protected static BufferedReader _privk3_br(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getBr") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.io.BufferedReader) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.br;
  }
  
  protected static void _privk3_br(final HomeAspectHomeAspectProperties _self_, final Home _self, final BufferedReader br) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setBr")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, br);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.br = br;
    }
  }
  
  protected static String _privk3_currentString(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentString;
  }
  
  protected static void _privk3_currentString(final HomeAspectHomeAspectProperties _self_, final Home _self, final String currentString) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentString);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentString = currentString;
    }
  }
  
  protected static String _privk3_nextString(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNextString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.nextString;
  }
  
  protected static void _privk3_nextString(final HomeAspectHomeAspectProperties _self_, final Home _self, final String nextString) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNextString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, nextString);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.nextString = nextString;
    }
  }
  
  protected static String _privk3_value(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final HomeAspectHomeAspectProperties _self_, final Home _self, final String value) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.value = value;
    }
  }
}
