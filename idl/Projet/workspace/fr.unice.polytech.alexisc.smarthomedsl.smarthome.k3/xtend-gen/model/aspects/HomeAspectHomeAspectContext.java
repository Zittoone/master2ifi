package model.aspects;

import fr.unice.polytech.alexisc.smarthomedsl.model.model.Home;
import java.util.Map;
import model.aspects.HomeAspectHomeAspectProperties;

@SuppressWarnings("all")
public class HomeAspectHomeAspectContext {
  public final static HomeAspectHomeAspectContext INSTANCE = new HomeAspectHomeAspectContext();
  
  public static HomeAspectHomeAspectProperties getSelf(final Home _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new model.aspects.HomeAspectHomeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Home, HomeAspectHomeAspectProperties> map = new java.util.WeakHashMap<fr.unice.polytech.alexisc.smarthomedsl.model.model.Home, model.aspects.HomeAspectHomeAspectProperties>();
  
  public Map<Home, HomeAspectHomeAspectProperties> getMap() {
    return map;
  }
}
