package com.GreenFleet.GreenFleet.Controllers;

import com.GreenFleet.GreenFleet.Models.ChargingStation.ChargingStation;
import com.GreenFleet.GreenFleet.Repositories.ChargingStation.ChargingStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChargingStationController { // Use a descriptive name like Controller

    @Autowired
    private ChargingStationRepository chargingStationRepository;

    @GetMapping("/chargingStations") // Use plural for consistency
    public List<ChargingStation> getChargingStations() {
        return chargingStationRepository.findAll(); // No need for stream and unnecessary object creation
    }
    @GetMapping("/authorize")
    public String authorizeResponse() {
        return "{\n" +
                "    \"idTagInfo\": {\n" +
                "        \"status\": \"Accepted\",\n" +
                "        \"expiryDate\": \"2024-05-25T10:00:00Z\",\n" +
                "        \"parentIdTag\": \"...\"\n" +
                "    }\n" +

                "}";
    }


}
