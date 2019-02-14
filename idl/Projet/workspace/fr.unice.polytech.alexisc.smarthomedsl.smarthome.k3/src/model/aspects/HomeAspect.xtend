package model.aspects

import fr.unice.polytech.alexisc.smarthomedsl.model.model.Home
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Room

import static extension model.aspects.SensorAspect.*
import static extension model.aspects.ActivityAspect.*
import fr.unice.polytech.alexisc.smarthomedsl.model.model.Sensor
import java.util.List
import java.util.ArrayList

@Aspect(className=Home)
class HomeAspect {
	
	@Main
	def void doIt(){
		
		val sensors = new ArrayList<Sensor>()
			
		for(Room r : _self.rooms) {
			for(Sensor s : r.sensors) {
				
			}
		}
	}
	
	

}