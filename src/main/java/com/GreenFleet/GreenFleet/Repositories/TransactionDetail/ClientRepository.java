package com.GreenFleet.GreenFleet.Repositories.TransactionDetail;

import com.GreenFleet.GreenFleet.Models.TransactionDetail.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);
}
