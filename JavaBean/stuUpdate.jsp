<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <jsp:useBean id="zzh1" class="cn.swpu.zzh.dbManager" scope="session"/>
    <jsp:useBean id="zzh2" class="cn.swpu.zzh.Student" scope="session"/>
    <jsp:setProperty name="zzh2" property="*" />
    <%
    zzh1.update(zzh2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<FORM action="" Method="post">
    输入姓名:<Input type=text name="name">
<br>输入学号: <Input type=text name="id">
<br>输入密码: <Input type=text name="password">
    <Input type=submit value="提交">
</FORM>
</body>
</html>