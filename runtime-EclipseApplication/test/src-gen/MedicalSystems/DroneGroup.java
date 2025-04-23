package MedicalSystems;
import java.util.*;

public class DroneGroup  {
    private List<Drone> drones;
    
    // Constructor
        public DroneGroup(List<Drone> drones) {
            this.drones = drones;
	        	}
public void setDrones(List<Drone> drones) {
    this.drones = drones;
}
		
public List<Drone> getDrones() {
    return this.drones;
}
	}
