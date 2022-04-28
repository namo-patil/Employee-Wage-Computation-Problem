package com.bridgelabz.empwagecomputationprograms;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static final int MAX_WORKING_HRS_PER_MONTH = 100;

    public static int computeEmpWage() {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int monthlyEmpWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHrs = 0;
        while (totalWorkingHrs <= MAX_WORKING_HRS_PER_MONTH && totalWorkingDays < WORKING_DAYS_PER_MONTH) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkingHrs += empHrs;
            System.out.println("#DAY : " + totalWorkingDays + " , #Total Working Hours : " + totalWorkingHrs);
        }
        monthlyEmpWage = totalWorkingHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage for a Month: " + monthlyEmpWage);
        return monthlyEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage();
    }
}
