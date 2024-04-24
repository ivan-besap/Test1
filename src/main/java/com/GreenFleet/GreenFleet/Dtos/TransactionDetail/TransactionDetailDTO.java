package com.GreenFleet.GreenFleet.Dtos.TransactionDetail;

import com.GreenFleet.GreenFleet.Models.TransactionDetail.Client;
import com.GreenFleet.GreenFleet.Models.TransactionDetail.TransactionDetail;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionDetailDTO {
    private Long id;
    private LocalDate loadingStartDate;
    private LocalDate loadingEndDate;
    private BigDecimal suppliedEnergy;
    private Integer cost;
    private Client client;


    public TransactionDetailDTO(TransactionDetail transactionDetail) {
        this.id = transactionDetail.getId();
        this.loadingStartDate = transactionDetail.getLoadingStartDate();
        this.loadingEndDate = transactionDetail.getLoadingEndDate();
        this.suppliedEnergy = transactionDetail.getSuppliedEnergy();
        this.cost = transactionDetail.getCost();
        this.client = transactionDetail.getClient();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getLoadingStartDate() {
        return loadingStartDate;
    }

    public LocalDate getLoadingEndDate() {
        return loadingEndDate;
    }

    public BigDecimal getSuppliedEnergy() {
        return suppliedEnergy;
    }

    public Integer getCost() {
        return cost;
    }

    public Client getClient() {
        return client;
    }
}
