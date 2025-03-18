package MedicalSystem;

public class MedicalDelivery {
private String missionID;
private String missionType;
private String startLocation;
private String endLocation;
private int priority;
private float estimatedTime;
private List drones;
private List phases;
private List constraints;
private List events;
                 // Constructor with all attributes
                 	// ensures that the parameters are comma-separated
                 	// https://eclipse.dev/Xtext/xtend/documentation/203_xtend_expressions.html
                     public MedicalDelivery(String missionID, String missionType, String startLocation, String endLocation, int priority, float estimatedTime, List drones, List phases, List constraints, List events) {
 	                    this.missionID = missionID;
 	                    this.missionType = missionType;
 	                    this.startLocation = startLocation;
 	                    this.endLocation = endLocation;
 	                    this.priority = priority;
 	                    this.estimatedTime = estimatedTime;
 	                    this.drones = drones;
 	                    this.phases = phases;
 	                    this.constraints = constraints;
 	                    this.events = events;
                 	}
public void setMissionID(String missionID) {
    this.missionID = missionID;
}

public String getMissionID() {
    return this.missionID;
}
public void setMissionType(String missionType) {
    this.missionType = missionType;
}

public String getMissionType() {
    return this.missionType;
}
public void setStartLocation(String startLocation) {
    this.startLocation = startLocation;
}

public String getStartLocation() {
    return this.startLocation;
}
public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
}

public String getEndLocation() {
    return this.endLocation;
}
public void setPriority(int priority) {
    this.priority = priority;
}

public int getPriority() {
    return this.priority;
}
public void setEstimatedTime(float estimatedTime) {
    this.estimatedTime = estimatedTime;
}

public float getEstimatedTime() {
    return this.estimatedTime;
}
public void setDrones(List drones) {
    this.drones = drones;
}

public List getDrones() {
    return this.drones;
}
public void setPhases(List phases) {
    this.phases = phases;
}

public List getPhases() {
    return this.phases;
}
public void setConstraints(List constraints) {
    this.constraints = constraints;
}

public List getConstraints() {
    return this.constraints;
}
public void setEvents(List events) {
    this.events = events;
}

public List getEvents() {
    return this.events;
}
}
