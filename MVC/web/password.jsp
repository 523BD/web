<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/3
  Time: 1:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updatePasswordServlet" method="post">
    <input type="hidden" name="studentId" value=<%=request.getParameter("studentId")%>>
    输入新密码<input type="password" name="password">
    <br><input type="submit" value="提交">
</form>
</body>
</html>
