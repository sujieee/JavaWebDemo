package com.jie.demo3;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet2
 * 获取ServletContext对象
 * @Author J
 * @Date 2021/2/8 22:10
 * @Version 1.0
 */
@WebServlet(name = "helloServlet2",value = "/hello2")
public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过request获取
        ServletContext servletContext1 = req.getServletContext();
        //通过session获取
        ServletContext servletContext2 = req.getSession().getServletContext();
        //通过ServletConfig获取
        ServletContext servletContext3 = getServletConfig().getServletContext();
        //直接获取
        ServletContext servletContext4 = getServletContext();
        //ServletContext常用方法
        //获取当前服务器的版本信息
        String serverInfo = servletContext1.getServerInfo();
        System.out.println("当前服务器信息："+serverInfo);
        //获取当前项目访问路径
        String contextPath = servletContext1.getContextPath();
        System.out.println("当前项目路径："+contextPath);
        //获取项目的真实路径
        String realPath = servletContext1.getRealPath("/");
        System.out.println("项目根路径："+realPath);
    }
}
