package com.GreenFleet.GreenFleet.Dtos.TransactionDetail;

import com.GreenFleet.GreenFleet.Models.TransactionDetail.Car;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.Client;

public class CarDTO {
    private Long id;
    private String licensePlate;
    private String model;
    private Client client;

    public CarDTO(Car car) {
        this.id = car.getId();
        this.licensePlate = car.getLicensePlate();
        this.model = car.getModel();
        this.client = car.getClient();
    }

    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public Client getClient() {
        return client;
    }
}
