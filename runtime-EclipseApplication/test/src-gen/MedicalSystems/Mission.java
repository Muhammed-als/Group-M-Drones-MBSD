package MedicalSystems;
import java.util.*;

public class Mission  {
    private DroneGroup droneGroup;
    private List<Object> actions;
    private List<Constraint> constraints;
    
    // Constructor
        public Mission(DroneGroup droneGroup, List<Object> actions, List<Constraint> constraints) {
	            this.droneGroup = droneGroup;
	            this.actions = actions;
	            this.constraints = constraints;
	        }

public void setDroneGroup(DroneGroup droneGroup) {
    this.droneGroup = droneGroup;
}
	
public DroneGroup getDroneGroup() {
    return this.droneGroup;
}
public void setActions(List<Object> actions) {
    this.actions = actions;
}
	
public List<Object> getActions() {
    return this.actions;
}
public void setConstraints(List<Constraint> constraints) {
    this.constraints = constraints;
}
	
public List<Constraint> getConstraints() {
    return this.constraints;
}
}
