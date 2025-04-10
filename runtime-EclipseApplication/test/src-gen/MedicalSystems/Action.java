package MedicalSystems;
import java.util.*;

public class Action  {
    private String type;
    private String description;
    
    // Constructor
        public Action(String type, String description) {
	            this.type = type;
	            this.description = description;
	        }

public void setType(String type) {
    this.type = type;
}
	
public String getType() {
    return this.type;
}
public void setDescription(String description) {
    this.description = description;
}
	
public String getDescription() {
    return this.description;
}
}
