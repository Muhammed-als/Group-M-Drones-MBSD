    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class RegulatoryConstraint001 extends Constraint001 {
        private boolean flightPermission;
        private int altitudeLimit;

        public RegulatoryConstraint001(
        String constraintType, String description,
            boolean flightPermission, int altitudeLimit) {

            super(constraintType, description);

            this.flightPermission = flightPermission;
            this.altitudeLimit = altitudeLimit;
        }

        public void setFlightPermission(boolean flightPermission) {
            this.flightPermission = flightPermission;
        }
	
        public boolean getFlightPermission() {
            return this.flightPermission;
        }
        public void setAltitudeLimit(int altitudeLimit) {
            this.altitudeLimit = altitudeLimit;
        }
	
        public int getAltitudeLimit() {
            return this.altitudeLimit;
        }
    }
