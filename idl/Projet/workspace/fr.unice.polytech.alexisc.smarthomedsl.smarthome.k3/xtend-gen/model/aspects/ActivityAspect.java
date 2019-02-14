package model.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity;
import model.aspects.ActivityAspectActivityAspectProperties;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect {
  @Step
  public static void exec(final Activity _self) {
    final model.aspects.ActivityAspectActivityAspectProperties _self_ = model.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			model.aspects.ActivityAspect._privk3_exec(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Activity", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
  }
}
