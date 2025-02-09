package com.hibernate.demo.emdeddedobject;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmmbededName
{
    private String fName;
    private String mMiddle;
    private String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmMiddle() {
        return mMiddle;
    }

    public void setmMiddle(String mMiddle) {
        this.mMiddle = mMiddle;
    }

    @Override
    public String toString() {
        return "EmmbededName{" +
                "fName='" + fName + '\'' +
                ", mMiddle='" + mMiddle + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
