package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RemoteStartTransactionController {
    @GetMapping("/remoteStartTransaction")
    public String remoteStartTransactionResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"message\": \"La transacción ha sido iniciada exitosamente.\",\n" +
                "    \"transactionInfo\": {\n" +
                "        \"transactionId\": 123456,\n" +
                "        \"connectorId\": 1,\n" +
                "        \"startTime\": \"2024-04-24T12:00:00\",\n" +
                "        \"expiryTime\": \"2024-04-24T13:00:00\",\n" +
                "        \"chargingProfile\": {\n" +
                "            \"chargingProfileId\": 7890,\n" +
                "            \"stackLevel\": 1,\n" +
                "            \"chargingProfilePurpose\": \"TxProfile\",\n" +
                "            \"chargingProfileKind\": \"Absolute\",\n" +
                "            \"recurrencyKind\": \"Daily\",\n" +
                "            \"validFrom\": \"2024-04-24T00:00:00\",\n" +
                "            \"validTo\": \"2024-04-25T00:00:00\",\n" +
                "            \"chargingSchedule\": {\n" +
                "                \"duration\": 3600,\n" +
                "                \"startSchedule\": \"2024-04-24T12:00:00\",\n" +
                "                \"chargingRateUnit\": \"W\",\n" +
                "                \"chargingSchedulePeriod\": [\n" +
                "                    {\n" +
                "                        \"startPeriod\": 0,\n" +
                "                        \"limit\": 10000,\n" +
                "                        \"numberPhases\": 3\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"startPeriod\": 1800,\n" +
                "                        \"limit\": 5000,\n" +
                "                        \"numberPhases\": 1\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"minChargingRate\": 2000\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

}
