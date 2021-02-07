package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * HelloServlet6
 *
 * @Author J
 * @Date 2021/2/7 12:11
 * @Version 1.0
 */
@WebServlet(name = "helloServlet6",value = "/login")
public class HelloServlet6 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        String uname = req.getParameter("uname");
        String uname = new String(req.getParameter("uname").getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
        System.out.println("登录名：" + uname);
        String upwd = req.getParameter("upwd");
        System.out.println("密码：" + upwd);
    }
}