<%@ page import="com.cute.utils.dbManager" %>
<%@ page import="com.cute.dao.Student" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/11
  Time: 23:12
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
    Student student = (Student) request.getAttribute("student");
%>

<form name="form" action="updateStudent.jsp" method="post" accept-charset="UTF-8">
<table border=2>
    <tr>
        <th colspan="2" width=100>用户信息</th>
    </tr>
    <tr>
        <td>学号</td>
        <td><%=student.getStudentId()%>
        </td>
    </tr>
    <tr>
        <td>姓名</td>
        <td><%=student.getName()%>
        </td>
    </tr>
    <tr>
        <td>性别</td>
        <td><%=student.getGender()%>
        </td>
    </tr>
    <tr>
        <td>密码</td>
        <td><%=student.getPassword()%>
        </td>
    </tr>
    <tr>
        <td>生日</td>
        <td><%=student.getBirthday()%>
        </td>
    </tr>
    <tr>
        <td>籍贯</td>
        <td><%=student.getNativePlace()%>
        </td>
    </tr>
    <tr>
        <td>地址</td>
        <td><%=student.getAddress()%>
        </td>
    </tr>
    <tr>
        <td>邮箱</td>
        <td><%=student.getEmail()%>
        </td>
    </tr>
</table>
    <input type="hidden" name="studentId" value=<%=student.getStudentId()%>>
    <input type="hidden" name="name" value=<%=student.getName()%>>
    <input type="hidden" name="gender" value=<%=student.getGender()%>>
    <input type="hidden" name="password" value=<%=student.getPassword()%>>
    <input type="hidden" name="nativePlace" value=<%=student.getNativePlace()%>>
    <input type="hidden" name="address" value=<%=student.getAddress()%>>
    <input type="hidden" name="email" value=<%=student.getEmail()%>>
    <input type="hidden" name="birthday" value=<%=student.getBirthday()%>>
    <input type="submit" value="修改">
</form>

</body>
</html>
