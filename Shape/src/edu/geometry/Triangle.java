package edu.geometry;

public class Triangle
        implements Shape {
    //TODO: use correct formulas to find height/area

    //fileds
    public double side1;
    public double angle;
    public double side2;
    public double area;

    //ctor
    public Triangle(double side1, double angle, double side2){
        this.side1 = side1;
        this.angle = angle;
        this.side2 = side2;
    }

    //get & set
    @Override
    public double getArea(){
        area = .5 * (side1 * side2);
        return area;
    }
    //toString

    @Override
    public String toString() {
        return "Triangle side1=" + side1 +
                ", angle=" + angle +
                ", side2=" + side2 +
                ", area=" + getArea();
    }
}
