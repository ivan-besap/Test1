package com.GreenFleet.GreenFleet.Models.ChargingStation;


import com.GreenFleet.GreenFleet.Models.Company.Company;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "commune_id")
    private Commune commune;
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "province_id")
    private Province province;
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "region_id")
    private Region region;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "chargingStation")
    private ChargingStation chargingStation;


    public Location() {
    }

    public Location(String name, Commune commune, Province province, Region region) {
        this.name = name;
        this.commune = commune;
        this.province = province;
        this.region = region;
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


    public ChargingStation getChargingStation() {
        return chargingStation;
    }

    public void setChargingStation(ChargingStation chargingStation) {
        this.chargingStation = chargingStation;
    }

    public Commune getCommuneId() {
        return commune;
    }
    public void setCommuneId(Commune communeId) {
        this.commune = communeId;
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
}

