package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

public class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Circle(3.2);

        shapes[2] = new Rectangle(2, 3);
        shapes[3] = new Rectangle(2, 4);

        shapes[4] = new Triangle(12, 60, 10);

        for (Shape shape : shapes){
            System.out.printf("The area of the %s is %s\n", shape.getClass().getSimpleName(), shape.getArea());
        }
    }
}
