package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * HelloServlet13
 * 字节流响应数据
 * @Author J
 * @Date 2021/2/7 21:08
 * @Version 1.0
 */
@WebServlet(name = "helloServlet13",value = "/hello13")
public class HelloServlet13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置服务端的编码格式
//        resp.setCharacterEncoding("UTF-8");
        // 设置客户端的响应内容格式和编码格式
        // 客户端按照设置好的响应内容格式解析服务端发来的内容和编码格式对服务端发来的内容进行解码
//        resp.setHeader("content-type","text/html;charset=UTF-8");

        //一次性同时设置客户端和服务端的编码格式
        resp.setContentType("text/html;charset=UTF-8");
        ServletOutputStream out = resp.getOutputStream();
        //如果没有指定字节的编码格式，则响应输出给客户端时可能乱码，也可能正确显示
        //编码格式一致时才能正确显示
//        out.write("<h3>你好，helloServlet13</h3>".getBytes());
        out.write("<h3>你好，helloServlet13</h3>".getBytes(StandardCharsets.UTF_8));
    }
}
