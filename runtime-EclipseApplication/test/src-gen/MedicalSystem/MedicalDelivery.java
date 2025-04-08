package MedicalSystem;
import java.util.*;

public class MedicalDelivery  {
	
    private Object droneGroup = new DroneGroupAlpha();
    private List<Object> actions = Arrays.asList(new Action001(), new Test());
    private List<Object> constraints = Arrays.asList(new PermissionConstraint001());

    public void setDroneGroup(Object droneGroup) {
        this.droneGroup = droneGroup;
    }

    public Object getDroneGroup() {
        return this.droneGroup;
    }
    public void setActions(List<Object> actions) {
        this.actions = actions;
    }

    public List<Object> getActions() {
        return this.actions;
    }
    public void setConstraints(List<Object> constraints) {
        this.constraints = constraints;
    }

    public List<Object> getConstraints() {
        return this.constraints;
    }
}
