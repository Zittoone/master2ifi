package model.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity;
import model.aspects.NamedEntityAspectNamedEntityAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = NamedEntity.class)
@SuppressWarnings("all")
public class NamedEntityAspect {
  @Step
  public static void exec(final NamedEntity _self) {
    final model.aspects.NamedEntityAspectNamedEntityAspectProperties _self_ = model.aspects.NamedEntityAspectNamedEntityAspectContext.getSelf(_self);
    	// BeginInjectInto model.aspects.NamedEntityAspect#void exec() from model.aspects.RoomAspect
    		if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Room){
    			model.aspects.RoomAspect.exec((fr.unice.polytech.alexisc.smarthomedsl.model.model.Room)_self);
    		} else
    		// EndInjectInto model.aspects.NamedEntityAspect#void exec() from model.aspects.RoomAspect
    // #DispatchPointCut_before# void exec()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			model.aspects.NamedEntityAspect._privk3_exec(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "NamedEntity", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final NamedEntityAspectNamedEntityAspectProperties _self_, final NamedEntity _self) {
    InputOutput.<String>println(_self.getName());
  }
}
