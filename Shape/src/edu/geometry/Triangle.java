package edu.geometry;

public class Triangle
        extends ShapeAb {

    //fileds
    public static final String shapeType = "Triangle";
    public double side1;
    public double angle;
    public double side2;
    public static double area;

    //ctor
    public Triangle(double side1, double angle, double side2){
        this.side1 = side1;
        this.angle = angle;
        this.side2 = side2;
    }

    //methods
    @Override
    public double getArea(){
      area = .5 * (side1 * side2);
      return area;
    }

    //get & set

}
