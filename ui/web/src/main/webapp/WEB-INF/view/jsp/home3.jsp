<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>登陆</title>
</head>
<body>
	<div class="container">
		<form action="">
			<input type="text" value="测试"> <input type="password"
				value="测试"> <input type="button" value="测试"> <input
				type="radio" value="测试"> <input type="checkbox" value="测试">
			<input type="submit" value="测试"> <input type="reset"
				value="测试">
			<button>测试</button>
		</form>
		<form action="" role="form">
			<input type="text" value="测试"> <input type="password"
				value="测试"> <input type="button" value="测试"> <input
				type="radio" value="测试"> <input type="checkbox" value="测试">
			<input type="submit" value="测试"> <input type="reset"
				value="测试">
			<button>测试</button>
		</form>
		<form action="" role="form">
			<div class="form-group">
				<label>Email address</label> <input type="text" value="测试"
					class="form-control">
			</div>
			<label>Email address</label> <input type="password" value="测试"
				class="form-control">
			<div class="form-group">
				<input type="button" value="测试">
			</div>
			<div class="form-group">
				<input type="radio" value="测试">
			</div>
			<div class="form-group">
				<input type="checkbox" value="测试">
			</div>
			<div class="form-group">
				<input type="submit" value="测试">
			</div>
			<div class="form-group">
				<input type="reset" value="测试" class="btn btn-default">
			</div>
			<button class="form-control">测试</button>
		</form>
		<hr>
		<form action="" role="form" class="form-inline">
			<div class="form-group">
				<label class="sr-only" for="exampleInputEmail2">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail2" placeholder="Enter email">
			</div>
			<div class="form-group">
				<input type="text" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="password" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="button" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="radio" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="checkbox" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="submit" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="reset" value="测试" class="form-control">
			</div>
			<button>测试</button>
		</form>

		<form action="" role="form" class="form-horizontal">
			<div class="form-group">
				<label for="exampleInputEmail2" class="col-sm-2">Email
					address</label>
				<div class="col-sm-10">
					<input type="email" class="form-control " id="exampleInputEmail2"
						placeholder="Enter email">
				</div>
			</div>
			<div class="form-group">
				<input type="text" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="color" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="password" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="button" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="radio" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="checkbox" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="submit" value="测试" class="form-control">
			</div>
			<div class="form-group">
				<input type="reset" value="测试" class="form-control">
			</div>
			<button>测试</button>
		</form>
	</div>

	<label class="checkbox-inline"> <input type="checkbox"
		id="inlineCheckbox1" value="option1"> 1
	</label>
	<label class="checkbox-inline"> <input type="checkbox"
		id="inlineCheckbox2" value="option2"> 2
	</label>
	<label class="checkbox-inline"> <input type="checkbox"
		id="inlineCheckbox3" value="option3"> 3
	</label>
	<hr>
	<div class="checkbox">
		<label> <input type="checkbox" value=""> Option one is
			this and that&mdash;be sure to include why it's great
		</label>
	</div>

	<div class="radio">
		<label> <input type="radio" name="optionsRadios"
			id="optionsRadios1" value="option1" checked> Option one is
			this and that&mdash;be sure to include why it's great
		</label>
	</div>
	<div class="radio">
		<label> <input type="radio" name="optionsRadios"
			id="optionsRadios2" value="option2"> Option two can be
			something else and selecting it will deselect option one
		</label>
	</div>
	<hr>
	<form action="" role="form">
		<div class="form-group">
			<label class="col-md-4">Email address</label> 
			<div class="col-md-8">
				<p class="form-control-static">测试</p>
			</div>
		</div>
		<div class="form-group">
			<label>Email address</label> <input type="button" value="测试">
		</div>
		<div class="form-group">
			<label>Email address</label> <input type="radio" value="测试">
		</div>
		<div class="form-group">
			<label>Email address</label> <input type="checkbox" value="测试">
		</div>
		<div class="form-group">
			<label>Email address</label> <input type="submit" value="测试">
		</div>
		<div class="form-group">
			<label>Email address</label> <input type="reset" value="测试"
				class="btn btn-default">
		</div>
		<button class="form-control">测试</button>
	</form>
	
	<input type="button" class="btn btn-default"  value="按钮">
	
	<img src="static/style/images/20140521134254.jpg" alt="..." class="img-circle">
	<img src="static/style/images/20140521134254.jpg" alt="..." class="img-rounded">
	<img src="static/style/images/20140521134254.jpg" alt="..." class="img-thumbnail">
	
	
	<p class="text-warning">本会员公司、全体会员机构租赁单元按月/季/年的数量及交易金额，以及本会员公司交易单元数量、交易金额的自身排名。<span class="caret"></span><button type="button" class="close" aria-hidden="true">&times;</button></p>
	
	<div class="pull-left">...</div>
	<div class="pull-right">...</div>
</body>
</html>