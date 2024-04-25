package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TriggerMessageController {

    @GetMapping("/triggerMessage")
    public String triggerMessageResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"requestedMessage\": \"StatusNotification\"\n" +
                "}";
    }

}
