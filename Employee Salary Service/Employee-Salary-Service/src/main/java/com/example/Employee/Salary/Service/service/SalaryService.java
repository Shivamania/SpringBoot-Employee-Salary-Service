package com.example.Employee.Salary.Service.service;

import com.example.Employee.Salary.Service.calculation.SalaryCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SalaryService {

    private final SalaryCalculator salaryCalculator;

    @Autowired
    public SalaryService(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public double getSalary(double amount) {
        return salaryCalculator.calculateSalary(amount);
    }
}
