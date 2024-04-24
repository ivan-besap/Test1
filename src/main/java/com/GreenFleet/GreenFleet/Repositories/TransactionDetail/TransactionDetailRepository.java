package com.GreenFleet.GreenFleet.Repositories.TransactionDetail;

import com.GreenFleet.GreenFleet.Models.TransactionDetail.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Long> {
}
