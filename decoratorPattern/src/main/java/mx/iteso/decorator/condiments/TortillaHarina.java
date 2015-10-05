package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class TortillaHarina extends CondimentsDecorator {
    Taco taco;

    public TortillaHarina(Taco taco){
        this.taco = taco;
        this.setSize(taco.size);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " en tortilla de harina";
    }

    @Override
    public double cost() {
        return 4 + this.taco.cost();
    }
}
