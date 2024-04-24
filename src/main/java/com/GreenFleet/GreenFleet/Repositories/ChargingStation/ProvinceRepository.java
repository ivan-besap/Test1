package com.GreenFleet.GreenFleet.Repositories.ChargingStation;


import com.GreenFleet.GreenFleet.Models.ChargingStation.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
