package MedicalSystem;
import java.util.*;

public class RegulatoryConstraint001 extends Constraint001 {
	
    private String description = "Ensures battery level is sufficient";

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
