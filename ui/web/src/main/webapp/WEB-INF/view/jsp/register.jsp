<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册账号</title>
</head>
<body>
	<form action='<s:url value="/register/register"/>' method="post">
		用户名： <input name="username" type="text" /> 密码： <input
			name="password" type="password" /> <input
			type="submit" value="提交">
	</form>
</body>
</html>