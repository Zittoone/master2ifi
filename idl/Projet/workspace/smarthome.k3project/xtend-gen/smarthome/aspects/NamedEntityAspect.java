package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.NamedEntity;
import smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties;

@Aspect(className = NamedEntity.class)
@SuppressWarnings("all")
public abstract class NamedEntityAspect {
  @Step
  public static String toString(final NamedEntity _self) {
    final smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties _self_ = smarthome.aspects.NamedEntityAspectNamedEntityAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof smarthome.NamedEntity){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							addToResult(smarthome.aspects.NamedEntityAspect._privk3_toString(_self_, (smarthome.NamedEntity)_self));
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"NamedEntity","toString");
    					} else {
    						command.execute();
    					}
    					result = command.getResult();
    					;
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static String _privk3_toString(final NamedEntityAspectNamedEntityAspectProperties _self_, final NamedEntity _self) {
    String _name = _self.getName();
    return ("name=" + _name);
  }
}
