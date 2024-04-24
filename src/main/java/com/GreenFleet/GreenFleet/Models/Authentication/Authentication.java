package com.GreenFleet.GreenFleet.Models.Authentication;

import com.GreenFleet.GreenFleet.Models.Company.Company;
import com.GreenFleet.GreenFleet.Models.Ocpp;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Authentication {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Boolean requiresPhysicalDevice;
    @Enumerated(EnumType.STRING)
    private CommunicationProtocol communicationProtocol;
    private SecurityType levelSecurity;
    private AuthenticationType authenticationTypes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ocpp_id")
    private Ocpp ocpp;

    public Authentication() {
    }

    public Authentication(String name, String description, Boolean requiresPhysicalDevice, CommunicationProtocol communicationProtocol, SecurityType levelSecurity) {
        this.name = name;
        this.description = description;
        this.requiresPhysicalDevice = requiresPhysicalDevice;
        this.communicationProtocol = communicationProtocol;
        this.levelSecurity = levelSecurity;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getRequiresPhysicalDevice() {
        return requiresPhysicalDevice;
    }
    public void setRequiresPhysicalDevice(Boolean requiresPhysicalDevice) {
        this.requiresPhysicalDevice = requiresPhysicalDevice;
    }
    public CommunicationProtocol getCommunicationProtocol() {
        return communicationProtocol;
    }
    public void setCommunicationProtocol(CommunicationProtocol communicationProtocol) {
        this.communicationProtocol = communicationProtocol;
    }
    public SecurityType getLevelSecurity() {
        return levelSecurity;
    }
    public void setLevelSecurity(SecurityType levelSecurity) {
        this.levelSecurity = levelSecurity;
    }
    public Ocpp getOcpp() {
        return ocpp;
    }
    public void setOcpp(Ocpp ocpp) {
        this.ocpp = ocpp;
    }

    public AuthenticationType getAuthenticationTypes() {
        return authenticationTypes;
    }

    public void setAuthenticationTypes(AuthenticationType authenticationTypes) {
        this.authenticationTypes = authenticationTypes;
    }
}
