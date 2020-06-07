<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="stuAdd.jsp" method="post">
		<table align="center">
			<tr align="right">
		 		<td>请输入姓名:</td>
				<td><input type="text" name=name autofocus="autofocus"></td>
			</tr>
				<tr align="right">
		 		<td>请输入学号:</td>
				<td><input type="number" name=id onkeyup="this.value=this.value.replace(/\D/g,'')"></td>
			</tr>
			<tr align="right">
				<td>请输入密码:</td>
				<td><input type="text" name=password></td>
			</tr>
			</table>
			<input type="submit" name=register value="提交" >
			</form>
</body>
</html>