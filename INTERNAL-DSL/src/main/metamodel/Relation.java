package main.metamodel;

public class Relation extends Modal {
    private String name;
    private Entity from;
    private Entity to;
    private String type;
    
    public Relation(String name, Entity from, Entity to, String type) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public Entity getFrom() {
        return from;
    }
    public Entity getTo() {
        return to;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFrom(Entity from) {
        this.from = from;
    }
    public void setTo(Entity to) {
        this.to = to;
    }
    public void setType(String type) {
        this.type = type;
    }
}
