package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet5
 *
 * @Author J
 * @Date 2021/2/7 11:11
 * @Version 1.0
 */
@WebServlet(name = "helloServlet5",value = "/hello-servlet5")
public class HelloServlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet被调用了...");
        String requestURL = req.getRequestURL().toString();
        System.out.println("获取客户端请求的完整URL（从http开始，到?前面结束）: " + requestURL);
        String requestURI = req.getRequestURI();
        System.out.println("获取客户端请求行中的资源名称部分（从项目名称开始，到?前面结束）: " + requestURI);
        String queryString = req.getQueryString();
        System.out.println("获取客户端请求行的参数部分（从?后面开始，到最后结束）: " + queryString);
        String requestMethod = req.getMethod();
        System.out.println("获取客户端请求方法: " + requestMethod);
        String protocol = req.getProtocol();
        System.out.println("获取HTTP版本号: " + protocol);
        String contextPath = req.getContextPath();
        System.out.println("获取webapp项目站点名字（项目对外访问路径，上下文路径）: " + contextPath);
        String uname = req.getParameter("uname");
        System.out.println("uname: "+uname);
        String[] hobbies = req.getParameterValues("hobby");
        if (hobbies!=null&&hobbies.length>0) {
            for (String hobby : hobbies) {
                System.out.println("hobby: " + hobby);
            }
        }
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet被构建初始化了...");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet被销毁了...");
    }
}
