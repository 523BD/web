<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/25
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            request.setCharacterEncoding("Utf-8");
        %>
        <h1><%=request.getAttribute("success")%></h1>
</body>
</html>
