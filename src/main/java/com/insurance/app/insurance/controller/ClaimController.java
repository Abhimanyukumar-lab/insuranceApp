package com.insurance.app.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.app.insurance.models.Claim;
import com.insurance.app.insurance.services.ClaimService;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @PostMapping("/addClaim")
    public Claim addClaim(@RequestBody Claim claim) {
        return claimService.saveClaimData(claim);
    }

    @PostMapping("/addClaims")
    public List<Claim> createClaims(@RequestBody List<Claim> claims) {
        return claimService.saveClaimsData(claims);
    }

    @GetMapping("/claims")
    public List<Claim> findAllClaims() {
        return claimService.getClaims();
    }

    @GetMapping("/claimById/{id}")
    public Claim findClaimById(@PathVariable Long id) {
        return claimService.getClaimById(id);
    }

    // @GetMapping("/claimByName/{name}")
    // public Claim findClaimByName(@PathVariable String name) {
    // return claimService.getClaimByName(name);
    // }

    @PutMapping("/update")
    public Claim updateClaim(@RequestBody Claim claim) {
        return claimService.updateClaim(claim);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClaim(@PathVariable Long id) {
        return claimService.deleteClaim(id);
    }

}
