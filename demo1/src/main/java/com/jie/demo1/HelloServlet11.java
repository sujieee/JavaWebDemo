package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HelloServlet11
 * 响应数据
 * getWriter 字符输出流
 * getOutputStream 字节输出流
 * 两种流不可以同时使用，如果同时使用会报错
 * @Author J
 * @Date 2021/2/7 20:12
 * @Version 1.0
 */
@WebServlet(name = "helloServlet11",value = "/hello11")
public class HelloServlet11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("hello11 Writer");
//        ServletOutputStream out = resp.getOutputStream();
//        out.write("hello".getBytes());
    }
}
