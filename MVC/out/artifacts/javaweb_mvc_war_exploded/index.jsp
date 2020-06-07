<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/24
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <title>登录界面</title>
</head>
<body>
<form name="form" method="post" action="${pageContext.request.contextPath}/verifyServlet" accept-charset="UTF-8">
  <table border="1" align="center">
    <th colspan="2">登录系统</th>
    <tr>
      <td>用户名</td>
      <td><input type="text" name="studentId"></td>
    </tr>
    <tr>
      <td>密码</td>
      <td><input type="password" name="password"></td>
    </tr>
    <tr>
      <td colspan="2" align="center" bgcolor="#7fffd4">
        <input type="submit" value="登录">
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center" bgcolor="#7fffd4">
        <a href="register.jsp">注册新用户</a>
      </td>
    </tr>
  </table>
</form>
</body>
</html>
