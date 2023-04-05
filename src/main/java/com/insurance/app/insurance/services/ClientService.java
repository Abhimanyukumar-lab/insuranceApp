package com.insurance.app.insurance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.insurance.models.Client;
import com.insurance.app.insurance.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client saveClientData(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> saveClientsData(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client getClientByName(String name) {
        return clientRepository.findByName(name);
    }

    public String deleteClient(Long id) {
        clientRepository.deleteById(id);
        return "Client removed !! " + id;
    }

    public Client updateClient(Client client) {
        Client existingClient = clientRepository.findById(client.getId()).orElse(null);
        existingClient.setName(client.getName());
        existingClient.setAddress(client.getAddress());
        existingClient.setPhone(client.getPhone());
        existingClient.setInsurancePolicies(client.getInsurancePolicies());
        return clientRepository.save(existingClient);
    }

}
