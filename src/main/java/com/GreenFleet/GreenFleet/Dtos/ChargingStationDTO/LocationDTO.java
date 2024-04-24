package com.GreenFleet.GreenFleet.Dtos.ChargingStationDTO;

import com.GreenFleet.GreenFleet.Models.ChargingStation.*;
import com.GreenFleet.GreenFleet.Models.Company.Company;

import java.util.Set;

public class LocationDTO {
    private Long id;
    private String name;
    private Commune commune;
    private Province province;
    private Region region;
    private Company company;
    private ChargingStation chargingStations;


    public LocationDTO(Location location) {
        id = location.getId();
        name = location.getName();
        commune = location.getCommune();
        province = location.getProvince();
        region = location.getRegion();
        company = location.getCompany();
        chargingStations = location.getChargingStation();
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

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ChargingStation getChargingStations() {
        return chargingStations;
    }

    public void setChargingStations(ChargingStation chargingStations) {
        this.chargingStations = chargingStations;
    }
}
