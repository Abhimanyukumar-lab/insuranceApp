package com.insurance.app.insurance.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotBlank
    private String name;

    // @NotBlank
    private String address;

    // @NotBlank
    private String contactInformation;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

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

    // public Object getPhone() {
    // return null;
    // }

    // public void setPhone(Object phone) {
    // }

    // public Object getInsurancePolicies() {
    // return null;
    // }

    // public void setInsurancePolicies(Object insurancePolicies) {
    // }

    // getters and setters
}
