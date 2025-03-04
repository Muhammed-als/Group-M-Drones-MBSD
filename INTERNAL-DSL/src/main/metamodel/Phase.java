package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class Phase {
    private String phaseType;
    private float energyUsage;
    private List<SubPhase> subPhases = new ArrayList<>();

    public Phase(String phaseType) {
        this.phaseType = phaseType;
    }

    public Phase setEnergyUsage(float usage) {
        this.energyUsage = usage;
        return this;
    }

    public Phase addSubPhase(SubPhase subPhase) {
        this.subPhases.add(subPhase);
        return this;
    }

    @Override
    public String toString() {
        return "Phase{" +
                "phaseType='" + phaseType + '\'' +
                ", energyUsage=" + energyUsage +
                ", subPhases=" + subPhases +
                '}';
    }
}
