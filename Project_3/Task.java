package Project_3;

import Project_3.utils.Identifier;

public class Task {

    protected String name;
    protected Status status;
    protected String description;
    protected Type type;
    protected int id;

    public Task(String name, String description){
        this.name = name;
        this.description = description;
        this.id = Identifier.INSTANCE.generate();
    }

    public Task(String name,  Status status, String description, Type type){
        this.name = name;
        this.status = status;
        this.description = description;
        this.type = type;
        this.id = Identifier.INSTANCE.generate();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Type getType(){
        return type;
    }
    public void setType(Type type){
        this.type = type;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String toString(){
        return
                "Название: " + name +
                        " статус: " + status +
                        " описание: " + description +
                        " тип задачи: " + type +
                        " id: " + id;
    }
}
