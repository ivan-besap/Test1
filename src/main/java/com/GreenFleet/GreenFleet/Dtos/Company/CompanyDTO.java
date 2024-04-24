package com.GreenFleet.GreenFleet.Dtos.Company;


import com.GreenFleet.GreenFleet.Models.ChargingStation.ChargingStation;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Location;
import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Models.Company.Employee;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CompanyDTO {
    private Long id;
    private String businessName;
    private String emailCompany;
    private Integer phoneCompany;
    private Integer rut;
    private String verifierCode;
    private Boolean enabled = true;
    private Set<Employee> employees;
    private Set<ChargingStation> chargingStations;
    private List<Location> location;
    private LocalDate createdDay = LocalDate.now();

    public CompanyDTO(Company company) {
        id = company.getId();
        businessName = company.getBusinessName();
        emailCompany = company.getEmailCompany();
        phoneCompany = company.getPhoneCompany();
        rut = company.getRut();
        verifierCode = company.getVerifierCode();
        enabled = company.getEnabled();
        chargingStations = company.getChargingStations().stream().map(ChargingStation -> new ChargingStation()).collect(Collectors.toSet());
        employees = company.getEmployees().stream().map(Employee -> new Employee()).collect(Collectors.toSet());
        location = company.getLocations().stream().map(Location -> new Location()).collect(Collectors.toList());
        createdDay = company.getCreatedDay();
    }

    public Long getId() {
        return id;
    }
    public String getBusinessName() {
        return businessName;
    }
    public String getEmailCompany() {
        return emailCompany;
    }
    public Integer getPhoneCompany() {
        return phoneCompany;
    }
    public Integer getRut() {
        return rut;
    }

    public String getVerifierCode() {
        return verifierCode;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public Set<Employee> getEmployees() {
        return employees;
    }
    public Set<ChargingStation> getChargingStations() {
        return chargingStations;
    }

    public List<Location> getLocation() {
        return location;
    }

    public LocalDate getCreatedDay() {
        return createdDay;
    }


}
