# SpringBoot-Employee-Salary-Service
JavaFullStack Project 3 under the Guidance of Praveen Sir : SpringBoot Application that models an Employee Salary Service Using Spring Boot Dependency Injection

## Introduction
Employee Salary Service is a web application that allows users to calculate different types of employee salaries including fixed salary, hourly salary, and bonus salary. This project demonstrates the use of Spring Boot for backend services and Thymeleaf for frontend rendering.

## Features
- Calculate fixed salary
- Calculate hourly salary
- Calculate salary with bonus

## Technologies Used
- Java
- Spring Boot
- Thymeleaf
- HTML/CSS

## Usage
- Open your web browser and go to `localhost:8080`
- Use the forms on the homepage to calculate different types of salaries
- Use the "Calculate" button to get different types of salaries

## Application Screenshots

### Home Page
![Home Page](screenshots/SBproject1.2.png)

### Fixed Salary Calculation
![Fixed Salary Calculation](screenshots/SBproject1.4.png)

### Hourly Salary Calculation
![Hourly Salary Calculation](screenshots/SBproject1.6.png)

### Bonus Salary Calculation
![Bonus Salary Calculation](screenshots/SBproject1.8.png)

## Annotations Used

### Spring Boot Annotations
- **@SpringBootApplication**: Marks the main class of a Spring Boot application, enabling auto-configuration and component scanning.
- **@Component**: Indicates that a class is a candidate for Spring's component scanning to detect and register as a bean.
- **@Autowired**: Automatically injects dependencies.
- **@Qualifier**: Specifies which bean to inject when multiple candidates are present.
- **@Primary**: Designates a bean as the default when multiple beans of the same type exist.
- **@Lazy**: Defers bean instantiation until it is needed.
- **@Scope("prototype")**: Configures a bean to be created anew each time it is requested.

### Spring MVC Annotations
- **@RestController**: Marks the class as a RESTful controller where every method returns a domain object instead of a view.
- **@GetMapping**: Maps HTTP GET requests to specific handler methods.

## Contact
- **Name:** Shivam Patel
- **Email:** shivampatelthechamp@gmail.com
- **GitHub:** [Shivamania](https://github.com/Shivamania)
