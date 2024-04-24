package com.GreenFleet.GreenFleet.Models.ChargingStation;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Commune {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "province_id")
    private Province province;
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id")
    private Location location;
    public Commune() {
    }

    public Commune(String name) {
        this.name = name;

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

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
