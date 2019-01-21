package model.aspects;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor;
import java.util.Map;
import model.aspects.SensorAspectSensorAspectProperties;

@SuppressWarnings("all")
public class SensorAspectSensorAspectContext {
  public final static SensorAspectSensorAspectContext INSTANCE = new SensorAspectSensorAspectContext();
  
  public static SensorAspectSensorAspectProperties getSelf(final Sensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new model.aspects.SensorAspectSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sensor, SensorAspectSensorAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor, model.aspects.SensorAspectSensorAspectProperties>();
  
  public Map<Sensor, SensorAspectSensorAspectProperties> getMap() {
    return map;
  }
}
