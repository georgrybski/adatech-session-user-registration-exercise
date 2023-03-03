package com.adatech.adatechuserregistrationexercise.service;


import com.adatech.adatechuserregistrationexercise.model.Client;

import java.util.List;


public class UserService {

    private static final String HTML_CLIENT_CARD =
            """
               <div class="card">
                  <div class="container">
                     <p>
                        <span class="bold">Nome:</span> %s
                        <br>
                        <br>
                        <span class="bold">CPF:</span> %s
                     </p>
                  </div>
               </div>
               <br>
            """;

    private static final String HTML_NO_CLIENTS =
            """
               <div class="card">
                  <div class="center">
                     <span class="bold"><h2>Nenhum cliente registrado</h2></span>
                  </div>
               </div>
            """;

    public String getAllClientsHtmlContent(List<Client> clients) {
        return !clients.isEmpty()? createHtmlContent(clients) : HTML_NO_CLIENTS;
    }

    public String createHtmlContent(List<Client> clients) {
        StringBuilder[] content = new StringBuilder[] {
                new StringBuilder()
        };
        clients.forEach(client -> content[0].append(HTML_CLIENT_CARD.formatted(client.getName(), client.getCpf())));
            return content[0].toString();
        }
}
