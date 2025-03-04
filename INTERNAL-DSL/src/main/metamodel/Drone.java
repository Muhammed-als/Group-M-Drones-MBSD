package main.metamodel;

public class Drone {
    private String modelType, role;
    private float batteryCapacity, maxFlightTime, payloadCapacity;
    private EnergyModel EnergyModel;

    public Drone(String modelType, float batteryCapacity, float maxFlightTime, float payloadCapacity, String role) {
        this.modelType = modelType;
        this.batteryCapacity = batteryCapacity;
        this.maxFlightTime = maxFlightTime;
        this.payloadCapacity = payloadCapacity;
        this.role = role;
    }

    public String getModelType() {
        return modelType;
    }

    public String getRole() {
        return role;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public float getMaxFlightTime() {
        return maxFlightTime;
    }

    public float getPayloadCapacity() {
        return payloadCapacity;
    }

    public EnergyModel getEnergyModel() {
        return EnergyModel;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMaxFlightTime(float maxFlightTime) {
        this.maxFlightTime = maxFlightTime;
    }

    public void setPayloadCapacity(float payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public void setEnergyModel(EnergyModel energyModel) {
        EnergyModel = energyModel;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "modelType='" + modelType + '\'' +
                ", role='" + role + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", maxFlightTime=" + maxFlightTime +
                ", payloadCapacity=" + payloadCapacity +
                '}';
    }
}
