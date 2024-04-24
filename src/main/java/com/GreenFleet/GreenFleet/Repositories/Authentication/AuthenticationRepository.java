package com.GreenFleet.GreenFleet.Repositories.Authentication;

import com.GreenFleet.GreenFleet.Models.Authentication.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthenticationRepository extends JpaRepository<Authentication, Long> {
}
