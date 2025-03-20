    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class DroneAlpha  {
        private String type;
        private float batterCapacity;
        private float maxFlightTime;
        private float payloadCapacity;
        private String role;
        private List<Object> energyModels;

        public DroneAlpha(            String type, float batterCapacity, float maxFlightTime, float payloadCapacity, String role, List<Object> energyModels) {


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
        public void setEnergyModels(List<Object> energyModels) {
            this.energyModels = energyModels;
        }
	
        public List<Object> getEnergyModels() {
            return this.energyModels;
        }
    }
