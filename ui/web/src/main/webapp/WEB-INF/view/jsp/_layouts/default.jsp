<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<% String base=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<base href="<%=base%>"/>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<jsp:include page="_includes/styles.jsp"/>
<title><decorator:title default="欢迎!"/></title>
<decorator:head />
</head>
<body>
<decorator:body/>
<jsp:include page="_includes/scripts.jsp"/>
</body>
</html>