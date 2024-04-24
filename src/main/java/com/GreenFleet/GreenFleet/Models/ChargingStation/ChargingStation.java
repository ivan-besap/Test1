package com.GreenFleet.GreenFleet.Models.ChargingStation;


import com.GreenFleet.GreenFleet.Models.Company.Company;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ChargingStation {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private BigDecimal currentLoad;
    private Boolean chargingStationStatus;
    private LocalDate createdDay;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id")
    private Location location;


    public ChargingStation() {
    }

    public ChargingStation(String name, BigDecimal currentLoad, Boolean chargingStationStatus, Company company, LocalDate createdDay) {
        this.name = name;
        this.currentLoad = currentLoad;
        this.chargingStationStatus = chargingStationStatus;
        this.company = company;
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

    public BigDecimal getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(BigDecimal currentLoad) {
        this.currentLoad = currentLoad;
    }

    public Boolean getChargingStationStatus() {
        return chargingStationStatus;
    }

    public void setChargingStationStatus(Boolean chargingStationStatus) {
        this.chargingStationStatus = chargingStationStatus;
    }



    public LocalDate getCreatedDay() {
        return createdDay;
    }

    public void setCreatedDay(LocalDate createdDay) {
        this.createdDay = createdDay;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
