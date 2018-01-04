package test;

import model.Traceable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class TraceableTest {

    Traceable t1;
    Traceable t2;

    String n1 = "555-5446";
    String n2 = "778-9745";
    String l1 = "Paris";
    String l2 = "London";

    @Test
    public void testLocation(){
        assertEquals(l1, t1.getLocation());
        assertEquals(l2, t2.getLocation());
    }

    // test get trace
    @Test
    public void testTrace(){
        assertEquals(t1, t1.getTrace());
        assertEquals(t2, t2.getTrace());
    }

}
