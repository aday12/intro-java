/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Collection<Employee> employees = new ArrayList<>();

    // constructors
    //none of the IS-A relationships are mentioned here, ie no hourly employee/salaried employee ctor
    public Department() {
        //super(); calls super weather typed or not
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
            employees.add(emp);
    }

    // business, action, methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee emp : employees) {
            System.out.println(emp);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    public void payEmployees(){
        for (Employee emp : employees){
            emp.pay();
        }
    }

    public void payTaxes() {
        for (Employee emp : employees) {
            emp.payTaxes();
            System.out.println("Taxes paid via USPS");
        }
    }
    public void takeVacation() {
        for (Employee emp : employees) {
            // Check if employee is an instance of Salaried employee class
            if (emp instanceof SalariedEmployee) {
                ((SalariedEmployee) emp).takeVacation(); // Down cast salaried employee and call takeVacation, If you only call 1 method
                /* We can also use this method
                 *
                 * SalariedEmployee emp = (SalariedEmployee) employees[i];
                 * emp.takeVacation()
                 */

            }
        }
    }
    
    
        // accessor methods
        public String getName () {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLocation(String location) {
            this.location = location;
        }
}

