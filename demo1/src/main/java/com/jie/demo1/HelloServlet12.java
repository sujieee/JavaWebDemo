package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HelloServlet12
 * 字符流响应数据
 * @Author J
 * @Date 2021/2/7 21:00
 * @Version 1.0
 */
@WebServlet(name = "helloServlet12",value = "/hello12")
public class HelloServlet12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置服务端的编码格式
//        resp.setCharacterEncoding("UTF-8");
        // 设置客户端的响应内容格式和编码格式
//        resp.setHeader("content-type","text/html;charset=UTF-8");
        //一次性同时设置客户端和服务端的编码格式
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("<h2>你好，helloServlet12</h2>");
    }
}
