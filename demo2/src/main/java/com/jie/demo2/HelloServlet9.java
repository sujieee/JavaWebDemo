package com.jie.demo2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * HelloServlet9
 *
 * @Author J
 * @Date 2021/2/8 15:26
 * @Version 1.0
 */
@WebServlet(name = "helloServlet9", value = "/hello9")
public class HelloServlet9 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //设置session域对象
        session.setAttribute("suname", "wangliu");
        session.setAttribute("supwd","pwddd");
//        req.getRequestDispatcher("/hello10").forward(req,resp);
//        req.getRequestDispatcher("/sessionAttribute.jsp").forward(req,resp);
        resp.sendRedirect("/demo2/sessionAttribute.jsp");
        //获取session会话标识符
//        String id = session.getId();
//        System.out.println(id);
//        //获取session创建时间
//        System.out.println(session.getCreationTime());
//        //获取最后一次访问时间
//        System.out.println(session.getLastAccessedTime());
//        //判断是否是新的session
//        System.out.println(session.isNew());
    }
}
