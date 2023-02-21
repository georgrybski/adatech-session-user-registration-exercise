package com.adatech.adatechuserregistrationexercise.controller;

import java.io.*;

import com.adatech.adatechuserregistrationexercise.service.ImprovisedEnumInjector;
import com.adatech.adatechuserregistrationexercise.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "registrationFormServlet", value = "/registration-form")
public class RegistrationFormServlet extends BaseServlet {
    private UserService userService = ImprovisedEnumInjector.USER_SERVICE.getUserService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher(jspDirectory + "registration.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String cpf = request.getParameter("cpf");
        userService.addClient(name, cpf);

        request.setAttribute("name", name);
        request.setAttribute("cpf", cpf);

        request.getRequestDispatcher(jspDirectory + "display-registration-data.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
