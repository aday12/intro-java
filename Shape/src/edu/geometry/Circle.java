package edu.geometry;

public class Circle {
    //fields
    private final String name;
    private final double radius;

    //ctor

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public Circle(String name, double radius, double area) {

        this.name = name;
        this.radius = radius;
    }

    //actions methods

    private double findArea(){
        return (3.14 * Math.pow(radius, 2));

    }

    //get
}
