package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * HelloServlet6
 *
 * @Author J
 * @Date 2021/2/8 12:37
 * @Version 1.0
 */
@WebServlet(name = "helloServlet6",value = "/hello6")
public class HelloServlet6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies!=null&&cookies.length>0) {
            for (Cookie cookie : cookies) {
                System.out.println(URLDecoder.decode(cookie.getName(),"UTF-8")+"-->"+URLDecoder.decode(cookie.getValue(),"UTF-8"));
            }
        }
    }
}
