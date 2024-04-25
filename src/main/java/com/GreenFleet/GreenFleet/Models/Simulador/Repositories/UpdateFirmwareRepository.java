package com.GreenFleet.GreenFleet.Models.Simulador.Repositories;

import com.GreenFleet.GreenFleet.Models.Simulador.Models.UpdateFirmwareRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UpdateFirmwareRepository extends JpaRepository<UpdateFirmwareRequest, Long> {
}
