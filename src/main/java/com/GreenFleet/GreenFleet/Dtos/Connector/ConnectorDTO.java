package com.GreenFleet.GreenFleet.Dtos.Connector;

import com.GreenFleet.GreenFleet.Models.Charger.Charger;
import com.GreenFleet.GreenFleet.Models.Connector.Connector;
import com.GreenFleet.GreenFleet.Models.Connector.ConnectorStatus;

import java.math.BigDecimal;

public class ConnectorDTO {
    private Long id;
    private String name;
    private BigDecimal power;
    private ConnectorStatus connectorStatus;
    private BigDecimal charge;
    private Charger charger;



    public ConnectorDTO(Connector connector) {
        this.id = connector.getId();
        this.name = connector.getName();
        this.power = connector.getPower();
        this.connectorStatus = connector.getConnectorStatus();
        this.charge = connector.getCharge();
        this.charger = connector.getCharger();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPower() {
        return power;
    }

    public ConnectorStatus getConnectorStatus() {
        return connectorStatus;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public Charger getCharger() {
        return charger;
    }
}
