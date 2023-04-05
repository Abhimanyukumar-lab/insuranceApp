package com.insurance.app.insurance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.insurance.models.InsurancePolicy;
import com.insurance.app.insurance.repository.InsurancePolicyRepository;

@Service
public class InsurancePolicyService {

    @Autowired
    private InsurancePolicyRepository insurancePolicyRepository;

    public InsurancePolicyService(InsurancePolicyRepository insurancePolicyRepository) {
        this.insurancePolicyRepository = insurancePolicyRepository;
    }

    public InsurancePolicy saveInsurancePolicyData(InsurancePolicy insurancePolicy) {
        return insurancePolicyRepository.save(insurancePolicy);
    }

    public List<InsurancePolicy> saveInsurancePoliciesData(List<InsurancePolicy> insurancePolicies) {
        return insurancePolicyRepository.saveAll(insurancePolicies);
    }

    public List<InsurancePolicy> getInsurancePolicies() {
        return insurancePolicyRepository.findAll();
    }

    public InsurancePolicy getInsurancePolicyById(Long id) {
        return insurancePolicyRepository.findById(id).orElse(null);
    }

    public String deleteInsurancePolicy(Long id) {
        insurancePolicyRepository.deleteById(id);
        return "Insurance Policy removed !! " + id;
    }

    public InsurancePolicy updateInsurancePolicy(InsurancePolicy insurancePolicy) {
        InsurancePolicy existingInsurancePolicy = insurancePolicyRepository.findById(insurancePolicy.getId())
                .orElse(null);
        existingInsurancePolicy.setPolicyNumber(insurancePolicy.getPolicyNumber());
        existingInsurancePolicy.setPolicyType(insurancePolicy.getPolicyType());
        existingInsurancePolicy.setPolicyStatus(insurancePolicy.getPolicyStatus());
        existingInsurancePolicy.setPolicyStartDate(insurancePolicy.getPolicyStartDate());
        existingInsurancePolicy.setPolicyEndDate(insurancePolicy.getPolicyEndDate());
        existingInsurancePolicy.setPolicyAmount(insurancePolicy.getPolicyAmount());
        existingInsurancePolicy.setClient(insurancePolicy.getClient());
        existingInsurancePolicy.setClaims(insurancePolicy.getClaims());
        return insurancePolicyRepository.save(existingInsurancePolicy);
    }

}
