package model;

public class Call implements Traceable {

    private Cellphone outgoingCaller;
    private String location;

    // Constructor
    public Call(Cellphone outgoingCaller, String location){
        this.outgoingCaller = outgoingCaller;
        this.location = location;
    }

    // EFFECTS: returns the number that has made this call
    public Cellphone getCaller(){
        return outgoingCaller;
    }

    @Override
    // EFFECTS: returns the location where the call was made
    public String getLocation(){
        return location;
    }

    @Override
    public Object getTrace() {
        return this;
    }

    @Override
    public void track() {
        System.out.println("Tracking " + this.outgoingCaller.getOwner().getName());
    }

}
