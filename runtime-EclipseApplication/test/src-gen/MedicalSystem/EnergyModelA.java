package MedicalSystem;

public class EnergyModelA {
private float consumptionRate;
private float batteryHealth;
private float rechargeTime;
                 // Constructor with all attributes
                 	// ensures that the parameters are comma-separated
                 	// https://eclipse.dev/Xtext/xtend/documentation/203_xtend_expressions.html
                     public EnergyModelA(float consumptionRate, float batteryHealth, float rechargeTime) {
 	                    this.consumptionRate = consumptionRate;
 	                    this.batteryHealth = batteryHealth;
 	                    this.rechargeTime = rechargeTime;
                 	}
public void setConsumptionRate(float consumptionRate) {
    this.consumptionRate = consumptionRate;
}

public float getConsumptionRate() {
    return this.consumptionRate;
}
public void setBatteryHealth(float batteryHealth) {
    this.batteryHealth = batteryHealth;
}

public float getBatteryHealth() {
    return this.batteryHealth;
}
public void setRechargeTime(float rechargeTime) {
    this.rechargeTime = rechargeTime;
}

public float getRechargeTime() {
    return this.rechargeTime;
}
}
