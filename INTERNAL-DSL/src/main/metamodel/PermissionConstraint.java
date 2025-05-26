package main.metamodel;

public class PermissionConstraint extends Constraint {
    private String name;
    private String description;
    public PermissionConstraint(String name, String description){
        super(name, description);
    }
}
