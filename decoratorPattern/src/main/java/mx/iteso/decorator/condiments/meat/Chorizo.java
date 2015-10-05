package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.taco = taco;
        System.out.println(taco.getSize());
        this.setSize(taco.getSize());
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
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
