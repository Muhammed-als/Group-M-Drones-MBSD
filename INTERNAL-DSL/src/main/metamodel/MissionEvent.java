package main.metamodel;

public class MissionEvent {
    private String eventType;
    private int impactLevel;
    private String responseAction;

    public MissionEvent(String eventType, int impactLevel, String responseAction) {
        this.eventType = eventType;
        this.impactLevel = impactLevel;
        this.responseAction = responseAction;
    }

    public String getEventType() {
        return eventType;
    }

    public int getImpactLevel() {
        return impactLevel;
    }

    public String getResponseAction() {
        return responseAction;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setImpactLevel(int impactLevel) {
        this.impactLevel = impactLevel;
    }

    public void setResponseAction(String responseAction) {
        this.responseAction = responseAction;
    }

    @Override
    public String toString() {
        return eventType + " (Impact: " + impactLevel + ", Response: " + responseAction + ")";
    }
}
