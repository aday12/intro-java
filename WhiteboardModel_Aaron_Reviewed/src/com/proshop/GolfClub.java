package com.proshop;

import java.time.LocalDateTime;

/**
 * JR: Demonstrates basic understanding of program concepts,
 * but more attention to detail is needed.  ValidationTest is not thorough enough,
 * and ClientArgs needs improvement.
 *
 * Code formatting (tabbing) needs improvement.  Ctrl+Alt+L will fix this for you.
 *
 * See comments below and in the other classes.
 *
 * Class participation has been very good, keep it up.
 *
 * Class names, package names, and overall structure are not correct.
 *  - GolfClubValidationTest should be in package com.proshop.test.
 */

/*
 * JR: better class name = ClubSet, since your class definition indicates a set of clubs.
 * The code in GolfClubClient even indicates this, e.g.,
 *  GolfClub clubSet1 = ...
 */
public class GolfClub {

    //static
    private static final int MIN_CLUBS = 10;
    private static final int MAX_CLUBS= 14;

    /*
     * JR: these are only used in swingClub(), and can't be set from outside (they're private),
     * so instead, just make them local variables in swingClub().
     * And perhaps better naming: minDistance and maxDistance.
     */
    private static int min = 1;
    private static int max = 500;

    //attribtes
     private BrandName brand;
     private Integer clubsInSet;
     private Integer clubCovers;
     // JR: clever use of LocalDateTime
     private LocalDateTime returnTime = LocalDateTime.now().withSecond(0).withNano(0).plusHours(1);

    //constructors

    public GolfClub(){

    }

    public GolfClub(BrandName brand) {
        //this.brand = brand;  // JR: call the setter instead
        setBrand(brand); //this should be used for all ctors
    }

    public GolfClub(BrandName brand, Integer clubsInSet){
            this(brand);
            this.setClubsInSet(clubsInSet);
    }

    public GolfClub(BrandName brand, Integer clubsInSet, Integer clubCovers) {
        this(brand, clubsInSet);
        this.clubCovers = clubCovers;  // JR: call the setter instead
    }

    //getters and setters for attributes, referred to as data encapsulation

    public Integer getClubsInSet() {
        return clubsInSet;
    }

    public void setClubsInSet(Integer clubsInSet) {
       if(MIN_CLUBS <= clubsInSet && clubsInSet <= MAX_CLUBS){
           this.clubsInSet = clubsInSet;
       }
       else{
           System.out.println("Clubs in set must be between " + MIN_CLUBS + " and " + MAX_CLUBS);
       }
    }


    public BrandName getBrand() {
        return brand;
    }

    public void setBrand(BrandName brand) { //essentially a drop-down, cannot take an invalid input
            this.brand = brand;
    }

    public Integer getClubCovers() {
        return clubCovers;
    }

    public void setClubCovers(Integer clubCovers) {
                this.clubCovers = clubCovers;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = returnTime;
    }

    // JR: these methods are not really needed, and if you really wanted to have them,
    // they should be static, since your 'min' and 'max' fields are static.
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    //method(s)
    public void borrowDriver(){
        // JR: call the getter for returnTime instead
        System.out.println("You have borrowed a driver! please return no later than: " + returnTime);
    }

    // JR: should not be static, a client would be swinging a club from a specific set of clubs
    public static int swingClub(){
       double rand = Math.random() * (max - min + 1) + min;
        System.out.printf("Your ball went %.2f yards!", rand);
        return (int) rand;
    }

    // JR: I would include returnTime, also.
    @Override
    public String toString() {
        return String.format("Brand= %s, Number of Clubs= %s, ClubCovers= %s",
                getBrand(), getClubsInSet(), getClubCovers());
    }
}
