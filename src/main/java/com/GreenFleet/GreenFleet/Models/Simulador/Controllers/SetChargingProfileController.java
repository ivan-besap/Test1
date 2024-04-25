package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SetChargingProfileController {
    @GetMapping("/setChargingProfile")
    public String setChargingProfileResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"message\": \"Charging profile has been successfully set.\",\n" +
                "    \"details\": {\n" +
                "        \"connectorId\": 1,\n" +
                "        \"csChargingProfiles\": {\n" +
                "            \"chargingProfileId\": 12345,\n" +
                "            \"stackLevel\": 1,\n" +
                "            \"chargingProfilePurpose\": \"TxDefaultProfile\",\n" +
                "            \"chargingProfileKind\": \"Recurring\",\n" +
                "            \"recurrencyKind\": \"Daily\",\n" +
                "            \"validFrom\": \"2024-04-24T00:00:00\",\n" +
                "            \"validTo\": \"2024-04-25T00:00:00\",\n" +
                "            \"chargingSchedule\": {\n" +
                "                \"duration\": 7200,\n" +
                "                \"startSchedule\": \"2024-04-24T08:00:00\",\n" +
                "                \"chargingRateUnit\": \"W\",\n" +
                "                \"chargingSchedulePeriod\": [\n" +
                "                    {\n" +
                "                        \"startPeriod\": 0,\n" +
                "                        \"limit\": 10000,\n" +
                "                        \"numberPhases\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"startPeriod\": 3600,\n" +
                "                        \"limit\": 8000,\n" +
                "                        \"numberPhases\": 1\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"minChargingRate\": 5000\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }
}
