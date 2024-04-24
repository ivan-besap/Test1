package com.GreenFleet.GreenFleet.Dtos;

import com.GreenFleet.GreenFleet.Models.Authentication.Authentication;
import com.GreenFleet.GreenFleet.Models.Charger.Charger;
import com.GreenFleet.GreenFleet.Models.Ocpp;

import java.util.Set;

public class OcppDTO {
    private Long id;
    private String version;
    private Set<Authentication> authentications;
    private Set<Charger> chargers;


    public OcppDTO(Ocpp ocpp) {
        this.id = ocpp.getId();
        this.version = ocpp.getVersion();
        this.authentications = ocpp.getAuthentications();
        this.chargers = ocpp.getChargers();
    }

    public Long getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public Set<Authentication> getAuthentications() {
        return authentications;
    }

    public Set<Charger> getChargers() {
        return chargers;
    }
}
