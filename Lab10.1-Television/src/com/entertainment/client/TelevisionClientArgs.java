package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            printUsage();
            return;  // early return from main(), application exits
        }

        //1: convert strings into proper data types
        String brand = null;
        int volume = 0;
        DisplayType display = null;
        try {
            brand = args[0];
            volume = Integer.parseInt(args[1]);
            display = DisplayType.valueOf(args[2].toUpperCase()
            );
        } catch (IllegalArgumentException e) {
            System.out.println("There is an error with your input:");
            System.out.printf("You entered %s %s %s\n\n", args[0], args[1], args[2]);
            printUsage();
            return;
        }

        //Step 2: create tv object from the above input
        try {
            Television tv = new Television(brand, volume, display);

            //Step 3: confirm input with user
            System.out.println("Congrats on your new tv, arriving soon!");
            System.out.println(tv);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
            printUsage();
        }
    }

    private static void printUsage() {
        String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
        String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
        String note1 = "Note: brand must be " + Arrays.toString(Television.VALID_BRANDS);
        String note2 = "Note: volume must be between " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME;
        String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
        System.out.println(usage);
        System.out.println(example);
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
        System.out.println();
    }
}