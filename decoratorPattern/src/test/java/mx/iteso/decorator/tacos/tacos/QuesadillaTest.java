package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 04/10/2015.
 */
public class QuesadillaTest {
    @Test
    public void testCost() {
        Taco quesadilla = new Quesadilla("regular");
        assertEquals(10.0, quesadilla.cost(),0);
        Taco quesadilla1 = new Quesadilla("mini");
        assertEquals(8.0, quesadilla1.cost(),0);
        Taco quesadilla2 = new Quesadilla("mega");
        assertEquals(12.0, quesadilla2.cost(),0);
    }
    @Test
    public void DescriptionTest() {
        Taco quesadilla = new Quesadilla("regular");
        assertEquals("Quesadilla regular",quesadilla.getDescription());
        Taco quesadilla1 = new Quesadilla("mini");
        assertEquals("Quesadilla mini",quesadilla1.getDescription());
        Taco quesadilla2 = new Quesadilla("mega");
        assertEquals("Quesadilla mega",quesadilla2.getDescription());
    }
}
