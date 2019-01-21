package model.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor;
import model.aspects.NamedEntityAspect;
import model.aspects.SensorAspectSensorAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Sensor.class)
@SuppressWarnings("all")
public class SensorAspect extends NamedEntityAspect {
  @Step
  public static void exec(final Sensor _self) {
    final model.aspects.SensorAspectSensorAspectProperties _self_ = model.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			model.aspects.SensorAspect._privk3_exec(_self_, (fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sensor", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    InputOutput.<String>println(_self.getName());
  }
}
