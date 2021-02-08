package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet4
 * 设置Cookie到期时间
 * @Author J
 * @Date 2021/2/8 12:06
 * @Version 1.0
 */
@WebServlet(name = "helloServlet4",value = "/hello4")
public class HelloServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 到期时间：负整数（默认值-1，表示只在浏览器内存中存活，关闭浏览器失效）
        Cookie cookie1 = new Cookie("uname1", "lisi");
        cookie1.setMaxAge(-1);
        resp.addCookie(cookie1);
        // 到期时间：正整数（表示存活指定秒数，会将数据存在磁盘中）
        Cookie cookie2 = new Cookie("uname2", "wangwu");
        Cookie cookie3 = new Cookie("uname3","liuliu");
        cookie2.setMaxAge(30);
        resp.addCookie(cookie2);
        // 到期时间，零（表示删除Cookie）
        cookie3.setMaxAge(0);
        resp.addCookie(cookie3);
    }
}
