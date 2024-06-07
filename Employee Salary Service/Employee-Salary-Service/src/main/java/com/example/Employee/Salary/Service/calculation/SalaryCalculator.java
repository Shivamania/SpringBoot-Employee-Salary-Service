package com.example.Employee.Salary.Service.calculation;

public interface SalaryCalculator {
    double calculateSalary(double hours, double rate);

    double calculateSalary(double amount);
}
