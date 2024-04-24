package com.GreenFleet.GreenFleet.Models.Charger;

import com.GreenFleet.GreenFleet.Models.ChargingStation.ChargingStation;
import com.GreenFleet.GreenFleet.Models.Company.Company;


import com.GreenFleet.GreenFleet.Models.Connector.Connector;
import com.GreenFleet.GreenFleet.Models.Ocpp;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.TransactionDetail;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Charger {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;
    private Time estimatedLoadingTime;
    private BigDecimal voltage;
    private Boolean enabled;
    private LocalDate createdDay;
    private TypeOfLoad typeOfLoads;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ocpp_id")
    private Ocpp ocpp;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "charging_station_id")
    private ChargingStation chargerStation;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "charging_unit_id")
    private ChargingUnit chargingUnit;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "charger_id")
    private Set<TransactionDetail> transactionDetails = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "connector_id")
    private Set<Connector> connectors = new HashSet<>();




    public Charger() {
    }


    public Charger(String model, Time estimatedLoadingTime, BigDecimal voltage, Boolean enabled, TypeOfLoad typeOfLoad, LocalDate createdDay) {
        this.model = model;
        this.estimatedLoadingTime = estimatedLoadingTime;
        this.voltage = voltage;
        this.enabled = enabled;
        this.typeOfLoads = typeOfLoad;
        this.createdDay = createdDay;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Time getEstimatedLoadingTime() {
        return estimatedLoadingTime;
    }

    public void setEstimatedLoadingTime(Time estimatedLoadingTime) {
        this.estimatedLoadingTime = estimatedLoadingTime;
    }

    public BigDecimal getVoltage() {
        return voltage;
    }

    public void setVoltage(BigDecimal voltage) {
        this.voltage = voltage;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public ChargingStation getChargerStation() {
        return chargerStation;
    }

    public void setChargerStation(ChargingStation chargerStation) {
        this.chargerStation = chargerStation;
    }

    public ChargingUnit getChargingUnit() {
        return chargingUnit;
    }

    public void setChargingUnit(ChargingUnit chargingUnit) {
        this.chargingUnit = chargingUnit;
    }

    public Set<TransactionDetail> getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(Set<TransactionDetail> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public TypeOfLoad getTypeOfLoads() {
        return typeOfLoads;
    }

    public void setTypeOfLoads(TypeOfLoad typeOfLoads) {
        this.typeOfLoads = typeOfLoads;
    }

    public Set<Connector> getConnectors() {
        return connectors;
    }

    public void setConnectors(Set<Connector> connectors) {
        this.connectors = connectors;
    }

    public Ocpp getOcpp() {
        return ocpp;
    }

    public void setOcpp(Ocpp ocpp) {
        this.ocpp = ocpp;
    }

}
