package edu.geometry.client;

import edu.geometry.Triangle;
import edu.geometry.Shape;

public class ShapeClient {
    //TODO: Assign input a subclass based on input

    public static void main(String[] args) {
        Shape t1 = new Triangle(21, 30, 12);
        System.out.println(t1);
    }
}
