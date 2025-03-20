    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class EnergyModelB  {
        private float consumptionRate;
        private float batteryHealth;
        private float rechargeTime;

        public EnergyModelB(            float consumptionRate, float batteryHealth, float rechargeTime) {


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
