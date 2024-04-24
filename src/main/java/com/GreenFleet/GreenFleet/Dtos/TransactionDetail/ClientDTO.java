package com.GreenFleet.GreenFleet.Dtos.TransactionDetail;

import com.GreenFleet.GreenFleet.Models.TransactionDetail.Car;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.Client;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.TransactionDetail;

import java.util.Set;

public class ClientDTO {
    private Long id;
    private String name;
    private String email;
    private String lastName;
    private Integer phone;
    private Integer rut;
    private String checkDigit;
    private Set<Car> cars;
    private Set<TransactionDetail> transactionDetails;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.email = client.getEmail();
        this.lastName = client.getLastName();
        this.phone = client.getPhone();
        this.rut = client.getRut();
        this.checkDigit = client.getCheckDigit();
        this.cars = client.getCars();
        this.transactionDetails = client.getTransactionDetails();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getPhone() {
        return phone;
    }

    public Integer getRut() {
        return rut;
    }

    public String getCheckDigit() {
        return checkDigit;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public Set<TransactionDetail> getTransactionDetails() {
        return transactionDetails;
    }
}
