package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import smarthome.Room;
import smarthome.aspects.NamedEntityAspect;

@Aspect(className = Room.class)
@SuppressWarnings("all")
public class RoomAspect extends NamedEntityAspect {
}
