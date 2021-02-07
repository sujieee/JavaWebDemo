package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet7
 * 请求跳转 只能跳一次
 *  服务端行为 地址栏不发生改变 从始至终只有一个请求 request数据可以共享
 * @Author J
 * @Date 2021/2/7 13:37
 * @Version 1.0
 */
@WebServlet(name = "helloServlet7",value = "/hello7")
public class HelloServlet7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收客户端参数
        String uname = req.getParameter("uname");
        System.out.println("helloServlet7 uname: " + uname);
        // 请求转发跳转到helloServlet8
//        req.getRequestDispatcher("/hello8").forward(req,resp);
        // 请求转发跳转到html页面
        req.getRequestDispatcher("/hello.html").forward(req,resp);
    }
}
