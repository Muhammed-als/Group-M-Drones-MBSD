    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class MissionEvent001  {
        private String eventType;
        private int impactLevel;
        private String responseAction;

        public MissionEvent001(            String eventType, int impactLevel, String responseAction) {


            this.eventType = eventType;
            this.impactLevel = impactLevel;
            this.responseAction = responseAction;
        }

        public void setEventType(String eventType) {
            this.eventType = eventType;
        }
	
        public String getEventType() {
            return this.eventType;
        }
        public void setImpactLevel(int impactLevel) {
            this.impactLevel = impactLevel;
        }
	
        public int getImpactLevel() {
            return this.impactLevel;
        }
        public void setResponseAction(String responseAction) {
            this.responseAction = responseAction;
        }
	
        public String getResponseAction() {
            return this.responseAction;
        }
    }
