<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/1
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="form" action="${pageContext.request.contextPath}/updateStudentServlet" method="post">
    <table border="1" align="center">
        <tr>
            <th colspan="2">用户信息</th>
        </tr>
        <tr>
            <td>学号：</td>
            <td><input type="text" name="studentNumber" value=<%=request.getParameter("studentId")%> readonly></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name" value=<%=new String(request.getParameter("name").getBytes("iso-8859-1"), "utf-8")%> readonly></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password" value=<%=request.getParameter("password")%>></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="radio" name="gender" value="男" checked>男
                <input type="radio" name="gender" value="女">女
            </td>
        </tr>
        <tr>
            <td>生日</td>
            <td>
                <input type="text" name="birthday" value=<%=request.getParameter("birthday")%>>
            </td>
        </tr>
        <tr>
            <td>籍贯</td>
            <td>
                <select name="nativePlace">
                    <%
                        String provinces[] = {"北京市", "天津市", "上海市", "重庆市", "河北省 ", "河南省 ", "湖北省  ", "湖南省 ", "江苏省 ",
                                "江西省 ", "辽宁省  ", "吉林省  ", "黑龙江省  ", "陕西省 ", "山西省 ", "山东省 ", "四川省  ", "青海省 ",
                                "安徽省 ", "海南省 ", "广东省 ", "贵州省 ", "浙江省 ", "福建省 ", "台湾省 ", "甘肃省 ", "云南省 ", "西藏自治区 ",
                                "宁夏回族自治区 ", "广西壮族自治区 ", "新疆维吾尔自治区 ", "内蒙古自治区 ", "香港特别行政区 ", "澳门特别行政区 "};
                        for (String province : provinces) {
                            if (province.equals(new String(request.getParameter("nativePlace").getBytes("iso-8859-1"), "utf-8"))) {
                    %>
                    <option value="<%=province%>" selected><%=province%>
                    </option>
                    <%
                        }
                    %>
                    <option value="<%=province%>"><%=province%>
                    </option>
                    <%
                        }
                    %>
                </select>
            </td>
        </tr>
        <tr>
            <td>地址</td>
            <td>
                <input type="text" name="address" value=<%=new String(request.getParameter("address").getBytes("iso-8859-1"), "utf-8")%>>
            </td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td>
                <input type="email" name="email" value=<%=request.getParameter("email")%>>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
                <input type="submit" value="提交更新">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
