package com.insurance.app.insurance.models;

import java.math.BigDecimal;
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
@Table(name = "policies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotBlank
    private String policyNumber;

    // @NotBlank
    private String type;

    // @NotNull
    private BigDecimal coverageAmount;

    // @NotNull
    private BigDecimal premium;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Object getPolicyType() {
        return null;
    }

    public void setPolicyType(Object policyType) {
    }

    public Object getPolicyStatus() {
        return null;
    }

    public void setPolicyStatus(Object policyStatus) {
    }

    public Object getPolicyStartDate() {
        return null;
    }

    public void setPolicyStartDate(Object policyStartDate) {
    }

    public Object getPolicyEndDate() {
        return null;
    }

    public void setPolicyEndDate(Object policyEndDate) {
    }

    public Object getPolicyAmount() {
        return null;
    }

    public void setPolicyAmount(Object policyAmount) {
    }

    public Object getClaims() {
        return null;
    }

    public void setClaims(Object claims) {
    }

    // getters and setters
}
