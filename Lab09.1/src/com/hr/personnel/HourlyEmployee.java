package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

//supported types: Object, Dept, Employee, TaxPayer

public class HourlyEmployee
        extends Employee{
    //fields
    private double rate;
    private double hours;

    //ctor
    public HourlyEmployee() {
        //super(); calls super weather typed or not
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    //action methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid hourly " + getRate() * getHours());
    }

    @Override
    public void payTaxes(){
        double taxes = getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " has paid taxes of " + taxes);
    }

    //get&set
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                ", rate=" + getRate() +
                ", hours=" + getHours();
    }
}
