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
			<input type="text" class="form-control" name="username" placeholder="用户名" required autofocus><br>
			<input type="password" class="form-control" name="password" placeholder="密码" required>
			<label class="checkbox"><input type="checkbox" name="rememberMe" value="remember-me">记住我</label>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登入</button>
		</form>
		
		<form class="form-horizontal" role="form">
		  <div class="form-group">
		    <label  for="exampleInputEmail2" class="col-sm-2">Email address</label>
		   	<div class="col-sm-10">
		    	<input type="email" class="form-control" id="exampleInputEmail2" placeholder="Enter email">
		    </div>
		  </div>
		  <div class="form-group">
		    <label  for="exampleInputPassword2" class="col-sm-2">Password</label>
		    <div class="col-sm-10">
		    	<input type="password" class="form-control" id="exampleInputPassword2" placeholder="Password">
		    </div>
		  </div>
		  <div class="form-group">
		  		<div class="col-sm-offset-2 col-sm-10">
			  <div class="checkbox" >
			    <label>
			      <input type="checkbox"> Remember me
			    </label>
			  </div>
			  </div>
		  </div>
		  <div class="form-group">
		  	<div class="col-sm-offset-2 col-sm-10">
		  		<button type="submit" class="btn btn-default">Sign in</button>
		  	</div>
		  </div>
		</form>
	</div>
</body>
</html>