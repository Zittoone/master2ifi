package model.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate;
import model.aspects.PredicateAspectPredicateAspectProperties;

@Aspect(className = Predicate.class)
@SuppressWarnings("all")
public abstract class PredicateAspect {
  @Step
  @Abstract
  public static boolean eval(final Predicate _self) {
    final model.aspects.PredicateAspectPredicateAspectProperties _self_ = model.aspects.PredicateAspectPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(model.aspects.PredicateAspect._privk3_eval(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Predicate", "eval");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  private static boolean currentValue(final Predicate _self) {
    final model.aspects.PredicateAspectPredicateAspectProperties _self_ = model.aspects.PredicateAspectPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean currentValue()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate){
    	result = model.aspects.PredicateAspect._privk3_currentValue(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate)_self);
    };
    return (boolean)result;
  }
  
  private static void currentValue(final Predicate _self, final boolean currentValue) {
    final model.aspects.PredicateAspectPredicateAspectProperties _self_ = model.aspects.PredicateAspectPredicateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentValue(boolean)
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate){
    	model.aspects.PredicateAspect._privk3_currentValue(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate)_self,currentValue);
    };
  }
  
  protected static boolean _privk3_eval(final PredicateAspectPredicateAspectProperties _self_, final Predicate _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static boolean _privk3_currentValue(final PredicateAspectPredicateAspectProperties _self_, final Predicate _self) {
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
  
  protected static void _privk3_currentValue(final PredicateAspectPredicateAspectProperties _self_, final Predicate _self, final boolean currentValue) {
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
