package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * HelloServlet12
 *
 * @Author J
 * @Date 2021/2/8 20:43
 * @Version 1.0
 */
@WebServlet(name = "helloServlet12",value = "/hello12")
public class HelloServlet12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //重定向过来会话依然还是有效的，也就是session域对象还是有效的，虽然是不同请求，但是会话还是一个
        //一个session可以包含多个请求
        System.out.println("hello12 aname: "+(String) req.getSession().getAttribute("aname"));
    }
}
