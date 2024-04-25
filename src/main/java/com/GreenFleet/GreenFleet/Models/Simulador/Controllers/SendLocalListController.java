package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SendLocalListController {

    @GetMapping("/sendLocalList")
    public String sendLocalListResponse() {
        return "{\n" +
                "    \"status\": \"Accepted\",\n" +
                "    \"message\": \"Local authorization list has been successfully updated.\",\n" +
                "    \"details\": {\n" +
                "        \"listVersion\": 2,\n" +
                "        \"localAuthorizationList\": [\n" +
                "            {\n" +
                "                \"idTag\": \"ABC123\",\n" +
                "                \"idTagInfo\": {\n" +
                "                    \"status\": \"Accepted\",\n" +
                "                    \"expiryDate\": \"2024-12-31T23:59:59\",\n" +
                "                    \"parentIdTag\": \"\",\n" +
                "                    \"parentExpireDate\": \"\"\n" +
                "                }\n" +
                "            },\n" +
                "            {\n" +
                "                \"idTag\": \"DEF456\",\n" +
                "                \"idTagInfo\": {\n" +
                "                    \"status\": \"Accepted\",\n" +
                "                    \"expiryDate\": \"2024-12-31T23:59:59\",\n" +
                "                    \"parentIdTag\": \"ABC123\",\n" +
                "                    \"parentExpireDate\": \"2024-12-31T23:59:59\"\n" +
                "                }\n" +
                "            }\n" +
                "        ],\n" +
                "        \"updateType\": \"Differential\"\n" +
                "    }\n" +
                "}";
    }
}
