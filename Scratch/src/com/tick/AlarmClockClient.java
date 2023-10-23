package com.tick;

/*
 * application main-class, has main method
 *
 * purpose is to create instances of AlarmClock and test them
 */

class AlarmClockClient {

    //app starting point
    public static void main(String[] args) {
        //create instance of AlarmClock and set properties
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        //create second instance of alarm clock
        AlarmClock clock2 = new AlarmClock(AlarmClock.MAX_INTERVAL);

        //create a 3rd instance, but don't set properties
        AlarmClock clock3 = new AlarmClock();

        //call methods on the instances
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        //show their toString() methods
        System.out.println(clock1.toString());
        System.out.println(clock2);
        System.out.println(clock3);

    }
}
