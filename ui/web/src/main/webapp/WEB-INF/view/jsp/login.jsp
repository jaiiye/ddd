<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>登陆</title>
<link rel="stylesheet" href="static/style/login.css">
</head>
<body>
	<div class="container">
		<form class="form-signin" role="form" method="post">
			<h2 class="form-signin-heading">欢迎登录</h2>
			<input type="text" class="form-control" name="username" placeholder="请输入用户名" required autofocus><br> 
			<input type="password" class="form-control" name="password" placeholder="请输入密码" required>
			<label class="checkbox"><input type="checkbox" name="rememberMe" value="remember-me">记住我</label>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		</form>
	</div>
</body>
</html>