package com.bridgelabz.empwagecomputationprograms;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    private String company;
    private int empRatePerHour;
    private int numOfWorkingDaysPerMonth;
    private int maxWorkingHoursPerMonth;

    public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDaysPerMonth, int maxWorkingHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDaysPerMonth = numOfWorkingDaysPerMonth;
        this.maxWorkingHoursPerMonth = maxWorkingHoursPerMonth;
    }

    public static void main(String[] args) {
        EmployeeWage reliance = new EmployeeWage("Reliance", 20, 10, 60);
        EmployeeWage dMart = new EmployeeWage("DMart", 10, 20, 80);
        System.out.println("------------Reliance-----------");
        reliance.computeEmpWage();
        System.out.println();
        System.out.println("------------DMart-----------");
        dMart.computeEmpWage();
    }

    public void computeEmpWage() {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int monthlyEmpWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHrs = 0;
        while (totalWorkingHrs <= maxWorkingHoursPerMonth && totalWorkingDays < numOfWorkingDaysPerMonth) {
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
        monthlyEmpWage = totalWorkingHrs * empRatePerHour;
        System.out.println("Employee Wage for a Month: " + monthlyEmpWage);
    }
}
