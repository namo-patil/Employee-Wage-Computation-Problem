package com.bridgelabz.empwagecomputationprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeWage implements IEmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private List<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;

    public EmployeeWage() {
        companyEmpWageList = new ArrayList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        EmployeeWage empWageBuilder = new EmployeeWage();
        empWageBuilder.addCompanyEmpWage("Reliance", 10, 60, 20);
        empWageBuilder.addCompanyEmpWage("DMart", 20, 80, 10);
        empWageBuilder.computeEmpWageFromArrayList();
        System.out.println("Total wage for DMart Company: " + empWageBuilder.getTotalWage("DMart"));
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
        companyToEmpWageMap.put(company, companyEmpWage);
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

    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).monthlyEmpWage;
    }
}
