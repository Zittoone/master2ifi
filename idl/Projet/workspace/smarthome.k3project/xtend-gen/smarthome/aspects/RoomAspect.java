package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import smarthome.Room;
import smarthome.Sensor;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.RoomAspectRoomAspectProperties;
import smarthome.aspects.SensorAspect;

@Aspect(className = Room.class)
@SuppressWarnings("all")
public class RoomAspect extends NamedEntityAspect {
  @Step
  public static void init(final Room _self) {
    final smarthome.aspects.RoomAspectRoomAspectProperties _self_ = smarthome.aspects.RoomAspectRoomAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_init(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Room","init");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void tick(final Room _self) {
    final smarthome.aspects.RoomAspectRoomAspectProperties _self_ = smarthome.aspects.RoomAspectRoomAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_tick(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Room","tick");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_init(final RoomAspectRoomAspectProperties _self_, final Room _self) {
    EList<Sensor> _sensors = _self.getSensors();
    for (final Sensor s : _sensors) {
      SensorAspect.init(s);
    }
  }
  
  protected static void _privk3_tick(final RoomAspectRoomAspectProperties _self_, final Room _self) {
    EList<Sensor> _sensors = _self.getSensors();
    for (final Sensor s : _sensors) {
      SensorAspect.tick(s);
    }
  }
}
