package com.tick;

/*
 * client side main-class focused on validation testing of snoozeInterval
 * BVT (Boundry Value Testing) - test on boundaries and just outside them
 * only need to check max, min, min - 1, and max + 1
 * 0,1,20,& 21 in this case
 */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);
        System.out.println(clock);

        clock.setSnoozeInterval(20);
        System.out.println(clock);

        clock.setSnoozeInterval(0);
        System.out.println(clock);

        clock.setSnoozeInterval(21);
        System.out.println(clock);
    }
}
