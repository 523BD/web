<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/1
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<style>
    ul
    {
        list-style-type:none;
        margin:0;
        padding:0;
    }
    a:link,a:visited
    {
        display:block;
        font-weight:bold;
        color:#FFFFFF;
        background-color:#bebebe;
        width:120px;
        text-align:center;
        padding:4px;
        text-decoration:none;
        text-transform:uppercase;
    }
    a:hover,a:active
    {
        background-color:#cc0000;
    }
</style>
<body>
<%
    String studentId = (String) request.getSession().getAttribute("studentId");
    int role = (int) request.getSession().getAttribute("role");
%>
<ul>
    <%
        if(studentId != null){
    %>
    <li><a href="${pageContext.request.contextPath}/studentInfoServlet">个人用户信息</a></li>
    <li><a href="${pageContext.request.contextPath}/allStudentServlet">所有用户信息</a></li>
    <%
        }else{
            response.sendRedirect("login.jsp");
        }
        if(studentId != null&&role == 1){
    %>
    <li><a href="${pageContext.request.contextPath}/allStudentInfoServlet">管理员审核界面</a></li>
    <%
        }
    %>
</ul>
</body>
</html>
