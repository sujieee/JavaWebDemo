package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * HelloServlet10
 *
 * @Author J
 * @Date 2021/2/8 17:18
 * @Version 1.0
 */
@WebServlet(name = "helloServlet10",value = "/hello10")
public class HelloServlet10 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
//        session.removeAttribute("supwd");
        String suname= (String) session.getAttribute("suname");
        System.out.println("suname-->" + suname);
        if (session.getAttributeNames().hasMoreElements()) {
            System.out.println(session.getAttributeNames().nextElement());
        }
    }
}