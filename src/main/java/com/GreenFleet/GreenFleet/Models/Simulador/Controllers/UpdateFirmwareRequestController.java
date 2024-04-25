package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import com.GreenFleet.GreenFleet.Models.Simulador.DTOs.UpdateFirmwareRequestDTO;
import com.GreenFleet.GreenFleet.Models.Simulador.Repositories.UpdateFirmwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UpdateFirmwareRequestController {
    @Autowired
    private UpdateFirmwareRepository updateFirmwareRepository;

    @GetMapping("/updateFirmware")
    public String updateFirmwareResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"message\": \"The firmware update request has been received and is being processed.\",\n" +
                "    \"details\": {\n" +
                "        \"estimatedTime\": \"2 hours\",\n" +
                "        \"location\": \"http://example.com/firmware\",\n" +
                "        \"retrieveDate\": \"2024-04-24T12:00:00\",\n" +
                "        \"retries\": 3,\n" +
                "        \"retryInterval\": 60\n" +
                "    }\n" +
                "}";
    }

}
