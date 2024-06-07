package com.example.Employee.Salary.Service.model;


import com.example.Employee.Salary.Service.calculation.SalaryCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private SalaryCalculator salaryCalculator;

    @Autowired
    public Employee(SalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }

    public double getSalary(double amount) {
        return salaryCalculator.calculateSalary(amount);
    }
}
