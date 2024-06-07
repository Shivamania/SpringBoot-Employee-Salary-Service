package com.example.Employee.Salary.Service.calculation;

import org.springframework.stereotype.Component;

@Component
public class BonusSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateSalary(double hours, double rate) {
        return 0;
    }

    @Override
    public double calculateSalary(double baseSalary) {
        double bonus = 500.0; // Example bonus amount
        return baseSalary + bonus;
    }
}
