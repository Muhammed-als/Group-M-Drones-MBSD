
package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class Mission {
    private String missionID, missionType, startLocation, endLocation;
    private int priority;
    private float estimatedTime;
    private List<Drone> drones = new ArrayList<>();
    private List<Phase> phases = new ArrayList<>();
    private List<Constraint> constraints = new ArrayList<>();
    private List<MissionEvent> events = new ArrayList<>();

    public Mission(String missionID, String missionType) {
        this.missionID = missionID;
        this.missionType = missionType;
    }

    public String getMissionID() {
        return missionID;
    }

    public String getMissionType() {
        return missionType;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public int getPriority() {
        return priority;
    }

    public float getEstimatedTime() {
        return estimatedTime;
    }

    public List<Drone> getDrones() {
        return drones;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public List<MissionEvent> getEvents() {
        return events;
    }

    public Mission setStartLocation(String loc) {
        this.startLocation = loc;
        return this;
    }

    public Mission setEndLocation(String loc) {
        this.endLocation = loc;
        return this;
    }

    public Mission setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public Mission setEstimatedTime(float time) {
        this.estimatedTime = time;
        return this;
    }

    public Mission addPhase(Phase phase) {
        this.phases.add(phase);
        return this;
    }

    public Mission addDrone(Drone drone) {
        this.drones.add(drone);
        return this;
    }

    public Mission addConstraint(Constraint constraint) {
        this.constraints.add(constraint);
        return this;
    }

    public Mission addEvent(MissionEvent event) {
        events.add(event);
        return this;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "missionID='" + missionID + '\'' +
                ", missionType='" + missionType + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                ", priority=" + priority +
                ", estimatedTime=" + estimatedTime +
                ", phases=" + phases +
                ", drones=" + drones +
                ", constraints=" + constraints +
                ", events=" + events +
                '}';
    }
}
