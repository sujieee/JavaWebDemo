<%--
  Created by IntelliJ IDEA.
  User: J
  Date: 2021/2/8
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取session域对象</title>
</head>
<body>
    <h2>sessionAttribute</h2>
    <%
        String suname = (String) request.getSession().getAttribute("suname");
        System.out.println(suname);
    %>
</body>
</html>
