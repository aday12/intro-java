package com.proshop.client;

import com.proshop.BrandName;
import com.proshop.GolfClub;

/**
 * JR: Needs improvement.  Testing not thorough enough, for proper BVT (Boundary Value Testing)
 * for range of values 10-14, you should check:
 *  9,10  and  14,15
 * No invalid values were even checked.
 *
 * And nothing else should be in here, e.g., calls to borrowDriver(), etc.
 * This class should be focused solely on validation testing.
 *
 * Incorrect class name, should be GolfClubValidationTest.
 */
class GolfClubValidation {
    public static void main(String[] args) {

        GolfClub bag1 = new GolfClub(BrandName.CALAWAY, 14, 4);

        System.out.println(bag1);
        bag1.setClubsInSet(12);
        System.out.println("New clubsInSet = " + bag1.getClubsInSet());
        System.out.println();

        bag1.setClubsInSet(8);
        System.out.println("New clubsInSet = " + bag1.getClubsInSet());

        //method calls
        System.out.println(bag1);
        System.out.println();
        bag1.borrowDriver();
        bag1.swingClub();
    }

}
