/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
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
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 20000));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 15000));
        dept.addEmployee(new SalariedEmployee("John", LocalDate.of(2000, 3, 15), 14000)); //passing a sub-type of employee as an employee
        dept.addEmployee(new HourlyEmployee("Sarah", LocalDate.of(2002, 5, 1), 500.25, 38.5)); //passing an IS-A Employee as a new employee

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay employees:");
        dept.payEmployees();
    }
}