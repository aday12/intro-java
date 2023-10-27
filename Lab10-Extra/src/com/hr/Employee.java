package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * option 4: try-catch exception then throw a different one
     * instead fo re-throwing a transportation-oriented exception,
     * we'll throw an hr-oriented exception that makes more sense for my hr app client
     */
    public void goToWork() throws WorkException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Toyota", "Rav4");

        try {
            c.start();
            c.moveTo("Lakewood");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        }
        finally {
            c.stop();
        }
    }

    /*
     * option 3: try-catch exception, respond in someway, then re-throw the exception
     * re-throwing means we're still not handling the exception
     * still use finally for the guaranteed stop()
     */

    /*
    public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Toyota", "Rav4");

        try {
            c.start();
            c.moveTo("Lakewood");
        }
        catch (DestinationUnreachableException e) {
            //use JavaMail API to send email to city counsel
            throw e;
        }
        finally {
            c.stop();
        }
    }

     */

    /*
     * option 2: punt the exception, ignore it
     * use a try-finally to guarantee that stop() is called
     * since there is no catch, we arent handling the exception
     */
    /*
    public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Toyota", "Rav4");

        try {
            c.start();
            c.moveTo("Tacoma");
        } finally {
            c.stop();
        }
    }
    */

    /*
     * option 1: try-catch-finally and handle.
     * finally guarantees that stop() is called
     */

    /*
    public void goToWork() throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car c = new Car("ABC123", "Toyota", "Rav4");

        try {
            c.start();
            c.moveTo("Lakewood");
        } catch (DestinationUnreachableException e) {
            System.out.println(e); //calls toString for the exception
        }
        finally {
            c.stop();
        }
    }
    */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}