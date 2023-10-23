package com.proshop.client;

import com.proshop.BrandName;
import com.proshop.GolfClub;

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
