package model.aspects;

import java.util.Map;
import model.aspects.PersonPredicate;
import model.aspects.PersonPredicatePersonPredicateAspectProperties;

@SuppressWarnings("all")
public class PersonPredicatePersonPredicateAspectContext {
  public final static PersonPredicatePersonPredicateAspectContext INSTANCE = new PersonPredicatePersonPredicateAspectContext();
  
  public static PersonPredicatePersonPredicateAspectProperties getSelf(final PersonPredicate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new model.aspects.PersonPredicatePersonPredicateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PersonPredicate, PersonPredicatePersonPredicateAspectProperties> map = new java.util.WeakHashMap<model.aspects.PersonPredicate, model.aspects.PersonPredicatePersonPredicateAspectProperties>();
  
  public Map<PersonPredicate, PersonPredicatePersonPredicateAspectProperties> getMap() {
    return map;
  }
}
