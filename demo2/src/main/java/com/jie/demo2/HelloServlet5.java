package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * HelloServlet5
 * Cookie的注意点
 * @Author J
 * @Date 2021/2/8 12:33
 * @Version 1.0
 */
@WebServlet(name = "helloServlet5",value = "/hello5")
public class HelloServlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "姓名";
        String value = "张三";
        name = URLEncoder.encode(name,"UTF-8");
        value = URLEncoder.encode(value,"UTF-8");
        Cookie cookie = new Cookie(name, value);
        resp.addCookie(cookie);
    }
}
