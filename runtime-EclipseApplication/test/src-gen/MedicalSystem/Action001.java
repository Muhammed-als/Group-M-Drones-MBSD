    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class Action001  {
        private String actionType;
        private String inputOutput;
        private float energyUsage;

        public Action001(            String actionType, String inputOutput, float energyUsage) {


            this.actionType = actionType;
            this.inputOutput = inputOutput;
            this.energyUsage = energyUsage;
        }

        public void setActionType(String actionType) {
            this.actionType = actionType;
        }
	
        public String getActionType() {
            return this.actionType;
        }
        public void setInputOutput(String inputOutput) {
            this.inputOutput = inputOutput;
        }
	
        public String getInputOutput() {
            return this.inputOutput;
        }
        public void setEnergyUsage(float energyUsage) {
            this.energyUsage = energyUsage;
        }
	
        public float getEnergyUsage() {
            return this.energyUsage;
        }
    }
