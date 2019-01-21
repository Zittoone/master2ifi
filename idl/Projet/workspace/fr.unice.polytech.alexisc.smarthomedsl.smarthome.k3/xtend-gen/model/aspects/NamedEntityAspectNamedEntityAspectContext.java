package model.aspects;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity;
import java.util.Map;
import model.aspects.NamedEntityAspectNamedEntityAspectProperties;

@SuppressWarnings("all")
public class NamedEntityAspectNamedEntityAspectContext {
  public final static NamedEntityAspectNamedEntityAspectContext INSTANCE = new NamedEntityAspectNamedEntityAspectContext();
  
  public static NamedEntityAspectNamedEntityAspectProperties getSelf(final NamedEntity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new model.aspects.NamedEntityAspectNamedEntityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NamedEntity, NamedEntityAspectNamedEntityAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.alexisc.smarthomedsl.model.model.NamedEntity, model.aspects.NamedEntityAspectNamedEntityAspectProperties>();
  
  public Map<NamedEntity, NamedEntityAspectNamedEntityAspectProperties> getMap() {
    return map;
  }
}
