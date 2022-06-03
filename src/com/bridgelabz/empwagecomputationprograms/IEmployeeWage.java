package com.bridgelabz.empwagecomputationprograms;

public interface IEmployeeWage {
    void addCompanyEmpWage(String company, int numOfWorkingDaysPerMonth, int maxWorkingHoursPerMonth, int empRatePerHour);

    void computeEmpWageFromArrayList();
    int getTotalWage(String company);
}

