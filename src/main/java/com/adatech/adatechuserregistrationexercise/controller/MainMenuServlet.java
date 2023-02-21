package com.adatech.adatechuserregistrationexercise.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MainMenuServlet", value = "/")
public class MainMenuServlet extends BaseServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(jspDirectory + "main-menu.jsp").forward(request, response);
    }
}
