package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StartTransactionController {
    @GetMapping("/startTransaction")
    public String startTransactionResponse() {
        return "{\n" +
                "    \"idTagInfo\": {\n" +
                "        \"status\": \"Accepted\",\n" +
                "        \"expiryDate\": \"2024-04-25T12:00:00\",\n" +
                "        \"parentIdTag\": \"ABC123\",\n" +
                "        \"parentExpireDate\": \"2025-04-25T12:00:00\"\n" +
                "    },\n" +
                "    \"transactionId\": 123456\n" +
                "}";
    }

}
