package com.insurance.app.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.app.insurance.models.InsurancePolicy;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {
}
