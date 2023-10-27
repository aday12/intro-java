package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Triangle;
import edu.geometry.Shape;

public class ShapeClient {
    public static void main(String[] args) {
        Shape t1 = new Triangle(21, 30, 12);
        System.out.println(t1);
        Shape c1 = new Circle(12);
        System.out.println(c1);
    }
}
