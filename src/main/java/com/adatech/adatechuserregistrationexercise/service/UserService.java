package com.adatech.adatechuserregistrationexercise.service;


import com.adatech.adatechuserregistrationexercise.model.Client;
import com.adatech.adatechuserregistrationexercise.repository.InMemoryDatabase;

import java.util.List;


public class UserService {

    private InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

    public String getAllClientsHtmlContent() {
        return createHtmlContent(inMemoryDatabase.getClients());
    }

    private String createHtmlContent(List<Client> clients) {
        String[] content = new String[] {
                ""
        };
        clients.forEach(client -> {
                content[0] +=
                        "  <div class=\"card\">\n" +
                                "    <div class=\"container\">\n" +
                                "      <p>\n" +
                                "        <span class=\"bold\">Nome:</span> " + client.getName() +
                                "        <br>\n" +
                                "        <br>\n" +
                                "        <span class=\"bold\">CPF:</span> " + client.getCpf() +
                                "      </p>\n" +
                                "    </div>\n" +
                                "  </div>" +
                                "  <br>\n" ;
            });
            return content[0];
        }

    public void addClient(String name, String cpf) {
        inMemoryDatabase.addClient(new Client(name, cpf));
    }
}
