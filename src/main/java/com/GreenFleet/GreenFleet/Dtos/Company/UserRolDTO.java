package com.GreenFleet.GreenFleet.Dtos.Company;

import com.GreenFleet.GreenFleet.Models.Company.Rol;
import com.GreenFleet.GreenFleet.Models.Company.Employee;
import com.GreenFleet.GreenFleet.Models.Company.UserRol;

import java.util.Set;
import java.util.stream.Collectors;

public class UserRolDTO {
    private Long id;
    private Set<Employee> employee;
    private Rol rol;


    public UserRolDTO(UserRol userRol) {
        id = userRol.getId();

        rol = userRol.getRol();
    }

    public Long getId() {
        return id;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public Rol getRol() {
        return rol;
    }


}
