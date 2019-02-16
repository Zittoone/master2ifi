package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
  
  @Step
  public static void debug(final Pattern _self) {
    final smarthome.aspects.PatternAspectPatternAspectProperties _self_ = smarthome.aspects.PatternAspectPatternAspectContext.getSelf(_self);
     if (_self instanceof smarthome.Pattern){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							smarthome.aspects.PatternAspect._privk3_debug(_self_, (smarthome.Pattern)_self);
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"Pattern","debug");
    					} else {
    						command.execute();
    					}
    					;
    } else  if (_self instanceof smarthome.NamedEntity){
    					smarthome.aspects.NamedEntityAspect.debug((smarthome.NamedEntity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @Step
  public static void exec(final Pattern _self) {
    final smarthome.aspects.PatternAspectPatternAspectProperties _self_ = smarthome.aspects.PatternAspectPatternAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_exec(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Pattern","exec");
    } else {
    	command.execute();
    }
    ;;
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
  
  protected static void _privk3_debug(final PatternAspectPatternAspectProperties _self_, final Pattern _self) {
    InputOutput.println();
    String _name = _self.getName();
    String _plus = ("Pattern[" + _name);
    /* (_plus + "]{"); */
    EList<Rule> _rules = _self.getRules();
    for (final Rule r : _rules) {
      {
        InputOutput.println();
        String _string = r.toString();
        /* ("\t" + _string); */
      }
    }
    InputOutput.<String>println("}");
  }
  
  protected static void _privk3_exec(final PatternAspectPatternAspectProperties _self_, final Pattern _self) {
    InputOutput.println();
    String _name = _self.getName();
    String _plus = ("Pattern[" + _name);
    /* (_plus + "] append !"); */
  }
}
