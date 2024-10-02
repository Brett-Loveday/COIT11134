// Programmer: Brett Loveday 12229250
// File: PhoneNumber.java
// Date: 2024.09.11
// Purpose: COIT11134 Week 9 Lab Exercise
// Class to represent a phone number record

package coit11134.staffphonebook;

public class PhoneNumber {

    private String name;
    private String phoneNo;
    
    // constructor
    public PhoneNumber(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
    
    // getters
    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // display string - csv format
    @Override
    public String toString() {
        return getName() + ",  " + getPhoneNo();
    }

}
