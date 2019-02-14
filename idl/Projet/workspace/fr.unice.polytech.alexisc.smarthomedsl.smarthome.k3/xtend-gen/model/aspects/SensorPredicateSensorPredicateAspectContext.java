package model.aspects;

import java.util.Map;
import model.aspects.SensorPredicate;
import model.aspects.SensorPredicateSensorPredicateAspectProperties;

@SuppressWarnings("all")
public class SensorPredicateSensorPredicateAspectContext {
  public final static SensorPredicateSensorPredicateAspectContext INSTANCE = new SensorPredicateSensorPredicateAspectContext();
  
  public static SensorPredicateSensorPredicateAspectProperties getSelf(final SensorPredicate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new model.aspects.SensorPredicateSensorPredicateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SensorPredicate, SensorPredicateSensorPredicateAspectProperties> map = new java.util.WeakHashMap<model.aspects.SensorPredicate, model.aspects.SensorPredicateSensorPredicateAspectProperties>();
  
  public Map<SensorPredicate, SensorPredicateSensorPredicateAspectProperties> getMap() {
    return map;
  }
}
