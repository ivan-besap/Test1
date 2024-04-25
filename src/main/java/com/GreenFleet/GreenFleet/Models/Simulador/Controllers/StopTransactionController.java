package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StopTransactionController {
    @GetMapping("/stopTransaction")
    public String stopTransactionResponse() {
        // Respuesta estática para la solicitud StopTransaction
        return "{\n" +
                "    \"idTagInfo\": {\n" +
                "        \"status\": \"Accepted\"\n" +
                "    }\n" +
                "}";
    }
}
