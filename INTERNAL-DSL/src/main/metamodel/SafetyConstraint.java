package main.metamodel;

public class SafetyConstraint extends Constraint {
    private float minBattery, maxWindSpeed;

    public SafetyConstraint(float minBattery, float maxWindSpeed) {
        super("Safety", "Min Battery: " + minBattery + ", Max Wind Speed: " + maxWindSpeed);
        this.minBattery = minBattery;
        this.maxWindSpeed = maxWindSpeed;
    }

    public float getMinBattery() {
        return minBattery;
    }

    public float getMaxWindSpeed() {
        return maxWindSpeed;
    }

    public void setMinBattery(float minBattery) {
        this.minBattery = minBattery;
    }

    public void setMaxWindSpeed(float maxWindSpeed) {
        this.maxWindSpeed = maxWindSpeed;
    }

    @Override
    public String toString() {
        return "SafetyConstraint{" +
                "minBattery=" + minBattery +
                ", maxWindSpeed=" + maxWindSpeed +
                "}";
    }
}
