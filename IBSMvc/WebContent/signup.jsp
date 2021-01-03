<html>

<head>

<title>IBS-SignUp</title>
<style type="text/css">
div.left {
	width: 150px;
	float: left;
}

h1 {
	text-decoration-line: underline;
}

a {
	text-decoration: none;
}
</style>

</head>

<body>

	<h1>IBS BANK</h1>

	<jsp:include page="menu.jsp" />

	<h2>Welcome for registration</h2>

	<form action="sgup" method="POST">

		<div class="left">
			<label for="customerName">Customer Name</label>
		</div>
		<div>
			<input type="text" id="customerName" name="customerName" required />
		</div>
		<br>
		<div class="left">
			<label for="dateOfBirth">Date of Birth</label>
		</div>
		<div>
			<input type="date" id="dateOfBirth" name="dateOfBirth" required />
		</div>
		<br>
		<div class="left">
			<label for="phoneNumber">Phone Number</label>
		</div>
		<div>
			<input type="text" id="phoneNumber" name="phoneNumber" required />
		</div>
		<br>
		<div class="left">
			<label for="emailId">Email ID</label>
		</div>
		<div>
			<input type="email" id="emailId" name="emailId" required />
		</div>
		<br>
		<div class="left">
			<label for="address">Address</label>
		</div>
		<div>
			<textarea id="address" name="address" rows="4" cols="50"
				maxlength="200" placeholder="Enter Address here..."></textarea>
		</div>
		<br> <br /> <br />
		<div class="left">
			<input type="submit" value="SUBMIT">
		</div>
		<div>
			<input type="reset" value="RESET">
		</div>

	</form>



</body>

</html>