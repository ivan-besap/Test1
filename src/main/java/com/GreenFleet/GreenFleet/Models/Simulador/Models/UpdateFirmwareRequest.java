package com.GreenFleet.GreenFleet.Models.Simulador.Models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class UpdateFirmwareRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String location;
    @NotNull
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
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
