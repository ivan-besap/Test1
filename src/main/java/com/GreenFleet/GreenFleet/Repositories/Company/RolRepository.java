package com.GreenFleet.GreenFleet.Repositories.Company;


import com.GreenFleet.GreenFleet.Models.Company.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RolRepository extends JpaRepository<Rol, Long> {
}
