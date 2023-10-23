package com.proshop.client;

import com.proshop.BrandName;
import com.proshop.GolfClub;

import java.util.Arrays;

class GolfClubClientArgs {

    public static void main(String[] args) {

        if(args.length < 3){    //check for all inputs
            String usage = "Usage: GolfClubClientArgs <brand>, <clubsInSet>, <clubCovers>";
            String example = "Example: GolfClubClientArgs Nike 14 14";
            String note = "Brand must be " + Arrays.toString(BrandName.values());
            String note2 = "The PGA only allows 10-14 clubs in a set on tour, you must have between 10 & 12 clubs.";
            String note3 = "You can have as many or as few club covers as you wish to bring! Must be entered as a number.";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            System.out.println(note2);
            System.out.println(note3);
        }
        else{
            //convert strings
            BrandName brand = BrandName.valueOf(args[0].toUpperCase());
            Integer clubsInSet = Integer.parseInt(args[1]);
            Integer clubCovers = Integer.parseInt(args[2]);

            //create new object using input
            GolfClub bag1 = new GolfClub(brand, clubsInSet, clubCovers);

            //confirm input w/ user
            System.out.println("Enjoy on your new clubs!");
            System.out.println(bag1);
        }
    }
}
