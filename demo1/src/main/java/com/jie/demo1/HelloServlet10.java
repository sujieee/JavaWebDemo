package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * HelloServlet10
 *
 * @Author J
 * @Date 2021/2/7 16:58
 * @Version 1.0
 */
@WebServlet(name = "helloServlet10",value = "/hello10")
public class HelloServlet10 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello10...");
        // 此时的参数request，response依然是从helloServlet9那里请求转发过来的那个request,response
        String uname = req.getAttribute("uname").toString();
        List<String> list = (List<String>) req.getAttribute("list");
        System.out.println("从hello9里请求转发过来的req设置的域对象uname: "+ uname);
        System.out.println("从hello9里请求转发过来的req设置的域对象list: "+ list);
    }
}
