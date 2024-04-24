package com.GreenFleet.GreenFleet.Dtos.Charger;

import com.GreenFleet.GreenFleet.Models.Charger.Charger;
import com.GreenFleet.GreenFleet.Models.Charger.ChargingUnit;

public class ChargingUnitDTO {
    private Long id;
    private String unit;


    public ChargingUnitDTO(ChargingUnit chargingUnit) {
        id = chargingUnit.getId();
        unit = chargingUnit.getUnit();
    }

    public Long getId() {
        return id;
    }
    public String getUnit() {
        return unit;
    }

}
