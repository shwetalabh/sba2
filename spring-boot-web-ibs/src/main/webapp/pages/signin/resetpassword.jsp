<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>IBS-Reset Password</title>
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
	<h3>Reset Password</h3>
	<section class="container-fluid p-4">
		<div class="col-sm-4">
			<form action="/forgotPassword/reset" method="POST">
				<div class="form-control-group">
					<label for="userName" class="form-control-label">User Name</label>
					<input name="userName" class="form-control" type="text" />
				</div>
				<div class="form-control-group">
					<label for="password" class="form-control-label">New
						Password</label> <input name="password" class="form-control"
						type="password" />
				</div>
				<div class="form-control-group">
					<label for="confirmPassword" class="form-control-label">Confirm
						New Password</label> <input name="confirmPassword" class="form-control"
						type="password" />
				</div>
				<br>
				<button class="btn btn-primary">RESET</button>
			</form>
		</div>
	</section>
</body>
</html>