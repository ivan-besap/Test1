package com.GreenFleet.GreenFleet.Models.ChargingStation;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Region {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer number;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "province_id")
    private Province province;

    public Region() {
    }

    public Region(String name, Integer number) {
        this.name = name;
        this.number = number;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
