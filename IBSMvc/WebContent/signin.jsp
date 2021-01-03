<!doctype html>

<html>

<head>
<title>IBS-SignIn</title>
<style>
a {
	text-decoration: none;
	display: inline-block;
}

.left {
	width: 150px;
	float: left;
}

.center {
	padding-left: 50px;
	float: left;
	
}

h1 {
	text-decoration-line: underline;
}
</style>
</head>

<body>
	<h1>IBS BANK</h1>
	<jsp:include page="menu.jsp" />
	<h2>Customer Login</h2>
	<form action="sgin" method="POST">
		<div class="left">
			<label for="customerName">Customer Name</label>
		</div>
		<div>
			<input type="text" id="customerName" name="customerName" required>
		</div>
		<br>
		<div class="left">
			<label for="password">Password</label>
		</div>
		<div>
			<input type="password" name="pwd" required>
		</div>
		<br>
		<div class="center">
			<input type="submit" name="submit" id="submit" value="Sign In">
		</div>
		<div class="center">
			<a href="forgotpassword.jsp">Forgot Password</a>
		</div>
		<br>
	</form>

</body>

</html>
