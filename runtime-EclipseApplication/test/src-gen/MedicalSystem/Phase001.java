    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class Phase001  {
        private String phaseType;
        private float energyUsage;
        private List<Object> subPhases;

        public Phase001(            String phaseType, float energyUsage, List<Object> subPhases) {


            this.phaseType = phaseType;
            this.energyUsage = energyUsage;
            this.subPhases = subPhases;
        }

        public void setPhaseType(String phaseType) {
            this.phaseType = phaseType;
        }
	
        public String getPhaseType() {
            return this.phaseType;
        }
        public void setEnergyUsage(float energyUsage) {
            this.energyUsage = energyUsage;
        }
	
        public float getEnergyUsage() {
            return this.energyUsage;
        }
        public void setSubPhases(List<Object> subPhases) {
            this.subPhases = subPhases;
        }
	
        public List<Object> getSubPhases() {
            return this.subPhases;
        }
    }
