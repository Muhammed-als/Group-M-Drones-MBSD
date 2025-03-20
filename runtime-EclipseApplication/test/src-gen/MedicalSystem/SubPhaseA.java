    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class SubPhaseA  {
        private String subPhaseType;
        private float duration;
        private List<Object> actions;

        public SubPhaseA(            String subPhaseType, float duration, List<Object> actions) {


            this.subPhaseType = subPhaseType;
            this.duration = duration;
            this.actions = actions;
        }

        public void setSubPhaseType(String subPhaseType) {
            this.subPhaseType = subPhaseType;
        }
	
        public String getSubPhaseType() {
            return this.subPhaseType;
        }
        public void setDuration(float duration) {
            this.duration = duration;
        }
	
        public float getDuration() {
            return this.duration;
        }
        public void setActions(List<Object> actions) {
            this.actions = actions;
        }
	
        public List<Object> getActions() {
            return this.actions;
        }
    }
