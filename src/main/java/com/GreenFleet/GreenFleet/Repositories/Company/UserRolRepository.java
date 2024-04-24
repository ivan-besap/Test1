package com.GreenFleet.GreenFleet.Repositories.Company;

import com.GreenFleet.GreenFleet.Models.Company.UserRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRolRepository extends JpaRepository<UserRol, Long> {
}
