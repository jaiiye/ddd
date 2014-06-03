<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
	<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Brand</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		    <ul class="nav navbar-nav">
		      <li class="active"><a href="#">Link</a></li>
		      <li><a href="#">Link</a></li>
		      <li class="dropdown">
		        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
		        <ul class="dropdown-menu">
		          <li><a href="#">Action</a></li>
		          <li><a href="#">Another action</a></li>
		          <li><a href="#">Something else here</a></li>
		          <li class="divider"></li>
		          <li><a href="#">Separated link</a></li>
		          <li class="divider"></li>
		          <li><a href="#">One more separated link</a></li>
		        </ul>
		      </li>
		    </ul>
	 		<form class="navbar-form navbar-left" role="search">
	      		<div class="form-group">
	        		<input type="text" class="form-control" placeholder="Search">
	      		</div>
	      		<button type="submit" class="btn btn-default">Submit</button>
	    	</form>
			<ul class="nav navbar-nav navbar-right">
			      <li><a href="#">Link</a></li>
			      <li class="dropdown">
			        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
			        <ul class="dropdown-menu">
			          <li><a href="#">Action</a></li>
			          <li><a href="#">Another action</a></li>
			          <li><a href="#">Something else here</a></li>
			          <li class="divider"></li>
			          <li><a href="#">Separated link</a></li>
			        </ul>
			      </li>
			</ul>
		</div>
	</nav>

	<div class="page-header">
		<h1>
			DDD<small>快速开发框架</small>
		</h1>
	</div>
	<ol class="breadcrumb">
		<li><a href="#">首页</a></li>
		<li><a href="#">机构管理</a></li>
		<li class="active">人员管理</li>
	</ol>
	<ul class="nav nav-tabs nav-justified">
		<li class="active"><a href="#">首页</a></li>
		<li><a href="#">Profile</a></li>
		<li><a href="#">Messages</a></li>
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> Dropdown <span class="caret"></span>
		</a>
			<ul class="dropdown-menu" role="menu">
				<li><a href="#">Action</a></li>
				<li><a href="#">Another action</a></li>
				<li><a href="#">Something else here</a></li>
				<li class="divider"></li>
				<li><a href="#">Separated link</a></li>
			</ul></li>
	</ul>
	<hr>
	<ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
		<li class="active"><a href="#">添加</a></li>
		<li><a href="#">修改</a></li>
		<li><a href="#">删除</a></li>
		<li><a href="#"><span class="badge pull-right">42</span>消息</a></li>
	</ul>
	
	<div class="alert alert-success alert-dismissable">...
		<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	</div>
	<div class="alert alert-info">...</div>
	<div class="alert alert-warning">...</div>
	<div class="alert alert-danger">...</div>
</body>