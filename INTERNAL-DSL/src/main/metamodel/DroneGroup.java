package main.metamodel;

import java.util.List;

public class DroneGroup extends Entity {
    private String name;
    private List<Drone> drones;
    public DroneGroup(String name, List<Drone> drones){
        this.name = name;
        this.drones = drones;
    }
    public String getName() {
        return name;
    }
    public List<Drone> getDrones() {
        return drones;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDrones(List<Drone> drones) {
        this.drones = drones;
    }
    @Override
    public String toString() {
        return "DroneGroup [name=" + name + ", drones=" + drones + "]";
    }
}
