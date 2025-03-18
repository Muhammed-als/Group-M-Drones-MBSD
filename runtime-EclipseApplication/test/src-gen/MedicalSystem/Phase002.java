package MedicalSystem;

public class Phase002 {
private String phaseType;
private float energyUsage;
private List subPhases;
                 // Constructor with all attributes
                 	// ensures that the parameters are comma-separated
                 	// https://eclipse.dev/Xtext/xtend/documentation/203_xtend_expressions.html
                     public Phase002(String phaseType, float energyUsage, List subPhases) {
 	                    this.phaseType = phaseType;
 	                    this.energyUsage = energyUsage;
 	                    this.subPhases = subPhases;
                 	}
public void setPhaseType(String phaseType) {
    this.phaseType = phaseType;
}

public String getPhaseType() {
    return this.phaseType;
}
public void setEnergyUsage(float energyUsage) {
    this.energyUsage = energyUsage;
}

public float getEnergyUsage() {
    return this.energyUsage;
}
public void setSubPhases(List subPhases) {
    this.subPhases = subPhases;
}

public List getSubPhases() {
    return this.subPhases;
}
}
