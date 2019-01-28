package model.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Activity;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Home;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Room;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor;
import model.aspects.ActivityAspect;
import model.aspects.HomeAspectHomeAspectProperties;
import model.aspects.SensorAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Home.class)
@SuppressWarnings("all")
public class HomeAspect {
  @Main
  public static void doIt(final Home _self) {
    final model.aspects.HomeAspectHomeAspectProperties _self_ = model.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void doIt()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Home){
    	model.aspects.HomeAspect._privk3_doIt(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Home)_self);
    };
  }
  
  protected static void _privk3_doIt(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    EList<Room> _rooms = _self.getRooms();
    for (final Room r : _rooms) {
      EList<Sensor> _sensors = r.getSensors();
      for (final Sensor s : _sensors) {
        SensorAspect.exec(s);
      }
    }
    EList<Activity> _activities = _self.getActivities();
    for (final Activity a : _activities) {
      ActivityAspect.exec(a);
    }
  }
}
