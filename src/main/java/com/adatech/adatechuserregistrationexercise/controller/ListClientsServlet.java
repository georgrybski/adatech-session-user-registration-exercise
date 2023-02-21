package com.adatech.adatechuserregistrationexercise.controller;

import com.adatech.adatechuserregistrationexercise.service.ImprovisedEnumInjector;
import com.adatech.adatechuserregistrationexercise.service.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;


@WebServlet(name = "ListClientsServlet", value = "/list-registered-clients")
public class ListClientsServlet extends BaseServlet {

    private UserService userService = ImprovisedEnumInjector.USER_SERVICE.getUserService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("content", userService.getAllClientsHtmlContent());
        request.getRequestDispatcher(jspDirectory + "list-registered-clients.jsp").forward(request, response);
    }
}
