package com.insurance.app.insurance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.insurance.models.Claim;
import com.insurance.app.insurance.repository.ClaimRepository;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public ClaimService(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    public Claim saveClaimData(Claim claim) {
        return claimRepository.save(claim);
    }

    public List<Claim> saveClaimsData(List<Claim> claims) {
        return claimRepository.saveAll(claims);
    }

    public List<Claim> getClaims() {
        return claimRepository.findAll();
    }

    public Claim getClaimById(Long id) {
        return claimRepository.findById(id).orElse(null);
    }

    // public Claim getClaimByName(String name) {
    // return claimRepository.findByName(name);
    // }

    public String deleteClaim(Long id) {
        claimRepository.deleteById(id);
        return "Claim removed !! " + id;
    }

    public Claim updateClaim(Claim claim) {
        Claim existingClaim = claimRepository.findById(claim.getId()).orElse(null);
        existingClaim.setName(claim.getName());
        existingClaim.setAddress(claim.getAddress());
        existingClaim.setPhone(claim.getPhone());
        existingClaim.setInsurancePolicies(claim.getInsurancePolicies());
        return claimRepository.save(existingClaim);
    }

}
