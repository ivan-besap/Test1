package com.GreenFleet.GreenFleet.Models.Company;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserRol {
    @Id
    @GenericGenerator(name = "native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy = "userRol", fetch = FetchType.EAGER)
    private Set<Employee> employees = new HashSet<>();
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_id")
    private Rol userRol;

    public UserRol() {
    }

    public UserRol(Rol userRol) {
        this.userRol = userRol;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Rol getRol() {
        return userRol;
    }
    public void setRol(Rol rol) {
        this.userRol = rol;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Rol getUserRol() {
        return userRol;
    }

    public void setUserRol(Rol userRol) {
        this.userRol = userRol;
    }
}
