package edu.geometry;

public class Shape {
    //fields
    public double area;

    //ctors
    public Shape(){

    }

    public Shape(double area) {
        this.area = area;
    }

    //methods
    public double calcArea(){
        return 0;
    }

    //get & set
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "shapeType=" + getClass().getSimpleName() +
                ", area=" + getArea();
    }
}
