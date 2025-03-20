    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class MedicalDelivery  {
        private String missionID;
        private String missionType;
        private String startLocation;
        private String endLocation;
        private int priority;
        private float estimatedTime;
        private List<Object> drones;
        private List<Object> phases;
        private List<Object> constraints;
        private List<Object> events;

        public MedicalDelivery(            String missionID, String missionType, String startLocation, String endLocation, int priority, float estimatedTime, List<Object> drones, List<Object> phases, List<Object> constraints, List<Object> events) {


            this.missionID = missionID;
            this.missionType = missionType;
            this.startLocation = startLocation;
            this.endLocation = endLocation;
            this.priority = priority;
            this.estimatedTime = estimatedTime;
            this.drones = drones;
            this.phases = phases;
            this.constraints = constraints;
            this.events = events;
        }

        public void setMissionID(String missionID) {
            this.missionID = missionID;
        }
	
        public String getMissionID() {
            return this.missionID;
        }
        public void setMissionType(String missionType) {
            this.missionType = missionType;
        }
	
        public String getMissionType() {
            return this.missionType;
        }
        public void setStartLocation(String startLocation) {
            this.startLocation = startLocation;
        }
	
        public String getStartLocation() {
            return this.startLocation;
        }
        public void setEndLocation(String endLocation) {
            this.endLocation = endLocation;
        }
	
        public String getEndLocation() {
            return this.endLocation;
        }
        public void setPriority(int priority) {
            this.priority = priority;
        }
	
        public int getPriority() {
            return this.priority;
        }
        public void setEstimatedTime(float estimatedTime) {
            this.estimatedTime = estimatedTime;
        }
	
        public float getEstimatedTime() {
            return this.estimatedTime;
        }
        public void setDrones(List<Object> drones) {
            this.drones = drones;
        }
	
        public List<Object> getDrones() {
            return this.drones;
        }
        public void setPhases(List<Object> phases) {
            this.phases = phases;
        }
	
        public List<Object> getPhases() {
            return this.phases;
        }
        public void setConstraints(List<Object> constraints) {
            this.constraints = constraints;
        }
	
        public List<Object> getConstraints() {
            return this.constraints;
        }
        public void setEvents(List<Object> events) {
            this.events = events;
        }
	
        public List<Object> getEvents() {
            return this.events;
        }
    }
