package com.bridgelabz.empwagecomputationprograms;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Is_Full_Time = 2;
        int Is_Part_Time = 1;
        int Emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int empCheck = (int) (Math.random() * 10) % 3;

        switch (empCheck) {
            case 1:
                empHrs = 4;
                System.out.println("Employee is Working as Part Time");
                break;
            case 2:
                empHrs = 8;
                System.out.println("Employee is Present Full Time");
                break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }
        int dailyEmpWage = Emp_Rate_Per_Hour * empHrs;
        System.out.println("Daily Employee Wage : " + dailyEmpWage);
    }
}
