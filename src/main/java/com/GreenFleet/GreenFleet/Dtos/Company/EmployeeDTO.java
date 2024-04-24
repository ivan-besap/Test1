package com.GreenFleet.GreenFleet.Dtos.Company;

import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Models.Company.Employee;
import com.GreenFleet.GreenFleet.Models.Company.UserRol;

import java.time.LocalDate;

public class EmployeeDTO {
    private Long id;
    private String name;
    private String firstSurname;
    private String lastSurname;
    private String email;
    private String username;
    private String password;
    private LocalDate createdDay;
    private Company company;
    private UserRol userRol;

    public EmployeeDTO(Employee employee) {
        id = employee.getId();
        name = employee.getName();
        firstSurname = employee.getFirstSurname();
        lastSurname = employee.getLastSurname();
        email = employee.getEmail();
        username = employee.getUsername();
        password = employee.getPassword();
        createdDay = employee.getCreatedDay();
        company = employee.getCompany();
        userRol = employee.getUserRol();
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getFirstSurname() {
        return firstSurname;
    }
    public String getLastSurname() {
        return lastSurname;
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public LocalDate getCreatedDay() {
        return createdDay;
    }
    public Company getCompany() {
        return company;
    }
    public UserRol getUserRol() {
        return userRol;
    }
}
