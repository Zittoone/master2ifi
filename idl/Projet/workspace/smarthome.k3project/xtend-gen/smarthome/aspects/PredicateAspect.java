package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Predicate;
import smarthome.aspects.PredicateAspectPredicateAspectProperties;

@Aspect(className = Predicate.class)
@SuppressWarnings("all")
public abstract class PredicateAspect {
  @Step
  @Abstract
  public static boolean eval(final Predicate _self) {
    final smarthome.aspects.PredicateAspectPredicateAspectProperties _self_ = smarthome.aspects.PredicateAspectPredicateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof smarthome.PersonPredicate){
    					result = smarthome.aspects.PersonPredicateAspect.eval((smarthome.PersonPredicate)_self);
    } else  if (_self instanceof smarthome.SensorPredicate){
    					result = smarthome.aspects.SensorPredicateAspect.eval((smarthome.SensorPredicate)_self);
    } else  if (_self instanceof smarthome.Predicate){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							addToResult(smarthome.aspects.PredicateAspect._privk3_eval(_self_, (smarthome.Predicate)_self));
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Predicate","eval");
    					} else {
    						command.execute();
    					}
    					result = command.getResult();
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final PredicateAspectPredicateAspectProperties _self_, final Predicate _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
