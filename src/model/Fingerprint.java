package model;

import java.util.Random;

public class Fingerprint implements Traceable{

    private Person person;
    private String location;

    // constructor
    public Fingerprint(Person p, String location){
        person = p;
        p.setFingerprint(this);
        this.location = location;
    }

    // EFFECTS: sets the location of the precinct location where the fingerprint was taken
    public void setLocation(String loc){
        location = loc;
    }

    public void setPerson(Person p){
        // reset previous fingerprint to null
        person.setFingerprint(null);
        // set this fingerprent to the given person
        person = p;
        p.setFingerprint(this);
    }

    // EFFECTS: returns the person associated with this fingerprint
    public Person getPerson(){
        return person;
    }

    @Override
    // EFFECTS: returns the location of the precinct where the fingerprint was taken
    public String getLocation() {
        return location;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void track() {
        System.out.println("Tracking " + person.getName());
    }
}
