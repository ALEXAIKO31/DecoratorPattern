package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Vampiros;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 04/10/2015.
 */
public class VampirosTest {
    @Test
    public void testCost() {
        Taco vampiros = new Vampiros();
        assertEquals(11.0, vampiros.cost(),0);
    }
}
