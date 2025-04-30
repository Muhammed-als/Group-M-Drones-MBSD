import java.util.Arrays;
import MedicalSystems.Drone;
import MedicalSystems.DroneGroup;
import MedicalSystems.Action;
import MedicalSystems.Constraint;
import MedicalSystems.PermissionConstraint;
import MedicalSystems.RegulatoryConstraint;
import MedicalSystems.Mission;	
public class SystemInitializer {
	public SystemInitializer(){
		
	}
    public static void main(String[] args) {
    
	            Drone droneAlpha = new Drone("127.0.0.1", "serial numbers");
	            Drone droneBeta = new Drone("127.0.0.1", "wfqwwqffqwd");
	            DroneGroup droneGroupAlpha = new DroneGroup(Arrays.asList(droneAlpha, droneBeta));
	            Action action001 = new Action("scan things", "Scan");
	            Constraint permissionConstraint001 = new PermissionConstraint("Ensures battery level is sufficient");
	            Constraint regulatoryConstraint001 = new RegulatoryConstraint("Ensures battery level is sufficient");
	            Mission Test = new Mission(
	            droneGroupAlpha, 
	            Arrays.asList(action001), 
	            Arrays.asList(permissionConstraint001)
	            );
	            Mission MedicalDelivery = new Mission(
	            droneGroupAlpha, 
	            Arrays.asList(action001, Test, action001, Test, Test, Test), 
	            Arrays.asList(permissionConstraint001)
	            );
	    
	            System.out.println("System MedicalSystems initialized.");
	        }
}
