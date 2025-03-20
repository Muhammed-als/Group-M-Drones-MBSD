    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class SafetyConstraint001 extends Constraint001 {
        private float minBattery;
        private float maxWindSpeed;

        public SafetyConstraint001(
        String constraintType, String description,
            float minBattery, float maxWindSpeed) {

            super(constraintType, description);

            this.minBattery = minBattery;
            this.maxWindSpeed = maxWindSpeed;
        }

        public void setMinBattery(float minBattery) {
            this.minBattery = minBattery;
        }
	
        public float getMinBattery() {
            return this.minBattery;
        }
        public void setMaxWindSpeed(float maxWindSpeed) {
            this.maxWindSpeed = maxWindSpeed;
        }
	
        public float getMaxWindSpeed() {
            return this.maxWindSpeed;
        }
    }
