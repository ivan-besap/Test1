package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReserveNowController {
    @GetMapping("/reserveNow")
    public String reserveNowResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"message\": \"La reserva ha sido realizada con éxito.\",\n" +
                "    \"details\": {\n" +
                "        \"connectorId\": 1,\n" +
                "        \"expiryDate\": \"2024-04-25T12:00:00\",\n" +
                "        \"idTag\": \"ABC123\",\n" +
                "        \"reservationId\": 123456\n" +
                "    }\n" +
                "}";
    }
}
