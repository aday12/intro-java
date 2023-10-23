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

    @Override
    public String toString() {
        return "BrandName= " + getBrand();
    }
}
