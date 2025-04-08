package MedicalSystem;
import java.util.*;

public class DroneGroupAlpha  {
	
    private List<Object> drones = Arrays.asList(new DroneAlpha(), new DroneBeta());

    public void setDrones(List<Object> drones) {
        this.drones = drones;
    }

    public List<Object> getDrones() {
        return this.drones;
    }
}
