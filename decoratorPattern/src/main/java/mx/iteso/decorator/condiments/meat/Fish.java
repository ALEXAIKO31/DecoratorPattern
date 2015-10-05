package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by ALEX on 04/10/2015.
 */
public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish(Taco taco) throws Exception {
        if (taco.getSize().equals(MINI))
            throw new java.lang.Exception("No puede ponerle pescado a un taco mini");
        this.taco = taco;
        this.setSize(taco.getSize());
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        if(taco.getSize().equals(MEGA))
            return 3 + this.taco.cost();
        else
            return 2 + this.taco.cost();
    }
}