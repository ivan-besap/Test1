package com.GreenFleet.GreenFleet.Models.Simulador.DTOs;

import java.time.LocalDateTime;

public class UpdateFirmwareRequestDTO {

    private String location;
    private LocalDateTime retrieveDate;
    private Integer retries;
    private Integer retryInterval;


    public UpdateFirmwareRequestDTO( String location, LocalDateTime retrieveDate, Integer retries, Integer retryInterval) {
        this.location = location;
        this.retrieveDate = retrieveDate;
        this.retries = retries;
        this.retryInterval = retryInterval;
    }

    public String getLocation() {
        return location;
    }
    public LocalDateTime getRetrieveDate() {
        return retrieveDate;
    }
    public Integer getRetries() {
        return retries;
    }
    public Integer getRetryInterval() {
        return retryInterval;
    }
}
