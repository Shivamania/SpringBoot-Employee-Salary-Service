package com.example.Employee.Salary.Service.calculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FixedSalaryCalculator implements SalaryCalculator {
    @Override
    public double calculateSalary(double hours, double rate) {
        return 0;
    }

    @Override
    public double calculateSalary(double salary) {
        return salary;
    }
}
