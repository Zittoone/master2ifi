package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Operator;
import smarthome.SensorPredicate;
import smarthome.aspects.PredicateAspect;
import smarthome.aspects.SensorAspect;
import smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties;

@Aspect(className = SensorPredicate.class)
@SuppressWarnings("all")
public class SensorPredicateAspect extends PredicateAspect {
  @Step
  public static boolean eval(final SensorPredicate _self) {
    final smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties _self_ = smarthome.aspects.SensorPredicateAspectSensorPredicateAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof smarthome.SensorPredicate){
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    						@Override
    						public void execute() {
    							addToResult(smarthome.aspects.SensorPredicateAspect._privk3_eval(_self_, (smarthome.SensorPredicate)_self));
    						}
    					};
    					fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    					if (stepManager != null) {
    						stepManager.executeStep(_self,command,"SensorPredicate","eval");
    					} else {
    						command.execute();
    					}
    					result = command.getResult();
    					;
    } else  if (_self instanceof smarthome.Predicate){
    					result = smarthome.aspects.PredicateAspect.eval((smarthome.Predicate)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final SensorPredicateAspectSensorPredicateAspectProperties _self_, final SensorPredicate _self) {
    Operator _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case EQUAL:
          Double _currentValue = SensorAspect.currentValue(_self.getSensor());
          double _value = _self.getValue();
          return ((_currentValue).doubleValue() == _value);
        case SUPERIOR:
          Double _currentValue_1 = SensorAspect.currentValue(_self.getSensor());
          double _value_1 = _self.getValue();
          return ((_currentValue_1).doubleValue() > _value_1);
        case INFERIOR:
          Double _currentValue_2 = SensorAspect.currentValue(_self.getSensor());
          double _value_2 = _self.getValue();
          return ((_currentValue_2).doubleValue() < _value_2);
        default:
          break;
      }
    }
    return false;
  }
}
