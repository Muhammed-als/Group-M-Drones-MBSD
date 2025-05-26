
package main.metamodel;

import java.util.List;

public class Mission {
    private String name;
    private DroneGroup droneGroup;
    private List<ActionElement> actions;
    private List<Constraint> constraints;
    public Mission(String name, DroneGroup droneGroup, List<ActionElement> actions, List<Constraint> constraints){
        this.name = name;
        this.droneGroup = droneGroup;
        this.actions = actions;
        this.constraints = constraints;
    }
    public String getName() {
        return name;
    }
    public DroneGroup getDroneGroup() {
        return droneGroup;
    }
    public List<ActionElement> getActions() {
        return actions;
    }
    public List<Constraint> getConstraints() {
        return constraints;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDroneGroup(DroneGroup droneGroup) {
        this.droneGroup = droneGroup;
    }
    public void setActions(List<ActionElement> actions) {
        this.actions = actions;
    }
    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }
    @Override
    public String toString() {
        return "Mission{" + "name='" + name + '\'' + ", droneGroup=" + droneGroup + ", actions=" + actions + ", constraints=" + constraints + '}';
    }
}
