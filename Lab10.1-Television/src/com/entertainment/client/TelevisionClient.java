package com.entertainment.client;

import com.entertainment.InvalidBrandException;
import com.entertainment.Television;
import com.entertainment.DisplayType;

import static com.entertainment.DisplayType.*;

/*
 * app main-class
 * create instances of tv and test them
 */
class TelevisionClient {
    public static void main(String[] args) throws InvalidBrandException {
        System.out.println(+ Television.getInstanceCount() + " instances.");
        System.out.println();

        Television tv1 = new Television("Magnavox", 32, PLASMA);
        //useful to use setters instead of ctor in at least 1 method to help troubleshoot exceptions

        Television tv2 = new Television("Sony", Television.MAX_VOLUME, OLED);

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
