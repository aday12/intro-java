/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Executive;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2000));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 1500));
        dept.addEmployee(new SalariedEmployee("John", LocalDate.of(2000, 3, 15), 1400)); //passing a sub-type of employee as an employee
        dept.addEmployee(new HourlyEmployee("Sarah", LocalDate.of(2002, 5, 1), 50, 38.5)); //passing an IS-A Employee as a new employee
        dept.addEmployee(new Executive("Aaron", LocalDate.of(2021, 5, 11), 3000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay employees:");
        dept.payEmployees();

        System.out.println("\nHoliday break:");
        dept.takeVacation();
    }
}