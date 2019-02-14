package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import smarthome.Home;
import smarthome.Room;
import smarthome.aspects.HomeAspectHomeAspectProperties;
import smarthome.aspects.RoomAspect;

@Aspect(className = Home.class)
@SuppressWarnings("all")
public class HomeAspect {
  @Main
  public static void doIt(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    _privk3_doIt(_self_, _self);;
  }
  
  @Step
  public static void tick(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_tick(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Home","tick");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_doIt(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    EList<Room> _rooms = _self.getRooms();
    for (final Room r : _rooms) {
      RoomAspect.init(r);
    }
  }
  
  protected static void _privk3_tick(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    EList<Room> _rooms = _self.getRooms();
    for (final Room r : _rooms) {
      RoomAspect.tick(r);
    }
  }
}
