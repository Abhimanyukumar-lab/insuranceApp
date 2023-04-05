package com.insurance.app.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.app.insurance.models.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

    // Claim findByName(String name);

    // Claim findByName(String name);
}
