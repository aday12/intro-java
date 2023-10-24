package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //field
    private double salary;

    //ctor
    public SalariedEmployee() {
        //super(); calls super weather typed or not
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary){
        this(name, hireDate);
        setSalary(salary);
    }

    //get&set
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: name=" + getName() +
                ", hireDate=" + getHireDate() +
                ", salary=" + getSalary();
    }
}
