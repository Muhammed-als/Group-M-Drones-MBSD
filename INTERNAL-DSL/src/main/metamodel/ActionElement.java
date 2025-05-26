package main.metamodel;

public class ActionElement {
    private Action action;
    private Mission mission;
    public ActionElement(Action action){
        this.action = action;
    }
    public ActionElement(Mission mission){
        this.mission = mission;
    }
}
