package com.example.Employee.Salary.Service.calculation;

import org.springframework.stereotype.Component;

@Component
public class HourlySalaryCalculator implements SalaryCalculator {

    @Override
    public double calculateSalary(double hours, double rate) {
        return hours * rate;
    }

    @Override
    public double calculateSalary(double amount) {
        return 0;
    }
}

