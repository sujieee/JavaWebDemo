package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet2
 * Cookie的创建与发送
 * @Author J
 * @Date 2021/2/8 10:56
 * @Version 1.0
 */
@WebServlet(name = "cookie01",value = "/hello2")
public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Cookie的创建
        Cookie cookie = new Cookie("uname", "zhangsan");
        resp.addCookie(cookie);
    }
}
