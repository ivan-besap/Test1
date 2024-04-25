package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResetController {

    @GetMapping("/reset")
    public String resetResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"message\": \"El dispositivo ha sido reiniciado con éxito.\",\n" +
                "    \"details\": {\n" +
                "        \"type\": \"Soft\",\n" +
                "        \"timestamp\": \"2024-04-25T08:30:00\",\n" +
                "        \"duration\": \"30 segundos\"\n" +
                "    }\n" +
                "}";
    }
}
