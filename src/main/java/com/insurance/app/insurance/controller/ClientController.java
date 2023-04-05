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

import com.insurance.app.insurance.models.Client;
import com.insurance.app.insurance.services.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientService.saveClientData(client);
    }

    @PostMapping("/addClients")
    public List<Client> createClients(@RequestBody List<Client> clients) {
        return clientService.saveClientsData(clients);
    }

    @GetMapping("/clients")
    public List<Client> findAllClients() {
        return clientService.getClients();
    }

    @GetMapping("/clientById/{id}")
    public Client findClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/clientByName/{name}")
    public Client findClientByName(@PathVariable String name) {
        return clientService.getClientByName(name);
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClient(@PathVariable Long id) {
        return clientService.deleteClient(id);
    }

}
