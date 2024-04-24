package com.GreenFleet.GreenFleet.Dtos.ChargingStationDTO;

import com.GreenFleet.GreenFleet.Models.ChargingStation.Commune;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Location;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Province;

public class CommuneDTO {
    private Long id;
    private String name;



    public CommuneDTO(Commune commune) {
        id = commune.getId();
        name = commune.getName();
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

}
