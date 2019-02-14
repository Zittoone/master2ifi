package model.aspects;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.Room;
import java.util.Map;
import model.aspects.RoomAspectRoomAspectProperties;

@SuppressWarnings("all")
public class RoomAspectRoomAspectContext {
  public final static RoomAspectRoomAspectContext INSTANCE = new RoomAspectRoomAspectContext();
  
  public static RoomAspectRoomAspectProperties getSelf(final Room _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new model.aspects.RoomAspectRoomAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Room, RoomAspectRoomAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.alexisc.smarthomedsl.model.model.Room, model.aspects.RoomAspectRoomAspectProperties>();
  
  public Map<Room, RoomAspectRoomAspectProperties> getMap() {
    return map;
  }
}
