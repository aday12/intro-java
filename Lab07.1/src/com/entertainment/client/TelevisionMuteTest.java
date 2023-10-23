package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv1 = new Television("LG", 15);
        System.out.println(tv1);

        tv1.mute();
        System.out.println(tv1);
    }

}
