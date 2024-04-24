package com.GreenFleet.GreenFleet.Dtos.Company;

import com.GreenFleet.GreenFleet.Models.Company.Rol;
import com.GreenFleet.GreenFleet.Models.Company.UserRol;

public class RolDTO {
    private Long id;
    private String authority;


    public RolDTO(Rol rol) {
        id = rol.getId();
        authority = rol.getAuthority();

    }

    public Long getId() {
        return id;
    }
    public String getAuthority() {
        return authority;
    }

}
