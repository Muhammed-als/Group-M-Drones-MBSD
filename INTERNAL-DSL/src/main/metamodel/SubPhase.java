package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class SubPhase {
    private String subPhaseType;
    private float duration;
    private List<Action> actions = new ArrayList<>();

    public SubPhase(String type, float duration) {
        this.subPhaseType = type;
        this.duration = duration;
    }

    public String getSubPhaseType() {
        return subPhaseType;
    }

    public float getDuration() {
        return duration;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setSubPhaseType(String subPhaseType) {
        this.subPhaseType = subPhaseType;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public SubPhase addAction(Action action) {
        this.actions.add(action);
        return this;
    }

    @Override
    public String toString() {
        return "SubPhase{" +
                "subPhaseType='" + subPhaseType + '\'' +
                ", duration=" + duration +
                ", actions=" + actions +
                '}';
    }
}
