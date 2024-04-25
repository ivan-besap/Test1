package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RemoteStopTransactionController {

    @GetMapping("/remoteStopTransaction")
    public String remoteStopTransactionResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"message\": \"La transacción ha sido detenida exitosamente.\"\n" +
                "}";
    }
}
