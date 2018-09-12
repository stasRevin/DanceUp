package com.danceup.controller;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(

        name = "HelloWorld",
        urlPatterns = {"/helloWorld"}

)

public class HelloWorld extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();

        out.println("<html><body>Hello world</body></html>")

    }

}