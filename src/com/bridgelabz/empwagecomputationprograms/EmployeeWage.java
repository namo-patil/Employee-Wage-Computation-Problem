package com.bridgelabz.empwagecomputationprograms;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int monthlyEmpWage = 0;
        for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is Present, Full Time");
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Present, Part Time");
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            int dailyEmpWage = EMP_RATE_PER_HOUR * empHrs;
            monthlyEmpWage += dailyEmpWage;
            System.out.println("Daily Employee Wage : " + dailyEmpWage);
        }
        System.out.println("Employee Wage for a Month: " + monthlyEmpWage);
    }
}
