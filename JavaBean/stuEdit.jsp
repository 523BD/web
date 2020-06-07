<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <jsp:useBean id="zzh1" class="cn.swpu.zzh.dbManager" scope="session"/>
    <jsp:useBean id="zzh2" class="cn.swpu.zzh.Student" scope="session"/>
    <jsp:setProperty name="zzh2" property="*" />
    <%
    zzh1.select();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="stuUpdate.jsp">
  名字是：<jsp:getProperty name="zzh2" property="name"  />
 <br>学号是：<jsp:getProperty name="zzh2" property="id"/>
 <br>密码是：<jsp:getProperty name="zzh2" property="password"/>
 <input type="submit" name=register value="提交" >
 </form>
</body>
</html>