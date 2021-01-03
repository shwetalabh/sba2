<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!doctype html>
<html>
<title>Track Registration Status</title>
<head>
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
	<c:choose>
		<c:when test="${alertMsg!=null}">
			<div class="alert alert-info" align="center">
				<strong>${alertMsg }</strong><br> <br>
			</div>
		</c:when>
		<c:when test="${successMsg!=null}">
			<div class="alert alert-success" align="center">
				<strong>${successMsg }</strong><br> <br>
			</div>
		</c:when>

		<c:when test="${errorMsg!=null}">
			<div class="alert alert-danger" align="center">
				<strong>${errorMsg }</strong><br> <br>
			</div>
		</c:when>
	</c:choose>
	<div class="d-flex justify-content-center">
		<h4>Please enter your registered email address</h4>
	</div>
	<section class="d-flex p-4 justify-content-center">
		<form action="/signup/trackRegistration" method="POST"
			class="form-inline">
			<div class="form-group">
				<label for="role" class="sr-only">Role</label>
				<div class="col-sm-3">
					<select id="role" name="role" class="form-control">
						<option value="USER">USER</option>
						<option value="Service Provider">Service Provider</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="emailId" class="sr-only">Email ID:</label> <input
					class="form-control " type="email" name="emailId" />
			</div>
			<button type="submit" class="btn btn-primary">SUBMIT</button>
		</form>
	</section>
</body>
</html>
