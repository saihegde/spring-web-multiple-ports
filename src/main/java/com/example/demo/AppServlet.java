package com.example.demo;

import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(
  name = "AnnotationExample",
  description = "Example Servlet Using Annotations")
public class AppServlet extends HttpServlet {

    @Override
    protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<p>Hello World!</p>");
    }
}
