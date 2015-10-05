package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {
    @Test
    public void testCost() {
        Taco taco = new TacoNormal("regular");
        assertEquals(8.0, taco.cost(),0);
        Taco taco1 = new TacoNormal("mini");
        assertEquals(6.0, taco1.cost(),0);
        Taco taco2 = new TacoNormal("mega");
        assertEquals(10.0, taco2.cost(),0);
    }
}
