package main.metamodel;

public class Action extends Entity {
    private String name;
    private String description;
    private String type;
    public Action(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Action [name=" + name + ", description=" + description + ", type=" + type + "]";
    }
}
