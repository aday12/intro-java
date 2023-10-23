package com.tick;

/*
 * class definition to model an alarm clock
 * this is a business/system class, because it contains business things (attributes and methods)
 * this class def DOESN'T have a main method
 */

class AlarmClock {

    //static variables are shared between object instances
    //"public static final = all caps w/underscore to separate works
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    //properties or attributes are called instance variables/fields in java
    private int snoozeInterval = 5; //default value = 5 when interval isn't specified (language default is 0)

    //constructors or ctor - get called when client says "new"

    public AlarmClock(){
        //no-op/no-operations
    };

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); //delegate to setter for validation
    }

    //functions/operations in java are called methods
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    //accessor methods provide controlled access to object's fields
    //this allows us to do things ie data validation/enforcing constraints
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // enforce data constraint, if-else must be between 1 & 20 inclusive
    public void setSnoozeInterval(int snoozeInterval) {
        if(snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else{
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". Must be between " +
                    MIN_INTERVAL + " & " + MAX_INTERVAL);
        }
    }

    //toString
    public String toString(){
        return "snoozeInterval=" + getSnoozeInterval();
    }
}
