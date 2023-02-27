package com.step.dubinin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = ("/shop2"))
public class ThiredClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Shop</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h1>Gidra Dominatus!!!</h1>\n"+
                 Aucsilia.setScrol()+
                Aucsilia.Calc(Aucsilia.List2.toArray(new String[0]))
                +"\n"+

                "</body>\n" +
                "</html>");
    }

}
