package MedicalSystems;

public class SystemInitializer {
    public static void main(String[] args) {
    
	            Drone droneAlpha = new Drone("droneAlpha", "127.0.0.11", "serialNusmberss");
	            Drone droneBeta = new Drone("droneBeta", "127.0.0.1", "wfqwwqffqwdsq");
	            DroneGroup droneGroupAlpha = new DroneGroup("droneGroupAlpha", Arrays.asList(droneAlpha, droneBeta));
	            Action action001 = new Action("action001", "scan things", "Scan");
	            // Unknown entity: Constraint
	            Constraint permissionConstraint001 = new PermissionConstraint("permissionConstraint001", "Ensures battery level is sufficient");
	            Constraint regulatoryConstraint001 = new RegulatoryConstraint("regulatoryConstraint001", "Ensures battery level is sufficient");
	            Mission Test = new Mission("Test", droneGroupAlpha, Arrays.asList(action001), Arrays.asList(permissionConstraint001));
	            Mission MedicalDelivery = new Mission("MedicalDelivery", droneGroupAlpha, Arrays.asList(action001, Test), Arrays.asList(permissionConstraint001));
	    
	            System.out.println("System MedicalSystems initialized.");
	        }
}
