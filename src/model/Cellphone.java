package model;

import java.util.ArrayList;

public class Cellphone implements Traceable {

    private ArrayList<Call> calls; // calls made with this phone
    private Person owner; // person who owns this phone
    private String location;

    // Constructor
    public Cellphone(Person owner, String loc){
        this.owner = owner;
        calls = new ArrayList<Call>();
        location = loc;
    }

    public void makeCall(Call c){
        calls.add(c);
    }

    public void setOwner(Person p){
        // a cellphone can only belong to one person, so set the prev person's phone to null
        owner.setCellphone(null);
        p.setCellphone(this);
        owner = p;
    }

    public void setLocation(String loc){
        location = loc;
    }

    public Person getOwner(){
        return owner;
    }

    public ArrayList<Call> getCalls(){
        return calls;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void track() {
        System.out.println("Tracking " + owner.getName());
    }
}
