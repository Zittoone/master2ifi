package model.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Room;
import model.aspects.NamedEntityAspect;
import model.aspects.RoomAspectRoomAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Room.class)
@SuppressWarnings("all")
public class RoomAspect extends NamedEntityAspect {
  @Step
  public static void exec(final Room _self) {
    final model.aspects.RoomAspectRoomAspectProperties _self_ = model.aspects.RoomAspectRoomAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Room){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			model.aspects.RoomAspect._privk3_exec(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Room)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Room", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final RoomAspectRoomAspectProperties _self_, final Room _self) {
    InputOutput.<String>println(_self.getName());
  }
}
