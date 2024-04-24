package com.GreenFleet.GreenFleet.Dtos.ChargingStationDTO;

import com.GreenFleet.GreenFleet.Models.ChargingStation.Province;
import com.GreenFleet.GreenFleet.Models.ChargingStation.Region;

public class RegionDTO {
    private Long id;
    private String name;
    private Integer number;
    private Province province;

    public RegionDTO(Region region) {
        id = region.getId();
        name = region.getName();
        number = region.getNumber();
        province = region.getProvince();
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getNumber() {
        return number;
    }
    public Province getProvince() {
        return province;
    }
}
