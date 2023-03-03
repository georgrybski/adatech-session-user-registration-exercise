package com.adatech.adatechuserregistrationexercise.controller;

import com.adatech.adatechuserregistrationexercise.factories.SingletonUserServiceFactory;
import com.adatech.adatechuserregistrationexercise.model.Client;
import com.adatech.adatechuserregistrationexercise.service.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@WebServlet(name = "ListClientsServlet", value = "/list-registered-clients")
public class ListClientsServlet extends BaseServlet {

    private UserService userService = SingletonUserServiceFactory.getUserService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Optional<List<Client>> clients = Optional.ofNullable((List<Client>) session.getAttribute("clients"));
        request.setAttribute("content", userService.getAllClientsHtmlContent(clients.orElseGet(ArrayList::new)));

        request.getRequestDispatcher(jspDirectory + "list-registered-clients.jsp").forward(request, response);
    }
}
