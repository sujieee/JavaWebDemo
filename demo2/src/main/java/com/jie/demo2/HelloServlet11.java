package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * HelloServlet11
 * 设定session到期时间
 * @Author J
 * @Date 2021/2/8 20:36
 * @Version 1.0
 */
@WebServlet(name = "helloServlet11",value = "/hello11")
public class HelloServlet11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("aname","bbb");
        //15秒不操作页面，该session就会失效，如果15秒内操作了，则会重新计时
        session.setMaxInactiveInterval(15);
        System.out.println("hello11 aname: "+(String) session.getAttribute("aname"));
        //立即销毁 可以通过session.invalidate()方法让session立刻失效
//        session.invalidate();
        resp.sendRedirect("/demo2/hello12");
    }
}
