package com.step.dubinin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = ("/shop"))
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // req.getSession().setAttribute("name", req.getParameter("userName"));

        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Shop</title>\n" +
                "</head>" +
                "<body>\n" +
                "<h1 align=\"centr\">\n" +
                "    <h1 >Welcome to online shop!!!</h1>\n"
                + "<h1 >Dear    " + req.getSession().getAttribute("name") + "</h1>\n" +
                "    <form action=\"/shop\" method=\"get\">\n" +
                "    <select name=\"list\" size=\"2\" >\n" +
                "        <option> lazgan 100$</option>\n" +
                "        <option> bolter 500$</option>\n" +
                "        <option> chainsword 500$</option>\n" +
                "        <option> power axe 700$</option>\n" +
                "    </select>\n" +
                "    <input type=\"submit\" value=\"add\">\n" +

                "     </form>\n" +
                "<form action=\"shop2\" metod =\"get\">\n"
                +"<p>"+
                 Aucsilia.getUserScrol(req.getParameter("list"))+
                "<input type=\"submit\" value=\"submit\">\n"+
                "</p>\n"
                +"</form>"+
                "</h1>\n" +
                "</body>\n" +
                "    \n");


    }


}
