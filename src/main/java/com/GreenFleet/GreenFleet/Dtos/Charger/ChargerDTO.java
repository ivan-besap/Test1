package com.GreenFleet.GreenFleet.Dtos.Charger;

import com.GreenFleet.GreenFleet.Models.Charger.Charger;
import com.GreenFleet.GreenFleet.Models.Charger.ChargingUnit;
import com.GreenFleet.GreenFleet.Models.Charger.TypeOfLoad;
import com.GreenFleet.GreenFleet.Models.ChargingStation.ChargingStation;
import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Models.Connector.Connector;
import com.GreenFleet.GreenFleet.Models.Ocpp;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.TransactionDetail;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class ChargerDTO {
    private Long id;
    private String model;
    private Time estimatedLoadingTime;
    private BigDecimal voltage;
    private Boolean enabled;
    private TypeOfLoad typeOfLoad;
    private LocalDate createdDay;
    private Ocpp ocpp;
    private Company owner;
    private Company maker;
    private Set<TransactionDetail> transactionDetail;
    private ChargingUnit chargingUnit;
    private ChargingStation chargerStation;
    private Set<Connector> connectors;

    public ChargerDTO() {
    }

    public ChargerDTO(Charger charger) {
        this.id = charger.getId();
        this.model = charger.getModel();
        this.estimatedLoadingTime = charger.getEstimatedLoadingTime();
        this.voltage = charger.getVoltage();
        this.enabled = charger.getEnabled();
        this.typeOfLoad = charger.getTypeOfLoads();
        this.createdDay = charger.getCreatedDay();
        this.ocpp = charger.getOcpp();
        this.owner = charger.getCompany();
        this.maker = charger.getCompany();
        this.transactionDetail = charger.getTransactionDetails().stream().map(TransactionDetail -> new TransactionDetail()).collect(Collectors.toSet());
        this.chargingUnit = charger.getChargingUnit();
        this.chargerStation = charger.getChargerStation();
        this.connectors = charger.getConnectors().stream().map(Connector -> new Connector()).collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public Time getEstimatedLoadingTime() {
        return estimatedLoadingTime;
    }
    public BigDecimal getVoltage() {
        return voltage;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public LocalDate getCreatedDay() {
        return createdDay;
    }
    public Ocpp getOcpp() {
        return ocpp;
    }
    public Company getOwner() {
        return owner;
    }
    public Company getMaker() {
        return maker;
    }
    public Set<TransactionDetail> getTransactionDetail() {
        return transactionDetail;
    }
    public ChargingUnit getChargingUnit() {
        return chargingUnit;
    }
    public ChargingStation getChargerStation() {
        return chargerStation;
    }
    public Set<Connector> getConnectors() {
        return connectors;
    }

    public TypeOfLoad getTypeOfLoad() {
        return typeOfLoad;
    }
}
