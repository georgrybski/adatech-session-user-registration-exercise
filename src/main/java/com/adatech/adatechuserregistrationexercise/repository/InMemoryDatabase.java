package com.adatech.adatechuserregistrationexercise.repository;

import com.adatech.adatechuserregistrationexercise.model.Client;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InMemoryDatabase {
    List<Client> clients = new ArrayList<>();
    public void addClient(Client client) {
        clients.add(client);
    }
}
