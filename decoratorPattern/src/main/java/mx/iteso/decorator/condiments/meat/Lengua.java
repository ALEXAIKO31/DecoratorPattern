package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Lengua  extends CondimentsDecorator {
    Taco taco;

    public Lengua (Taco taco){
        this.taco = taco;
        this.setSize(taco.size);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {
        if(taco.getSize().equals(MINI))
            return 1 + this.taco.cost();
        else if(taco.getSize().equals(MEGA))
            return 3 + this.taco.cost();
        else
            return 2 + this.taco.cost();
    }
}
