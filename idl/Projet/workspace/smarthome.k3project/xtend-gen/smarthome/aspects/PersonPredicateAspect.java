package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.PersonPredicate;
import smarthome.aspects.PersonAspect;
import smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties;
import smarthome.aspects.PredicateAspect;

@Aspect(className = PersonPredicate.class)
@SuppressWarnings("all")
public class PersonPredicateAspect extends PredicateAspect {
  @Step
  public static boolean eval(final PersonPredicate _self) {
    final smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties _self_ = smarthome.aspects.PersonPredicateAspectPersonPredicateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof smarthome.PersonPredicate){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							addToResult(smarthome.aspects.PersonPredicateAspect._privk3_eval(_self_, (smarthome.PersonPredicate)_self));
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"PersonPredicate","eval");
    					} else {
    						command.execute();
    					}
    					result = command.getResult();
    					;
    } else  if (_self instanceof smarthome.Predicate){
    					result = smarthome.aspects.PredicateAspect.eval((smarthome.Predicate)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final PersonPredicateAspectPersonPredicateAspectProperties _self_, final PersonPredicate _self) {
    return PersonAspect.getCurrentActivity(_self.getPerson()).equals(_self.getActivity());
  }
}
