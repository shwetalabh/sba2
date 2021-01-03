<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!doctype html>
<html>
<head>
<title>IBS-SignIn</title>
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
	<section class="container-fluid p-4">
	<h2>Please upload KYC Documents</h2>
		<div class="col-sm-4">
			<form method="POST" enctype="multipart/form-data" action="/upload"
				class="form-control-inline">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
				<div class="form-control-group">
					<label class="form-control-label">File to upload: <input
						class="form-control" type="file" name="file" />
					</label> <input class="btn btn-primary" type="submit" value="Upload" />
			</form>
		</div>
		</div>
	</section>
</body>
</html>
