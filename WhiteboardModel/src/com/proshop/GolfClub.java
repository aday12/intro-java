package com.proshop;

import java.time.LocalDateTime;

public class GolfClub {

    //static
    private static final int MIN_CLUBS = 10;
    private static final int MAX_CLUBS= 14;
    private static int min = 1;
    private static int max = 500;

    //attribtes
     private BrandName brand;
     private Integer clubsInSet;
     private Integer clubCovers;
     private LocalDateTime returnTime = LocalDateTime.now().withSecond(0).withNano(0).plusHours(1);

    //constructors

    public GolfClub(){

    }

    public GolfClub(BrandName brand) {
        this.brand = brand;
    }

    public GolfClub(BrandName brand, Integer clubsInSet){
            this(brand);
            this.setClubsInSet(clubsInSet);
    }

    public GolfClub(BrandName brand, Integer clubsInSet, Integer clubCovers) {
        this(brand, clubsInSet);
        this.clubCovers = clubCovers;
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

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    //method(s)
    public void borrowDriver(){
        System.out.println("You have borrowed a driver! please return no later than: " + returnTime);
    }

    public static int swingClub(){
       double rand = Math.random() * (max - min + 1) + min;
        System.out.printf("Your ball went %.2f yards!", rand);
        return (int) rand;
    }

    @Override
    public String toString() {
        return String.format("Brand= %s, Number of Clubs= %s, ClubCovers= %s",
                getBrand(), getClubsInSet(), getClubCovers());
    }
}
