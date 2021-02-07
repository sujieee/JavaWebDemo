package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet15
 *
 * @Author J
 * @Date 2021/2/7 21:57
 * @Version 1.0
 */
@WebServlet(name = "helloServlet15",value = "/hello15")
public class HelloServlet15 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("https://www.baidu.com");
        System.out.println("hello15");
    }
}
