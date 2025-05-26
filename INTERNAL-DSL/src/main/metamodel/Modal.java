package main.metamodel;

import java.util.List;

public abstract class Modal {
    private String name;
    private List<Entity> entities;
    private List<Relation> relations;
    public Modal(){
        
    }
    public Modal(String name, List<Entity> entiteis, List<Relation> relations){
        this.name = name;
        this.entities = entiteis;
        this.relations = relations;
    }
    public String getName() {
        return name;
    }
    public List<Entity> getEntities() {
        return entities;
    }
    public List<Relation> getRelations() {
        return relations;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }
    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }
}
