<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="zzh1" class="cn.swpu.zzh.dbManager" scope="session"/>
    <jsp:useBean id="zzh2" class="cn.swpu.zzh.Student" scope="session"/>
    <jsp:setProperty name="zzh2" property="*" />
   <%
   zzh1.insert(zzh2);
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>
