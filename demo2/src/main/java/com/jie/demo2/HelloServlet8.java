package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet8
 *
 * @Author J
 * @Date 2021/2/8 14:14
 * @Version 1.0
 */
@WebServlet(name = "helloServlet8",value = "/hello8")
public class HelloServlet8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies!=null&&cookies.length>0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName()+"---->"+cookie.getValue());
            }
        }
    }
}
