package com.insurance.app.insurance.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "claims")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotBlank
    private String claimNumber;

    // @NotBlank
    private String description;

    @Temporal(TemporalType.DATE)
    private Date claimDate;

    // @NotBlank
    private String claimStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "policy_id", nullable = false)
    private InsurancePolicy insurancePolicy;

    public Object getName() {
        return null;
    }

    public void setName(Object name) {
    }

    public Object getAddress() {
        return null;
    }

    public void setAddress(Object address) {
    }

    public Object getPhone() {
        return null;
    }

    public void setPhone(Object phone) {
    }

    public Object getInsurancePolicies() {
        return null;
    }

    public void setInsurancePolicies(Object insurancePolicies) {
    }

    // getters and setters
}
