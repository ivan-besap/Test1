package com.GreenFleet.GreenFleet.Models.Company;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String firstSurname;
    private String lastSurname;
    private String email;
    private String username;
    private String password;
    private LocalDate createdDay;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_rol_id")
    private UserRol userRol;

    public Employee() {
    }

    public Employee(String name, String firstSurname, String lastSurname, String email, String username, String password, Company company, UserRol userRol, LocalDate createdDay) {
        this.name = name;
        this.firstSurname = firstSurname;
        this.lastSurname = lastSurname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.company = company;
        this.userRol = userRol;
        this.createdDay = createdDay;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstSurname() {
        return firstSurname;
    }
    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }
    public String getLastSurname() {
        return lastSurname;
    }
    public void setLastSurname(String lastSurname) {
        this.lastSurname = lastSurname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserRol getUserRol() {
        return userRol;
    }
    public void setUserRol(UserRol userRol) {
        this.userRol = userRol;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public LocalDate getCreatedDay() {
        return createdDay;
    }
    public void setCreatedDay(LocalDate createdDay) {
        this.createdDay = createdDay;
    }
}
