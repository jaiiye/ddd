<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>登陆</title>
<link rel="stylesheet" href="static/style/login.css">
</head>
<body>
	<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
	  Launch demo modal
	</button>
	<page:applyDecorator name="dialog" id="myModal" title=" Launch demo modal">
		<page:param name="showHeader">true</page:param>
		<p>
			<h2>用法</h2>
			The modal plugin toggles your hidden content on demand, via data attributes or JavaScript. It also adds .model-open to the to override default scrolling behavior and generates a .modal-backdrop to provide a click area for dismissing shown modals when clicking outside the modal.
		</p>
	</page:applyDecorator>
	<div class="container">
		<form class="form-signin" role="form" method="post" action="controller/request">
			<h2 class="form-signin-heading">欢迎登录</h2>
			<input type="text" class="form-control" name="username" placeholder="请输入用户名" required autofocus><br> 
			<input type="password" class="form-control" name="password" placeholder="请输入密码" required>
			<label class="checkbox"><input type="checkbox" name="rememberMe" value="remember-me">记住我</label>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>
	</div>
</body>
</html>