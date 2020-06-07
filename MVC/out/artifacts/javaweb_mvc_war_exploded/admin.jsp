<%@ page import="java.sql.*" %>
<%@ page import="com.cute.dao.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/1
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
        <th>状态</th>
        <th></th>
    </tr>
    <%
        for (Student student : students) {
    %>
    <tr>
        <td><%=student.getStudentId() %>
        </td>
        <td><%=student.getName() %>
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
        <td><a href=<%= request.getContextPath()+"/agreeServlet?studentId=" + student.getStudentId()%>>
            <%
                if (student.getRole() == -1) {
            %>
            审核
            <%
            } else {
            %>
            已审核
            <%
                }
            %>
        </a>
        </td>
        <td><a href=<%=request.getContextPath()+"/password.jsp?studentId=" + student.getStudentId()%>>重置密码</a></td>
    </tr>
    <%
        } %>
</table>

</body>
</html>
