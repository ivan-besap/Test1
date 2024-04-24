package com.GreenFleet.GreenFleet.Models.ChargingStation;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Province {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "region_id")
    private Region region;
    @OneToMany(mappedBy = "province", fetch = FetchType.EAGER)
    private Set<Commune> communes = new HashSet<>();


    public Province() {
    }

    public void addComune(Commune commune) {
        commune.setProvince(this);
        this.communes.add(commune);
    }
    public Province(String name) {
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

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Region getRegionId() {
        return region;
    }

    public void setRegionId(Region regionId) {
        this.region = regionId;
    }

    public Set<Commune> getCommunes() {
        return communes;
    }

    public void setCommunes(Set<Commune> communes) {
        this.communes = communes;
    }
}
