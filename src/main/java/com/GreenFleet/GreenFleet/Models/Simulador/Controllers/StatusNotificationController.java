package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StatusNotificationController {
    @GetMapping("/statusNotification")
    public String statusNotificationResponse() {
        return "{\n" +
                "    \"status\": \"Received\"\n" +
                "}";
    }

}
