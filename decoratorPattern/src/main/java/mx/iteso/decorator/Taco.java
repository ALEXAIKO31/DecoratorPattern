package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";
    public final String REGULAR="regular";
    public final String MINI="mini";
    public final String MEGA="mega";
    public String size = MINI;

    public String getDescription(){
        return description + " " + size;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getSize(){
        return this.size;
    }
    public abstract double cost();
}
