package com.propelmedia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hellooooo...");
        out.close();
    }
}
