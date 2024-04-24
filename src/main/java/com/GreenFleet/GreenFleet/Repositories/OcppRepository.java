package com.GreenFleet.GreenFleet.Repositories;

import com.GreenFleet.GreenFleet.Models.Ocpp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OcppRepository extends JpaRepository<Ocpp, Long> {
}
