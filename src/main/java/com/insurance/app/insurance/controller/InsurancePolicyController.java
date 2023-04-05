package com.insurance.app.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.app.insurance.models.InsurancePolicy;
import com.insurance.app.insurance.services.InsurancePolicyService;

@RestController
@RequestMapping("/api/v1/insurance-policy")
public class InsurancePolicyController {

    @Autowired
    private InsurancePolicyService insurancePolicyService;

    public InsurancePolicyController(InsurancePolicyService insurancePolicyService) {
        this.insurancePolicyService = insurancePolicyService;
    }

    public InsurancePolicyController() {
    }

    public InsurancePolicyService getInsurancePolicyService() {
        return insurancePolicyService;
    }

    @PostMapping("/save")
    public InsurancePolicy saveInsurancePolicyData(@RequestBody InsurancePolicy insurancePolicy) {
        return insurancePolicyService.saveInsurancePolicyData(insurancePolicy);
    }

    @PutMapping("/update")
    public InsurancePolicy updateInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy) {
        return insurancePolicyService.updateInsurancePolicy(insurancePolicy);
    }

    @DeleteMapping("/delete")
    public String deleteInsurancePolicy(Long id) {
        return insurancePolicyService.deleteInsurancePolicy(id);
    }

    @GetMapping("/get/{id}")
    public InsurancePolicy getInsurancePolicyById(Long id) {
        return insurancePolicyService.getInsurancePolicyById(id);
    }

    @GetMapping("/get")
    public List<InsurancePolicy> getInsurancePolicies() {
        return insurancePolicyService.getInsurancePolicies();
    }

}
