package com.GreenFleet.GreenFleet.Controllers;

import com.GreenFleet.GreenFleet.Dtos.ChargingStationDTO.LocationDTO;
import com.GreenFleet.GreenFleet.Repositories.ChargingStation.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class LocationController {
    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/location")
    public List<LocationDTO> getLocationsDTO() {
        return locationRepository.findAll()
                .stream()
                .map(LocationDTO::new)
                .collect(Collectors.toList());
    }
}
