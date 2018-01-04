package test;

import model.Call;
import model.Cellphone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CellphoneTest extends TraceableTest {
    private Person p1;
    private Person p2;

    private Cellphone cell1;
    private Cellphone cell2;

    private Call c1;
    private Call c2;

    @Before
    public void Setup(){
        p1 = new Person("Keanu Reeves");
        p2 = new Person("John Wick");

        cell1 = new Cellphone(p1, l1);
        cell2 = new Cellphone(p2, l2);

        t1 = cell1;
        t2 = cell2;

        c1 = new Call(cell1, l1);
        c2 = new Call(cell2, l2);
    }

    // test number of calls
    @Test
    public void testNumberOfCalls(){
        assertEquals(0, cell1.getCalls().size());
        cell1.makeCall(c1);
        assertEquals(1, cell1.getCalls().size());
        cell1.makeCall(c2);
        assertEquals(2, cell1.getCalls().size());
    }

    // test cellphone can only have one owner
    @Test
    public void testOnlyOneOwner(){
        cell1.setOwner(p2);
        assertEquals(cell1, p2.getCellphone());
        assertNotEquals(cell1, p1.getCellphone());
        assertEquals(p2, cell1.getOwner());
        assertNotEquals(p1, cell1.getOwner());
    }

    // test track
    @Test
    public void testTrack(){
        System.out.println("Expected Output: ");
        System.out.println("===============================");
        System.out.println("Tracking " + cell1.getOwner().getName());
        System.out.println("Tracking " + cell2.getOwner().getName());
        System.out.println("===============================");
        System.out.println("Actual Output: ");
        System.out.println("===============================");
        cell1.track();
        cell2.track();
    }
}
