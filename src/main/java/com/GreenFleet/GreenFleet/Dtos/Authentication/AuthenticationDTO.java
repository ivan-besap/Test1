package com.GreenFleet.GreenFleet.Dtos.Authentication;

import com.GreenFleet.GreenFleet.Models.Authentication.Authentication;
import com.GreenFleet.GreenFleet.Models.Authentication.AuthenticationType;
import com.GreenFleet.GreenFleet.Models.Authentication.CommunicationProtocol;
import com.GreenFleet.GreenFleet.Models.Authentication.SecurityType;
import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Models.Ocpp;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Set;

public class AuthenticationDTO {
    private Long id;
    private String name;
    private String description;
    private Boolean requiresPhysicalDevice;
    @Enumerated(EnumType.STRING)
    private CommunicationProtocol communicationProtocol;
    private SecurityType levelSecurity;
    private Ocpp ocpp;
    private AuthenticationType authenticationTypes;


    public AuthenticationDTO(Authentication authentication) {
        this.id = authentication.getId();
        this.name = authentication.getName();
        this.description = authentication.getDescription();
        this.requiresPhysicalDevice = authentication.getRequiresPhysicalDevice();
        this.communicationProtocol = authentication.getCommunicationProtocol();
        this.levelSecurity = authentication.getLevelSecurity();
        this.ocpp = authentication.getOcpp();
        this.authenticationTypes = authentication.getAuthenticationTypes();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getRequiresPhysicalDevice() {
        return requiresPhysicalDevice;
    }

    public CommunicationProtocol getCommunicationProtocol() {
        return communicationProtocol;
    }

    public SecurityType getLevelSecurity() {
        return levelSecurity;
    }

    public Ocpp getOcpp() {
        return ocpp;
    }

    public AuthenticationType getAuthenticationTypes() {
        return authenticationTypes;
    }
}
