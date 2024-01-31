package com.proshop;

public enum BrandName {        //essentially a drop-down, cannot take an invalid input
    CALAWAY("Calaway"),
    TAYLORMADE("TaylorMade"),
    NIKE("Nike");

    //create var
    public final String brand;

    //ctor
    BrandName(String brand) {
        this.brand = brand;
    }

    //getter
    public String getBrand() {
        return brand;
    }

    /*
     * JR: should return just the display string (getBrand()).
     *
     * GolfClub's toString() method yields strings such as:
     *  Brand= BrandName= Nike, Number of Clubs= 10, ClubCovers= 4
     *
     * The usage banner in GolfClubClientArgs includes this:
     *  Brand must be [BrandName= Calaway, BrandName= TaylorMade, BrandName= Nike]
     */
    @Override
    public String toString() {
        return "BrandName= " + getBrand();
    }
}
