package com.GreenFleet.GreenFleet.Models.Simulador.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetDiagnosticsController {

    @GetMapping("/getDiagnostics")
    public String getDiagnosticsResponse() {
        return "{\n" +
                "    \"fileName\": \"diagnostics_report_2024-04-24.json\"\n" +
                "}";
    }
}
