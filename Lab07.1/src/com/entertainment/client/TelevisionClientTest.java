package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClientTest {
    public static void main(String[] args) {
        Television tv = new Television("Toshiba", 100, DisplayType.CRT);

        Television tv2 = new Television("LG");


        System.out.println(tv);
        System.out.println(tv2);
    }
}

