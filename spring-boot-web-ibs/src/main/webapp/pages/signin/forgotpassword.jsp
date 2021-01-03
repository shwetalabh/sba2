<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<title>IBS-Forgot Password</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="/header" />
	
	<br><br><br>
	<div class="d-flex justify-content-center">
	<h4>Please enter your registered email address</h4>
	</div>
	<section class="d-flex p-4 justify-content-center">
		
		<form action="/forgotPassword" method="POST" class="form-inline"
			id="signup">
			<div class="form-group">
				<label for="emailId" class="sr-only">Email ID:</label> 
				<input class="form-control " type="email" name="emailId" />
			</div>
			<button type="submit" class="btn btn-primary">SUBMIT</button>
		</form>
	</section>
</body>

</html>