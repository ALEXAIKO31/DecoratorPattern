package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Bistec extends CondimentsDecorator {
    Taco taco;

    public Bistec (Taco taco){
        this.taco = taco;
        this.setSize(taco.size);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de bistec";
    }

    @Override
    public double cost() {
        if(taco.getSize().equals(MINI))
            return 0 + this.taco.cost();
        else if(taco.getSize().equals(MEGA))
            return 2 + this.taco.cost();
        else
            return 1 + this.taco.cost();
    }
}
