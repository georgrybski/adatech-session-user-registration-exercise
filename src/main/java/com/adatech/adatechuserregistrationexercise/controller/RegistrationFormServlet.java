package com.adatech.adatechuserregistrationexercise.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.adatech.adatechuserregistrationexercise.factories.SingletonUserServiceFactory;
import com.adatech.adatechuserregistrationexercise.model.Client;
import com.adatech.adatechuserregistrationexercise.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "registrationFormServlet", value = "/registration-form")
public class RegistrationFormServlet extends BaseServlet {
    private UserService userService = SingletonUserServiceFactory.getUserService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher(jspDirectory + "registration.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String cpf = request.getParameter("cpf");

        HttpSession session = request.getSession();

        List<Client> clients = Optional.ofNullable((List<Client>) session.getAttribute("clients")).orElse(new ArrayList<>());
        clients.add(new Client(name, cpf));
        session.setAttribute("clients", clients);

        request.setAttribute("name", name);
        request.setAttribute("cpf", cpf);

        request.getRequestDispatcher(jspDirectory + "display-registration-data.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
