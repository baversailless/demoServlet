package com.example.demoServlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String position = request.getParameter("position");
        PrintWriter pw = response.getWriter();

        pw.println("<html><body>");
        pw.println("<h1> Hello,  " + name + ". You are a " + position + "</h1>");
        pw.println("</body></html>");
    }

    public void destroy() {
    }
}