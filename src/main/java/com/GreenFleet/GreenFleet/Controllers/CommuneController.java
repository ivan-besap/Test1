package com.GreenFleet.GreenFleet.Controllers;

import com.GreenFleet.GreenFleet.Models.ChargingStation.Commune;
import com.GreenFleet.GreenFleet.Repositories.ChargingStation.CommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CommuneController {
    @Autowired
    private CommuneRepository communeRepository;

    @GetMapping("/commune")
    public List<Commune> getCommunes() {
        return communeRepository.findAll().stream().map(Commune -> new Commune()).collect(Collectors.toList());
    }

}
