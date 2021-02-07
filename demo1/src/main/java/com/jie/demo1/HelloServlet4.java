package com.jie.demo1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HelloServlet4
 *
 * @Author J
 * @Date 2021/2/7 8:29
 * @Version 1.0
 */
@WebServlet(name = "helloServlet4", value = "/hello-servlet4")
public class HelloServlet4 extends HttpServlet {
    /**
     * 就绪/服务方法（处理请求数据）
     * 系统方法，服务器自动调用
     * 当有请求到达Servlet到达Servlet容器时，就会调用该方法
     * 方法可以被多次调用
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String authType = req.getAuthType();
        String contextPath = req.getContextPath();
        Cookie[] cookies = req.getCookies();
        String host = req.getHeader("Host");
        StringBuffer requestURL = req.getRequestURL();
        String requestURI = req.getRequestURI();
        String queryString = req.getQueryString();
        String method = req.getMethod();
        String protocol = req.getProtocol();
        for (Cookie cookie : cookies) {
            System.out.println("cookieName: " + cookie.getName()+"-->cookieValue: "+cookie.getValue());
        }
        System.out.println("authType: " + authType);
        System.out.println("contextPath: " + contextPath);
        System.out.println("host: " + host);
        System.out.println("requestURL: " + requestURL);
        System.out.println("requestURI: " + requestURI);
        System.out.println("queryString: " + queryString);
        System.out.println("method: " + method);
        System.out.println("protocol: " + protocol);
        System.out.println("Servlet被调用了...");
    }


    /**
     * 销毁方法
     * 系统方法，服务器自动调用
     * 当服务器关闭或应用程序停止时调用该方法
     * 方法只会执行一次
     */
    @Override
    public void destroy() {
        System.out.println("Servlet被销毁了...");
    }


    /**
     * 初始化方法
     * 系统方法，服务器自动调用
     * 当请求到达Servlet容器时，Servlet容器会判断该Servlet实例是否存在，如果不存在则创建实例并初始化
     * 方法只会执行一次
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet被创建了...");
    }
}
