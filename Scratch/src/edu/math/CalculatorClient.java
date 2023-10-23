package edu.math;

import static edu.math.Calculator.*; //can use * for static imports, not normal imports

class CalculatorClient {
    public static void main(String[] args) {

        double sum = add(3.1, 5.1);
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + Calculator.subtract(3, 5));
        System.out.println("10 is even? " + Calculator.isEven(10));
        System.out.println("Average is: " + Calculator.avg(3, 4, 5, 9, 15));

        System.out.println();

        int min = 5;
        int max = 20;
        boolean itWorks = true;
        int result = 0;

        //iterate 1mil times, calling this method and checking result against min & max
        for (int i = 0; i < 10_000_000; i++) {
            result = Calculator.randomInt(min, max);

            if (result < min || result > max) {
                itWorks = false;
                break;
            }

            if (itWorks) {
                System.out.println("Yay, no bugs!");
                break;
            }
            else {
                System.out.println("You got a bug!");
                System.out.println("Bug value = " + result);
            }
        }
    }
}
