<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: J
  Date: 2021/2/7
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>hello9</h2>
<%--
    如果要在jsp中写java代码，需要写在java脚本段中
--%>
<%
    //获取域对象
    System.out.println("hello10...");
    String uname = request.getAttribute("uname").toString();
    List<String> list = (List<String>) request.getAttribute("list");
    System.out.println("从hello9里请求转发过来的req设置的域对象uname: "+ uname);
    System.out.println("从hello9里请求转发过来的req设置的域对象list: "+ list);
%>
</body>
</html>
