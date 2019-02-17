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
  public static boolean eval(final Rule _self, final long currentTime) {
    final smarthome.aspects.RuleAspectRuleAspectProperties _self_ = smarthome.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval(long)
    if (_self instanceof smarthome.Rule){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.RuleAspect._privk3_eval(_self_, (smarthome.Rule)_self,currentTime));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {currentTime}, command, "Rule", "eval");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  public static String debug(final Rule _self) {
    final smarthome.aspects.RuleAspectRuleAspectProperties _self_ = smarthome.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String debug()
    if (_self instanceof smarthome.Rule){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.RuleAspect._privk3_debug(_self_, (smarthome.Rule)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Rule", "debug");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.String)result;
  }
  
  protected static boolean _privk3_eval(final RuleAspectRuleAspectProperties _self_, final Rule _self, final long currentTime) {
    EList<Predicate> _predicates = _self.getPredicates();
    for (final Predicate p : _predicates) {
      boolean _eval = PredicateAspect.eval(p);
      boolean _not = (!_eval);
      if (_not) {
        DurationAspect.reset(_self.getDuration(), currentTime);
        return false;
      }
    }
    return DurationAspect.isDone(_self.getDuration(), currentTime);
  }
  
  protected static String _privk3_debug(final RuleAspectRuleAspectProperties _self_, final Rule _self) {
    final StringBuilder sb = new StringBuilder();
    sb.append("{");
    EList<Predicate> _predicates = _self.getPredicates();
    for (final Predicate p : _predicates) {
      sb.append(PredicateAspect.debug(p));
    }
    sb.append("}");
    return sb.toString();
  }
}
