package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import smarthome.Predicate;
import smarthome.Rule;
import smarthome.aspects.DurationAspect;
import smarthome.aspects.PredicateAspect;
import smarthome.aspects.RuleAspectRuleAspectProperties;

@Aspect(className = Rule.class)
@SuppressWarnings("all")
public class RuleAspect {
  @Step
  public static boolean eval(final Rule _self) {
    final smarthome.aspects.RuleAspectRuleAspectProperties _self_ = smarthome.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_eval(_self_, _self));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Rule","eval");
    } else {
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final RuleAspectRuleAspectProperties _self_, final Rule _self) {
    EList<Predicate> _predicates = _self.getPredicates();
    for (final Predicate p : _predicates) {
      boolean _eval = PredicateAspect.eval(p);
      boolean _not = (!_eval);
      if (_not) {
        DurationAspect.reset(_self.getDuration());
        return false;
      }
    }
    return DurationAspect.isDone(_self.getDuration());
  }
}
