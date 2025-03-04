package main.metamodel;

public abstract class Constraint {
    private String constraintType, description;

    public Constraint(String constraintType, String description) {
        this.constraintType = constraintType;
        this.description = description;
    }

    public String getConstraintType() {
        return constraintType;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Constraint{" +
                "constraintType='" + constraintType + '\'' +
                ", description='" + description + '\'' +
                "}";
    }
}
