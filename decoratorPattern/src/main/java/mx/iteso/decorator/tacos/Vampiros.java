package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by ALEX on 04/10/2015.
 */
public class Vampiros extends Taco {

    public Vampiros(){
        description = "Vampiro";
        size=REGULAR;
    }

    @Override
    public double cost() {
        return 11.00;
    }
}
