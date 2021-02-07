package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet14
 * 重定向
 * @Author J
 * @Date 2021/2/7 21:57
 * @Version 1.0
 */
@WebServlet(name = "helloServlet14",value = "/hello14")
public class HelloServlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //重定向到helloServlet15
        resp.sendRedirect("/demo1/hello15");
        System.out.println("hello14");
    }
}
