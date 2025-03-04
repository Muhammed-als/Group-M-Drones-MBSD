package main.metamodel;

public class EnergyModel {
    private float consumptionRate, batteryHealth, rechargeTime;

    public EnergyModel(float consumptionRate, float batteryHealth, float rechargeTime) {
        this.consumptionRate = consumptionRate;
        this.batteryHealth = batteryHealth;
        this.rechargeTime = rechargeTime;
    }

    public float getConsumptionRate() {
        return consumptionRate;
    }

    public float getBatteryHealth() {
        return batteryHealth;
    }

    public float getRechargeTime() {
        return rechargeTime;
    }

    public void setConsumptionRate(float consumptionRate) {
        this.consumptionRate = consumptionRate;
    }

    public void setBatteryHealth(float batteryHealth) {
        this.batteryHealth = batteryHealth;
    }

    public void setRechargeTime(float rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    @Override
    public String toString() {
        return "EnergyModel{" +
                "consumptionRate=" + consumptionRate +
                ", batteryHealth=" + batteryHealth +
                ", rechargeTime=" + rechargeTime +
                '}';
    }

}
