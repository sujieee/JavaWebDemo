package com.jie.demo3;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet3
 * ServletContext域对象
 * @Author J
 * @Date 2021/2/8 22:36
 * @Version 1.0
 */
@WebServlet(name = "helloServlet3",value = "/hello3")
public class HelloServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("cname","zhangsan");
        System.out.println((String) servletContext.getAttribute("cname"));
        servletContext.removeAttribute("cname");
        //null
        System.out.println((String) servletContext.getAttribute("cname"));
    }
}
