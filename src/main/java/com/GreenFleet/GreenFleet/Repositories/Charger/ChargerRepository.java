package com.GreenFleet.GreenFleet.Repositories.Charger;

import com.GreenFleet.GreenFleet.Models.Charger.Charger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChargerRepository extends JpaRepository<Charger, Long> {
}
