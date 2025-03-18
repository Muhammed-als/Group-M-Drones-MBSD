package MedicalSystem;

public class SubPhaseA {
private String subPhaseType;
private float duration;
private List actions;
                 // Constructor with all attributes
                 	// ensures that the parameters are comma-separated
                 	// https://eclipse.dev/Xtext/xtend/documentation/203_xtend_expressions.html
                     public SubPhaseA(String subPhaseType, float duration, List actions) {
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
public void setActions(List actions) {
    this.actions = actions;
}

public List getActions() {
    return this.actions;
}
}
