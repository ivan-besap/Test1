package com.GreenFleet.GreenFleet.Repositories.ChargingStation;


import com.GreenFleet.GreenFleet.Models.ChargingStation.ChargingStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChargingStationRepository extends JpaRepository<ChargingStation, Long> {
}
