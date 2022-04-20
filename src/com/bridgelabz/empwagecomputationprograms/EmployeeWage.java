package com.bridgelabz.empwagecomputationprograms;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empCheck = (int) (Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
        int dailyEmpWage = EMP_RATE_PER_HOUR * empHrs;
        System.out.println("Daily Employee Wage : " + dailyEmpWage);
    }
}
