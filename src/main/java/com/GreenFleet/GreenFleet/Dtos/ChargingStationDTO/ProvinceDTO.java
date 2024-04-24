package com.GreenFleet.GreenFleet.Dtos.ChargingStationDTO;

import com.GreenFleet.GreenFleet.Models.ChargingStation.Commune;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Province;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Region;

import java.util.Set;
import java.util.stream.Collectors;

public class ProvinceDTO {
    private Long id;
    private String name;
    private Region region;
    private Set<Commune> commune;

    public ProvinceDTO(Province province) {
        id = province.getId();
        name = province.getName();
        region = province.getRegion();
        commune = province.getCommunes().stream().collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Region getRegion() {
        return region;
    }

    public Set<Commune> getCommune() {
        return commune;
    }
}
