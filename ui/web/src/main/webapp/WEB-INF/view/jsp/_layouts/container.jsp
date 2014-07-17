<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<% String base=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<base href="<%=base%>"/>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<title><t:insertAttribute name="title" defaultValue="欢迎"/></title>
	<t:insertAttribute name="styles"/>
	<t:insertAttribute name="head" defaultValue=""/>
</head>
<body>
<div class="container">
	<div class="row">
		<t:insertAttribute name="container"/>
	</div>
</div>
<t:insertAttribute name="scripts"/>
</body>
</html>