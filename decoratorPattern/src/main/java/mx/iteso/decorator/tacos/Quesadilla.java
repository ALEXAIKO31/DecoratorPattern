package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String size){
        this.description="Quesadilla";
        if(size.equals(MINI))
            this.size=MINI;
        else if(size.equals(MEGA))
            this.size=MEGA;
        else
            this.size=REGULAR;
    }

    @Override
    public double cost(){
        if(size.equals(MINI))
            return 8.00;
        else if(size.equals(MEGA))
            return 12.00;
        else
            return 10.00;
    }
}
