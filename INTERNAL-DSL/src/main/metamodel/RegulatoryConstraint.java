package main.metamodel;

public class RegulatoryConstraint extends Constraint {
    private boolean flightPermission;
    private float altitudeLimit;

    public RegulatoryConstraint(boolean flightPermission, float altitudeLimit) {
        super("Regulatory", "Flight Permission: " + flightPermission + ", Altitude Limit: " + altitudeLimit);
        this.flightPermission = flightPermission;
        this.altitudeLimit = altitudeLimit;
    }

    public boolean isFlightPermission() {
        return flightPermission;
    }

    public float getAltitudeLimit() {
        return altitudeLimit;
    }

    public void setFlightPermission(boolean flightPermission) {
        this.flightPermission = flightPermission;
    }

    public void setAltitudeLimit(float altitudeLimit) {
        this.altitudeLimit = altitudeLimit;
    }

    @Override
    public String toString() {
        return "RegulatoryConstraint{" +
                "flightPermission=" + flightPermission +
                ", altitudeLimit=" + altitudeLimit +
                "}";
    }

}
