package main.metamodel;

public class Action {
    private String actionType, inputOutput;
    private float energyUsage;

    public Action(String actionType, String inputOutput, float energyUsage) {
        this.actionType = actionType;
        this.inputOutput = inputOutput;
        this.energyUsage = energyUsage;
    }

    public String getActionType() {
        return actionType;
    }

    public String getInputOutput() {
        return inputOutput;
    }

    public float getEnergyUsage() {
        return energyUsage;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setInputOutput(String inputOutput) {
        this.inputOutput = inputOutput;
    }

    public void setEnergyUsage(float energyUsage) {
        this.energyUsage = energyUsage;
    }

    @Override
    public String toString() {
        return "Action{" +
                "actionType='" + actionType + '\'' +
                ", inputOutput='" + inputOutput + '\'' +
                ", energyUsage=" + energyUsage +
                '}';
    }
}
