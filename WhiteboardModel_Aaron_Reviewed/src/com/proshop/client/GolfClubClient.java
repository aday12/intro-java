package com.proshop.client;

import com.proshop.BrandName;
import com.proshop.GolfClub;

/**
 * JR: adequate, shows a basic test-drive.
 * Perhaps a few more calls to the business methods of clubSet1, clubSet2, and clubSet3.
 */
class GolfClubClient {
    public static void main(String[] args) {

        GolfClub clubSet1 = new GolfClub(BrandName.NIKE, 10, 4);

        GolfClub clubSet2 = new GolfClub(BrandName.CALAWAY, 14, 14);

        GolfClub clubSet3 = new GolfClub();


        //calling methods on set 1&2
        System.out.println(clubSet1);
        System.out.println(clubSet2);
        System.out.println(clubSet3);
        System.out.println();

        //method call(s)
        clubSet1.borrowDriver();
        GolfClub.swingClub();
    }
}
