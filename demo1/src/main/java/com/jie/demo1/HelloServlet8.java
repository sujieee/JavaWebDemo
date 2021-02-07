package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet8
 *
 * @Author J
 * @Date 2021/2/7 13:46
 * @Version 1.0
 */
@WebServlet(name = "helloServlet8",value = "/hello8")
public class HelloServlet8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        System.out.println("helloServlet8 uname: " + uname);
    }
}
