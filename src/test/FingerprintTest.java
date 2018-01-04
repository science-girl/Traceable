package test;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FingerprintTest extends TraceableTest {

    private Fingerprint f1;
    private Fingerprint f2;

    private Person p1;
    private Person p2;

    private String p1Name = "Jeff Winger";
    private String p2Name = "Debra Winger";

    @Before
    public void Setup(){
        p1 = new Person(p1Name);
        p2 = new Person(p2Name);

        f1 = new Fingerprint(p1,l1);
        f2 = new Fingerprint(p2, l2);

        t1 = new Fingerprint(p1, l1);
        t2 = new Fingerprint(p2, l2);
    }

    // test constructor
    @Test
    public void testConstructor(){
        assertEquals(p1Name, f1.getPerson().getName());
        assertEquals(p2Name, this.f2.getPerson().getName());
        assertEquals(l1, f1.getLocation());
        assertEquals(l2, this.f2.getLocation());
    }

    // test fingerprint is associated with ONE person at most
    // test changing person associated with fingerprint
    @Test
    public void testFingerprintForMaxOnePerson(){
        // changing f1 to belong to p2
        f1.setPerson(p2);
        // f1 should no longer be associated with p1
        assertNotEquals(f1, p1.getFingerprint());
        assertEquals(f1, p2.getFingerprint());
    }

    // test track
    @Test
    public void testTrack(){
        System.out.println("Expected Output: ");
        System.out.println("===============================");
        System.out.println("Tracking " + p1.getName());
        System.out.println("Tracking " + p2.getName());
        System.out.println("===============================");
        System.out.println("Actual Output: ");
        System.out.println("===============================");
        t1.track();
        this.f2.track();
    }

}
