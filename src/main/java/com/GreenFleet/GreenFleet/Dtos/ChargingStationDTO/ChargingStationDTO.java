package com.GreenFleet.GreenFleet.Dtos.ChargingStationDTO;

import com.GreenFleet.GreenFleet.Models.Charger.Charger;
import com.GreenFleet.GreenFleet.Models.ChargingStation.ChargingStation;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Location;
import com.GreenFleet.GreenFleet.Models.Company.Company;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ChargingStationDTO {
    private Long id;
    private String name;
    private BigDecimal currentLoad;
    private Boolean chargingStationStatus;
    private LocalDate createdDay;
    private Location location;
    private Company company;


    public ChargingStationDTO(ChargingStation chargingStation) {
        this.id = chargingStation.getId();
        this.name = chargingStation.getName();
        this.currentLoad = chargingStation.getCurrentLoad();
        this.chargingStationStatus = chargingStation.getChargingStationStatus();
        this.createdDay = chargingStation.getCreatedDay();
        this.location = chargingStation.getLocation();
        this.company = chargingStation.getCompany();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCurrentLoad() {
        return currentLoad;
    }

    public Boolean getChargingStationStatus() {
        return chargingStationStatus;
    }

    public LocalDate getCreatedDay() {
        return createdDay;
    }

    public Location getLocation() {
        return location;
    }

    public Company getCompany() {
        return company;
    }
}
