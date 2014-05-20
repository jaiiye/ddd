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
			<input type="text" class="form-control" name="username" placeholder="Email address" required autofocus> 
			<input type="password" class="form-control" name="password" placeholder="Password" required>
			<label class="checkbox"><input type="checkbox" name="rememberMe" value="remember-me">Remember me</label>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</form>
	</div>
</body>
</html>