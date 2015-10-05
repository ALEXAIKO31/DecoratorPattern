package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ALEX on 04/10/2015.
 */
public class FishTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception{
        when(taco.getSize()).thenReturn("regular");
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = fish.cost();
        assertEquals(10.0, cost, 0);
        when(taco.getSize()).thenReturn("mega");
        cost = fish.cost();
        assertEquals(11.0, cost, 0);
    }
    @Test
    public void testDescription() throws Exception{
        when(taco.getSize()).thenReturn("regular");
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = fish.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }

    @Test(expected=java.lang.Exception.class)
    public void testMiniDeclaration() throws Exception{
        when(taco.getSize()).thenReturn("mini");
        Taco fish = new Fish(taco);
    }
}
