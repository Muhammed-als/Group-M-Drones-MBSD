package MedicalSystems;
import java.util.*;

public class PermissionConstraint extends Constraint {
    private String description;
    
    // Constructor
        public PermissionConstraint(String description) {
	            this.description = description;
	        }

public void setDescription(String description) {
    this.description = description;
}
	
public String getDescription() {
    return this.description;
}
}
