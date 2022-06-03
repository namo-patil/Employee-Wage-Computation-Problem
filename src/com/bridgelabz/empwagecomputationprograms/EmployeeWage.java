package com.bridgelabz.empwagecomputationprograms;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWage implements IEmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    List<CompanyEmpWage> companyEmpWageList;

    public EmployeeWage() {
        companyEmpWageList = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage empWageBuilder = new EmployeeWage();
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 60, 20);
        empWageBuilder.addCompanyEmpWage("DMart", 20, 80, 10);
        empWageBuilder.computeEmpWageFromArrayList();
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        String status = null;
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalWorkingHrs = 0;
        while (totalWorkingHrs < companyEmpWage.maxWorkingHoursPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDaysPerMonth) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 10) % 2;
            switch (empCheck) {
                case IS_FULL_TIME:
                    status = "Full Time";
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    status = "Part Time";
                    empHrs = 4;
                    break;
                default:
                    status = "Absent";
                    empHrs = 0;
            }
            int dailyWage = companyEmpWage.empRatePerHour * empHrs;
            totalWorkingHrs += empHrs;
            System.out.println("#DAY : " + totalWorkingDays + "  , #Status : " + status);
        }
        System.out.println("#Total Working Hours : " + totalWorkingHrs);
        return totalWorkingHrs * companyEmpWage.empRatePerHour;
    }

    @Override
    public void addCompanyEmpWage(String company, int numOfWorkingDaysPerMonth, int maxWorkingHoursPerMonth, int empRatePerHour) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, numOfWorkingDaysPerMonth, maxWorkingHoursPerMonth, empRatePerHour);
        companyEmpWageList.add(companyEmpWage);
    }

    @Override
    public void computeEmpWageFromArrayList() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setMonthlyEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
            System.out.println();
        }
    }
}
