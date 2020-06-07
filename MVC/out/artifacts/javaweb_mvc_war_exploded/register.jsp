<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/3/31
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<script language="JavaScript">
    function check()
    {
        if (document.form.studentId.value.length == 0)
        {
            alert("请输入学号！");

            return false;
        }
        if (document.form.name.value.length == 0)
        {
            alert("请输入用户名！");

            return false;
        }
        if (document.form.password.value.length == 0)
        {
            alert("请输入密码！");

            return false;
        }
        if (document.form.address.value.length == 0)
        {
            alert("请输入密码！");

            return false;
        }
        if (document.form.email.value.length == 0)
        {
            alert("请输入密码！");

            return false;
        }

        return true;
    }
</script>
<body>
<form name="form" action="${pageContext.request.contextPath}/addStudentServlet" onSubmit="return check(this);" method="post" accept-charset="UTF-8">
    <table border="1" align="center">
        <tr>
            <th colspan="2">用户信息</th>
        </tr>
        <tr>
            <td>学号：</td>
            <td><input type="text" name="studentId"></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td>
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
                <input type="text" name="birthday">
            </td>
        </tr>
        <tr>
            <td>籍贯</td>
            <td>
                <select name="nativePlace">
                    <%
                        String provinces[] = {"北京市","天津市","上海市","重庆市","河北省 ", "河南省 ","湖北省  ","湖南省 ","江苏省 ",
                                "江西省 ","辽宁省  ","吉林省  ","黑龙江省  ","陕西省 ","山西省 ","山东省 ","四川省  ","青海省 ",
                                "安徽省 ","海南省 ","广东省 ","贵州省 ","浙江省 ","福建省 ","台湾省 ","甘肃省 ","云南省 ","西藏自治区 ",
                                "宁夏回族自治区 ","广西壮族自治区 ","新疆维吾尔自治区 ","内蒙古自治区 ","香港特别行政区 ","澳门特别行政区 "};
                        for(String province:provinces){
                    %>
                    <option value="<%=province%>"><%=province%></option>
                    <%
                        }
                    %>
                </select>
            </td>
        </tr>
        <tr>
            <td>地址</td>
            <td>
                <input type="text" name="address">
            </td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td>
                <input type="email" name="email">
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td>
                <input type="submit" value="注册">
                <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
