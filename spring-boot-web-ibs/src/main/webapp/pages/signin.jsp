<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!doctype html>
<html>
<head>
<title>IBS-SignIn</title>
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
	<section class="container-fluid p-4" >
		<div class="col-sm-3">
			<div class="btn-sm btn-light" align="center"><h3>Login</h3></div>
			<br>
			<form action="/home" method="POST">
				<c:if test="${param.error != null}">
					<div class="btn btn-warning">Invalid Credentials! Access Denied!</div>
					<br><br>
				</c:if>
				
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
				<div class="form-control-group">
					<label class="form-control-label">UserName: </label> <input
						class="form-control" type="text" name="userName" />
				</div>
				<div class="form-control-group">
					<label class="form-control-label">Password: </label> <input
						class="form-control" type="password" name="password" />
				</div>
				<br>
				<button type="submit" class="btn btn-primary">Sign In</button>
				<a href="forgotPassword" class="btn btn-secondary">Forgot
					Password</a>
			</form>
		</div>

	</section>
</body>
</html>
