package MedicalSystems;
import java.util.*;

public class RegulatoryConstraint extends Constraint {
    private String description;
    
    // Constructor
        public RegulatoryConstraint(String description) {
	            this.description = description;
	        }

public void setDescription(String description) {
    this.description = description;
}
	
public String getDescription() {
    return this.description;
}
}
