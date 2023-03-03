package com.adatech.adatechuserregistrationexercise.service;


import com.adatech.adatechuserregistrationexercise.model.Client;

import java.util.List;


public class UserService {

    public String getAllClientsHtmlContent(List<Client> clients) {
        return !clients.isEmpty()? createHtmlContent(clients) :
                "  <div class=\"card\">" +
                "     <div class=\"center\">" +
                "        <span class=\"bold\"><h2>Nenhum cliente registrado</h2></span>" +
                "     </div>" +
                "  </div>";
    }

    public String createHtmlContent(List<Client> clients) {
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
}
