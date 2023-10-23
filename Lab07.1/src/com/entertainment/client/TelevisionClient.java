package com.entertainment.client;

import com.entertainment.Television;
import com.entertainment.DisplayType;

import static com.entertainment.DisplayType.*;

/*
 * app main-class
 * create instances of tv and test them
 */
class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(+ Television.getInstanceCount() + " instances.");
        System.out.println();

        Television tv1 = new Television("Samsung", 32, PLASMA);


        Television tv2 = new Television("Sony", Television.MAX_VOLUME, OLED);


        Television tv3 = new Television("LG", Television.MIN_VOLUME);


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
