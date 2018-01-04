package model;

public class Person {
    private Fingerprint fingerprint;
    private Cellphone cell;
    private String name;

    // constructor
    public Person(String name){
        this.name = name;
        this.fingerprint = null;
        this.cell = null;
    }

    public void setFingerprint(Fingerprint fingerprint){
        this.fingerprint = fingerprint;
    }

    public void setCellphone(Cellphone cell){
        this.cell = cell;
    }

    public String getName(){
        return this.name;
    }

    public Fingerprint getFingerprint(){
        return fingerprint;
    }

    public Cellphone getCellphone(){
        return cell;
    }

}
