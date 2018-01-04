package model;

public interface Traceable {

    // EFFECTS: returns location of tracked object
    public String getLocation();

    // EFFECTS: returns the object of interest
    public Object getTrace();

    // EFFECTS: displays 'Tracking' and an identifying property of the object of interest
    public void track();
}
