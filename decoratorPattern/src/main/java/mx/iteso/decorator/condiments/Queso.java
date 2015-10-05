package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
        this.setSize(taco.size);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
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
