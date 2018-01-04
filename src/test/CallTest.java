package test;

import model.Call;
import model.Cellphone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallTest extends TraceableTest{

    private Call call1;
    private Call call2;

    private Cellphone c1;
    private Cellphone c2;

    private Person p1;
    private Person p2;

    @Before
    public void Setup(){
        p1 = new Person("Keanu Reeves");
        p2 = new Person("John Wick");

        c1 = new Cellphone(p1, l1);
        c2 = new Cellphone(p2, l2);

        t1 = new Call(c1, l1);
        t2 = new Call(c2, l2);

        call1 = new Call(c1, l1);
        call2 = new Call(c2, l2);
    }

    // test constructor
    @Test
    public void testConstructor(){
        assertEquals(c1, call1.getCaller());
        assertEquals(l1, call1.getLocation());
    }

    // test track
    @Test
    public void testTrack(){
        System.out.println("Expected Output: ");
        System.out.println("===============================");
        System.out.println("Tracking " + call1.getCaller().getOwner().getName());
        System.out.println("Tracking " + call2.getCaller().getOwner().getName());
        System.out.println("===============================");
        System.out.println("Actual Output: ");
        System.out.println("===============================");
        t1.track();
        t2.track();
    }
}
