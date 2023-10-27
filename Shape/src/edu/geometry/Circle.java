package edu.geometry;

public class Circle
        extends ShapeAb{
    //fields
    private double radius;

    //ctor
    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //actions methods
    public double getArea(){
        return (Math.PI * Math.pow(radius, 2));
    }

    //get
    //toString

    @Override
    public String toString() {
        return "Circle radius=" + radius +
                ", area= " + getArea();
    }
}
