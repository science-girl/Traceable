package test;

import model.Cellphone;
import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class PersonTest {

    private Person p1;
    private Person p2;
    private Person p3;

    private String name1 = "Keanu Reeves";
    private String name2 = "John Wick";
    private String name3 = "Neo";

    private Fingerprint f1;
    private Fingerprint f2;

    private Cellphone c1;

    private String location1 = "Surrey";
    private String location2 = "Vancouver";

    @Before
    public void Setup(){
        p1 = new Person(name1);

        p2 = new Person(name2);
        f2 = new Fingerprint(p2, location1);

        p3 = new Person(name3);
        f1 = new Fingerprint(p3, location2);

        c1 = new Cellphone(p1,"Surrey");
    }

    // test constructor
    @Test
    public void testConstructor(){
        assertEquals(name1, p1.getName());
        assertEquals(name2, p2.getName());
        assertEquals(name3, p3.getName());
    }

    // test person can have 0 or 1 fingerprints; no more than 1
    @Test
    public void testOnlyOneFingerprint(){
        // 0 fingerprints
        assertNull(p1.getFingerprint());

        // 1 fingerprint
        assertEquals(f1, p3.getFingerprint());

        // set p3 to f2 - 2 fingerprints?
        p3.setFingerprint(f2);
        assertEquals(f2, p3.getFingerprint());
        assertNotEquals(f1, p3.getFingerprint());
    }

    // test get/set cellphone
    @Test
    public void testGetAndSetCellphone(){
        assertEquals(c1, p1.getCellphone());
    }
}
