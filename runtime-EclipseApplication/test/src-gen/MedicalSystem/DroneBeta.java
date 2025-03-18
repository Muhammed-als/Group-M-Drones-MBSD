package MedicalSystem;

public class DroneBeta {
private String type;
private float batterCapacity;
private float maxFlightTime;
private float payloadCapacity;
private String role;
private List energyModels;
                 // Constructor with all attributes
                 	// ensures that the parameters are comma-separated
                 	// https://eclipse.dev/Xtext/xtend/documentation/203_xtend_expressions.html
                     public DroneBeta(String type, float batterCapacity, float maxFlightTime, float payloadCapacity, String role, List energyModels) {
 	                    this.type = type;
 	                    this.batterCapacity = batterCapacity;
 	                    this.maxFlightTime = maxFlightTime;
 	                    this.payloadCapacity = payloadCapacity;
 	                    this.role = role;
 	                    this.energyModels = energyModels;
                 	}
public void setType(String type) {
    this.type = type;
}

public String getType() {
    return this.type;
}
public void setBatterCapacity(float batterCapacity) {
    this.batterCapacity = batterCapacity;
}

public float getBatterCapacity() {
    return this.batterCapacity;
}
public void setMaxFlightTime(float maxFlightTime) {
    this.maxFlightTime = maxFlightTime;
}

public float getMaxFlightTime() {
    return this.maxFlightTime;
}
public void setPayloadCapacity(float payloadCapacity) {
    this.payloadCapacity = payloadCapacity;
}

public float getPayloadCapacity() {
    return this.payloadCapacity;
}
public void setRole(String role) {
    this.role = role;
}

public String getRole() {
    return this.role;
}
public void setEnergyModels(List energyModels) {
    this.energyModels = energyModels;
}

public List getEnergyModels() {
    return this.energyModels;
}
}
