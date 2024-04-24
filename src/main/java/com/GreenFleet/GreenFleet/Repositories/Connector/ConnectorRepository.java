package com.GreenFleet.GreenFleet.Repositories.Connector;

import com.GreenFleet.GreenFleet.Models.Connector.Connector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConnectorRepository extends JpaRepository<Connector, Long> {
}
