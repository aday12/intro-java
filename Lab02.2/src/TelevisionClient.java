/*
 * app main-class
 * create instances of tv and test them
 */
class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(+ Television.getInstanceCount() + " instances.");
        System.out.println();

        Television tv1 = new Television("Samsung", 100);


        Television tv2 = new Television("Sony", 15);


        Television tv3 = new Television("LG");


        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        System.out.println();

        System.out.println(+ Television.getInstanceCount() + " instances.");

    }
}
