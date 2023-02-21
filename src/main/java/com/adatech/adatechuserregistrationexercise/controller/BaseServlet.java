package com.adatech.adatechuserregistrationexercise.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "BaseServlet", value = "/BaseServlet")
public abstract class BaseServlet extends HttpServlet {
    protected String jspDirectory;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        jspDirectory = config.getInitParameter("jspDirectory");
    }
}
