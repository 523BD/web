<%@ page import="java.sql.*" %>
<%@ page import="com.cute.dao.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/1
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    List<Student> students = (List<Student>) request.getAttribute("students");
%>
<table border=2>
    <tr>
        <th width=100>学号</th>
        <th width=100>姓名</th>
        <th width=50>性别</th>
        <th width=50>生日</th>
        <th width=50>籍贯</th>
        <th width=50>地址</th>
        <th width=50>邮箱</th>
    </tr>
    <%
        for(Student student:students) {
    %>
    <tr>
        <td><%=student.getStudentId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getGender()%>
        </td>
        <td><%=student.getBirthday()%>
        </td>
        <td><%=student.getNativePlace()%>
        </td>
        <td><%=student.getAddress()%>
        </td>
        <td><%=student.getEmail()%>
        </td>
    </tr>
    <%
        } %>
</table>
</body>
</html>
