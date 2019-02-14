package model.aspects;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate;
import java.util.Map;
import model.aspects.PredicateAspectPredicateAspectProperties;

@SuppressWarnings("all")
public class PredicateAspectPredicateAspectContext {
  public final static PredicateAspectPredicateAspectContext INSTANCE = new PredicateAspectPredicateAspectContext();
  
  public static PredicateAspectPredicateAspectProperties getSelf(final Predicate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new model.aspects.PredicateAspectPredicateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Predicate, PredicateAspectPredicateAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.alexisc.smarthomedsl.model.model.Predicate, model.aspects.PredicateAspectPredicateAspectProperties>();
  
  public Map<Predicate, PredicateAspectPredicateAspectProperties> getMap() {
    return map;
  }
}
