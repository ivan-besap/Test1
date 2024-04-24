package com.GreenFleet.GreenFleet.Repositories.Company;

import com.GreenFleet.GreenFleet.Models.Company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findByEmailCompany(String email);
    Company findById(long id);
    Company findByBusinessName(String businessName);
    boolean existsByBusinessName(String businessName);
}
