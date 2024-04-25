package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
public class HeartbeatController {

    @GetMapping("/heartbeat")
    public String heartbeatResponse() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        return "{\n" +
                "    \"currentTime\": \"" + formattedTime + "\",\n" +
                "    \"status\": \"OK\",\n" +
                "    \"uptime\": \"5 days 12 hours 30 minutes\",\n" +
                "    \"connectedDevices\": 15,\n" +
                "    \"memoryUsage\": {\n" +
                "        \"total\": \"8 GB\",\n" +
                "        \"used\": \"3.5 GB\",\n" +
                "        \"free\": \"4.5 GB\"\n" +
                "    },\n" +
                "    \"cpuUsage\": \"20%\",\n" +
                "    \"networkStatus\": {\n" +
                "        \"interface\": \"eth0\",\n" +
                "        \"ipAddress\": \"192.168.1.100\",\n" +
                "        \"status\": \"Connected\"\n" +
                "    }\n" +
                "}";
    }

}
