package main.metamodel;

public class RegulatoryConstraint extends Constraint {
    private String name;
    private String description;
    public RegulatoryConstraint(String name, String description){
        super(name, description);
    }
}
