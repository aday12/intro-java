package edu.math;

/*
 * all static class= class w/nothing but static methods
 */
class Calculator {

    //ctor
    private Calculator(){

    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    /*
     * returns random int between 1 & 19 [inclusive]
     * HINT: see class: math (package java.lang for the method)
     * methods in math class are static, call them as "Math.methodName()"
     *
     * Name: numGen(), return type: int
     */

    public static int randomInt(){
        double rand = Math.random();    //0.00000 to 0.99999
        double scaled = (rand * 19) + 1; //1.00000 to 19.99999
        return (int) scaled;           //explicit downcast from double, on line 25/26 to int
//        these 3 lines can be coded in on one line
    }

    /*
     * returns random int between min and max inclusive
     *
     * CHALLENGE: IMPLEMENT
     */

    public static int randomInt(int min, int max){
        double rand = Math.random() * (max - min + 1) + min;
        return (int) rand;
        }

        /*
         * returns avg of supplied integers.
         * getAverage() or average()
         * getAvg()
         * getMean()
         */
    public static double avg(int first, int... rest){    //3, 4, 5, 9, 15
        //iterate over rest
        //add them
        //divide by length
        //below are two ways to do this

        double result = 0.0;

        double sum = first;
        for(int value : rest){
            sum += value;
        }
        return sum / (rest.length + 1);
    }
}
