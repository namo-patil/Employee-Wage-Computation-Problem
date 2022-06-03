package com.bridgelabz.empwagecomputationprograms;

import java.util.Arrays;

public class CompanyEmpWage {
    public final String company;
    public final int numOfWorkingDaysPerMonth;
    public final int maxWorkingHoursPerMonth;
    public final int empRatePerHour;
    public int monthlyEmpWage;
    public int[] dailyWage;

    // Constructor
    public CompanyEmpWage(String company, int numOfWorkingDaysPerMonth, int maxWorkingHoursPerMonth, int empRatePerHour) {
        this.company = company;
        this.numOfWorkingDaysPerMonth = numOfWorkingDaysPerMonth;
        this.maxWorkingHoursPerMonth = maxWorkingHoursPerMonth;
        this.empRatePerHour = empRatePerHour;
        this.dailyWage = new int[numOfWorkingDaysPerMonth];
    }

    public void setMonthlyEmpWage(int monthlyEmpWage) {
        this.monthlyEmpWage = monthlyEmpWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "company='" + company + '\'' +
                ", numOfWorkingDaysPerMonth=" + numOfWorkingDaysPerMonth +
                ", maxWorkingHoursPerMonth=" + maxWorkingHoursPerMonth +
                ", empRatePerHour=" + empRatePerHour +
                ", monthlyEmpWage=" + monthlyEmpWage +
                ", dailyWage=" + Arrays.toString(dailyWage) +
                '}';
    }
}
