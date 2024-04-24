package com.GreenFleet.GreenFleet.Repositories.ChargingStation;


import com.GreenFleet.GreenFleet.Models.ChargingStation.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegionRepository extends JpaRepository<Region, Long> {
}
