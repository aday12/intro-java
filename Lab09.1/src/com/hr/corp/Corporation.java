/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */

//supported types: Corporation, TaxPayer, Object

public class Corporation implements TaxPayer { //Corporation IS-A TaxPayer
    private String name;
    public static final double STANDARD_DEDUCTION = 1_000_000;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    @Override
    public void fileReturn(){
        System.out.println("Return not filed, we sent lawyers instead");
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    //get & set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}