package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * HelloServlet9
 * request作用域
 *  通过该对象可以在一个请求中传递数据，作用范围：在一次请求中有效，即服务器跳转有效
 * @Author J
 * @Date 2021/2/7 16:49
 * @Version 1.0
 */
@WebServlet(name = "helloServlet9",value = "/hello9")
public class HelloServlet9 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello servlet9...");
        req.setAttribute("uname","zs");
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        req.setAttribute("list",list);
        req.getRequestDispatcher("/hello10").forward(req,resp);
        //请求转发跳转到jsp，通过域对象传递数据
//        req.getRequestDispatcher("/hello9.jsp").forward(req,resp);
    }
}
