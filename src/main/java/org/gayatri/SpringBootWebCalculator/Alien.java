package org.gayatri.SpringBootWebCalculator;

public class Alien {

    private String aID;
    private String aName;

    public String getaID() {
        return aID;
    }

    public void setaID(String aID) {
        this.aID = aID;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Alien{" + "aID=" + aID + ", aName=" + aName + '}';
    }
}
