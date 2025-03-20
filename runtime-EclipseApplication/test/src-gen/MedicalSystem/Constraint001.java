    package MedicalSystem;
    import java.util.List;
    import java.util.ArrayList;
    
    public class Constraint001  {
        private String constraintType;
        private String description;

        public Constraint001(            String constraintType, String description) {


            this.constraintType = constraintType;
            this.description = description;
        }

        public void setConstraintType(String constraintType) {
            this.constraintType = constraintType;
        }
	
        public String getConstraintType() {
            return this.constraintType;
        }
        public void setDescription(String description) {
            this.description = description;
        }
	
        public String getDescription() {
            return this.description;
        }
    }
