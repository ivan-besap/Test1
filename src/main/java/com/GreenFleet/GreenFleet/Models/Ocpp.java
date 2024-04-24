package com.GreenFleet.GreenFleet.Models;


import com.GreenFleet.GreenFleet.Models.Authentication.Authentication;
import com.GreenFleet.GreenFleet.Models.Charger.Charger;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ocpp {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String version;

    @OneToMany(mappedBy = "ocpp", fetch = FetchType.EAGER)
    private Set<Authentication> authentications;
    @OneToMany(mappedBy = "ocpp", fetch = FetchType.EAGER)
    private Set<Charger> chargers;

    public Ocpp() {
    }

    public Ocpp(String version) {
        this.version = version;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public Set<Charger> getChargers() {
        return chargers;
    }
    public void setChargers(Set<Charger> chargers) {
        this.chargers = chargers;
    }

    public Set<Authentication> getAuthentications() {
        return authentications;
    }

    public void setAuthentications(Set<Authentication> authentications) {
        this.authentications = authentications;
    }
}
