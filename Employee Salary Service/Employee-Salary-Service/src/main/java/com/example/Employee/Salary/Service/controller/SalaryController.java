/*package com.example.Employee.Salary.Service.controller;

import com.example.Employee.Salary.Service.calculation.HourlySalaryCalculator;
import com.example.Employee.Salary.Service.model.Employee;
import com.example.Employee.Salary.Service.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalaryController {

    private final Employee employee;
    private final SalaryService salaryService;
    private final SalaryService lazySalaryService;
    private final HourlySalaryCalculator hourlySalaryCalculator;

    @Autowired
    public SalaryController(Employee employee, SalaryService salaryService, @Lazy SalaryService lazySalaryService,
                            HourlySalaryCalculator hourlySalaryCalculator) {
        this.employee = employee;
        this.salaryService = salaryService;
        this.lazySalaryService = lazySalaryService;
        this.hourlySalaryCalculator = hourlySalaryCalculator;
    }

    @GetMapping("/employee/salary")
    public String getEmployeeSalary(@RequestParam double amount, Model model) {
        double salary = employee.getSalary(amount);
        model.addAttribute("salary", salary);
        return "result";
    }

    @GetMapping("/service/salary")
    public String getServiceSalary(@RequestParam double amount, Model model) {
        double salary = salaryService.getSalary(amount);
        model.addAttribute("salary", salary);
        return "result";
    }

    @GetMapping("/lazy/service/salary")
    public String getLazyServiceSalary(@RequestParam double amount, Model model) {
        double salary = lazySalaryService.getSalary(amount);
        model.addAttribute("salary", salary);
        return "result";
    }

    @GetMapping("/employee/hourly-salary")
    public String calculateHourlySalary(@RequestParam double hours, @RequestParam double rate, Model model) {
        double hourlySalary = hourlySalaryCalculator.calculateSalary(hours, rate);
        model.addAttribute("hourlySalary", hourlySalary);
        return "result";
    }
}*/

package com.example.Employee.Salary.Service.controller;

import com.example.Employee.Salary.Service.calculation.BonusSalaryCalculator;
import com.example.Employee.Salary.Service.calculation.HourlySalaryCalculator;
import com.example.Employee.Salary.Service.model.Employee;
import com.example.Employee.Salary.Service.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalaryController {

    private final Employee employee;
    private final SalaryService salaryService;
    private final SalaryService lazySalaryService;
    private final HourlySalaryCalculator hourlySalaryCalculator;

    @Autowired
    private BonusSalaryCalculator bonusSalaryCalculator;

    @Autowired
    public SalaryController(Employee employee, SalaryService salaryService, @Lazy SalaryService lazySalaryService,
                            HourlySalaryCalculator hourlySalaryCalculator) {
        this.employee = employee;
        this.salaryService = salaryService;
        this.lazySalaryService = lazySalaryService;
        this.hourlySalaryCalculator = hourlySalaryCalculator;
    }

    @GetMapping("/employee/salary")
    public String getEmployeeSalary(@RequestParam double amount, Model model) {
        double salary = employee.getSalary(amount);
        model.addAttribute("salary", salary);
        return "result";
    }

    @GetMapping("/service/salary")
    public String getServiceSalary(@RequestParam double amount, Model model) {
        double salary = salaryService.getSalary(amount);
        model.addAttribute("salary", salary);
        return "result";
    }

    @GetMapping("/lazy/service/salary")
    public String getLazyServiceSalary(@RequestParam double amount, Model model) {
        double salary = lazySalaryService.getSalary(amount);
        model.addAttribute("salary", salary);
        return "result";
    }

    @GetMapping("/employee/hourly-salary")
    public String calculateHourlySalary(@RequestParam double hours, @RequestParam double rate, Model model) {
        double hourlySalary = hourlySalaryCalculator.calculateSalary(hours, rate);
        model.addAttribute("hourlySalary", hourlySalary);
        return "result";
    }

    @GetMapping("/employee/bonus-salary")
    public String calculateBonusSalary(@RequestParam double baseSalary, Model model) {
        double bonusSalary = bonusSalaryCalculator.calculateSalary(baseSalary);
        model.addAttribute("bonusSalary", bonusSalary);
        return "result";
    }
}
