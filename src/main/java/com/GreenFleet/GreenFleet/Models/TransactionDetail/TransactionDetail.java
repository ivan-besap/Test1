package com.GreenFleet.GreenFleet.Models.TransactionDetail;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class TransactionDetail {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate loadingStartDate;
    private LocalDate loadingEndDate;
    private BigDecimal suppliedEnergy;
    private Integer cost;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;



    public TransactionDetail() {
    }

    public TransactionDetail(LocalDate loadingStartDate, LocalDate loadingEndDate, BigDecimal suppliedEnergy, Integer cost, Client client) {
        this.loadingStartDate = loadingStartDate;
        this.loadingEndDate = loadingEndDate;
        this.suppliedEnergy = suppliedEnergy;
        this.cost = cost;
        this.client = client;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLoadingStartDate() {
        return loadingStartDate;
    }

    public void setLoadingStartDate(LocalDate loadingStartDate) {
        this.loadingStartDate = loadingStartDate;
    }

    public LocalDate getLoadingEndDate() {
        return loadingEndDate;
    }

    public void setLoadingEndDate(LocalDate loadingEndDate) {
        this.loadingEndDate = loadingEndDate;
    }

    public BigDecimal getSuppliedEnergy() {
        return suppliedEnergy;
    }

    public void setSuppliedEnergy(BigDecimal suppliedEnergy) {
        this.suppliedEnergy = suppliedEnergy;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
