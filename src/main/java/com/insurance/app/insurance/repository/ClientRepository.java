package com.insurance.app.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.app.insurance.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByName(String name);

}
