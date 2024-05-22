package Project_3.utils;

public enum Identifier {
    INSTANCE;
    private int id = 0;

    public int generate(){
        id ++;
        return id;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}

