package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet7
 * Cookie的路径
 * @Author J
 * @Date 2021/2/8 14:13
 * @Version 1.0
 */
@WebServlet(name = "helloServlet7",value = "/hello7")
public class HelloServlet7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("uname8", "zhangsan8");
        cookie1.setPath("/demo2/hello8");
        resp.addCookie(cookie1);
        Cookie[] cookies = req.getCookies();
        if (cookies!=null&&cookies.length>0) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName()+"---->"+cookie.getValue());
            }
        }
    }
}
