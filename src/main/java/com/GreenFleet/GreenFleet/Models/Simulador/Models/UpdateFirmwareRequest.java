package com.GreenFleet.GreenFleet.Models.Simulador;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class UpdateFirmwareRequest {

    @NotNull// Add validation (optional)
    private String location;
    @NotNull // Add validation (optional)
    private LocalDateTime retrieveDate;
    private Integer retries;
    private Integer retryInterval;

    public UpdateFirmwareRequest() {
    }

    public UpdateFirmwareRequest(String location, LocalDateTime retrieveDate, Integer retries, Integer retryInterval) {
        this.location = location;
        this.retrieveDate = retrieveDate;
        this.retries = retries;
        this.retryInterval = retryInterval;
    }

    // Getters and setters
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public LocalDateTime getRetrieveDate() {
        return retrieveDate;
    }
    public void setRetrieveDate(LocalDateTime retrieveDate) {
        this.retrieveDate = retrieveDate;
    }
    public Integer getRetries() {
        return retries;
    }
    public void setRetries(Integer retries) {
        this.retries = retries;
    }
    public Integer getRetryInterval() {
        return retryInterval;
    }
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }
}
