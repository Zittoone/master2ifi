package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import smarthome.Pattern;
import smarthome.Rule;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.PatternAspectPatternAspectProperties;
import smarthome.aspects.RuleAspect;

@Aspect(className = Pattern.class)
@SuppressWarnings("all")
public class PatternAspect extends NamedEntityAspect {
  @Step
  public static boolean eval(final Pattern _self) {
    final smarthome.aspects.PatternAspectPatternAspectProperties _self_ = smarthome.aspects.PatternAspectPatternAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_eval(_self_, _self));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Pattern","eval");
    } else {
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final PatternAspectPatternAspectProperties _self_, final Pattern _self) {
    EList<Rule> _rules = _self.getRules();
    for (final Rule r : _rules) {
      boolean _eval = RuleAspect.eval(r);
      boolean _not = (!_eval);
      if (_not) {
        return false;
      }
    }
    return true;
  }
}
