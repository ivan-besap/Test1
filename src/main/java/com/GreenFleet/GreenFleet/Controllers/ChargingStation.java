package com.GreenFleet.GreenFleet.Controllers;

import com.GreenFleet.GreenFleet.Repositories.ChargingStation.ChargingStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ChargingStation {
    @Autowired
    private ChargingStationRepository chargingStationRepository;

    @GetMapping("/chargingStation")
    public List<ChargingStation> getChargingStation() {
        return chargingStationRepository.findAll().stream().map(ChargingStation -> new ChargingStation()).collect(Collectors.toList());
    }

    @GetMapping("/chargingStation/status)
    public List<ChargingStation> getChargingStationStatus() {
        return chargingStationRepository.findAll().stream().map(ChargingStation -> new ChargingStation()).collect(Collectors.toList());
    }
}
