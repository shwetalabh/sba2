<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>IBS-SignUp</title>
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
		<div style="font-size: 1em" class="col-sm-8">
			Already Registered ? Click <a href="/signup/trackRegistration">here</a>
			to check the approval status
		</div>

		<div align="center" class="col-sm-5">
			<h2>IBS-Sign Up</h2>
		</div>
		<form:form action="/signup" method="POST" modelAttribute="customer"
			class="form-horizontal" id="signup">
			<div class="col-sm-3">
				<form:errors path="*" />
			</div>
			<form:hidden path="registrationStatus" value="pending" />
			<div class="form-group row">
				<form:label path="customerName" class="col-sm-2 col-form-label">Full Name</form:label>
				<div class="col-sm-3">
					<form:input path="customerName" class="form-control" type="text" />
				</div>
				<div class="col-sm-3">
					<form:errors path="customerName" />
				</div>
			</div>
			<div class="form-group row">
				<span class="col-sm-2">Select Gender</span>
				<div class="col-sm-3">
					<input name="gender" id="Male" class="form-input-check"
						type="radio" value="Male"> <label for="Male"
						class="form-check-label">Male</label> <input name="gender"
						id="Female" class="form-input-check" type="radio" value="Female">
					<label for="Female" class="form-check-label">Female</label>
				</div>
			</div>
			<div class="form-group row">
				<form:label path="dateOfBirth" class="col-sm-2 col-form-label">Date of Birth / Age :<span
						id="age"></span>
				</form:label>
				<div class="col-sm-3">
					<form:input path="dateOfBirth" class="form-control" type="date"
						onchange="calculateAge()" />
				</div>
				<div class="col-sm-3">
					<form:errors path="dateOfBirth" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="phoneNumber" class="col-sm-2 col-form-label">Phone Number</form:label>
				<div class="col-sm-3">
					<form:input path="phoneNumber" class="form-control" type="text" />
				</div>
				<div class="col-sm-3">
					<form:errors path="phoneNumber" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="emailId" class="col-sm-2 col-form-label">Email ID</form:label>
				<div class="col-sm-3">
					<form:input path="emailId" class="form-control" type="email" />
				</div>
				<div class="col-sm-3">
					<form:errors path="emailId" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="address" class="col-sm-2 col-form-label">Address</form:label>
				<div class="col-sm-3">
					<form:input path="address" class="form-control" type="text" />
				</div>
				<div class="col-sm-3">
					<form:errors path="address" />
				</div>
			</div>
			<%-- <div class="form-control-group">
					<form:label path="userName" class="form-control-label">User Name</form:label>
					<form:input path="userName" class="form-control" type="text" />
				</div>
				<div class="form-control-group">
					<form:label path="password" class="form-control-label">Password</form:label>
					<form:input path="password" class="form-control" type="password" />
				</div>
				<div class="form-control-group">
					<form:label path="confirmPassword" class="form-control-label">Confirm Password</form:label>
					<form:input path="confirmPassword" class="form-control"
						type="password" /> 
				</div>--%>
			<div class="form-group row" id="roleDiv">
				<form:label path="role" class="col-sm-2 col-form-label">Role</form:label>
				<div class="col-sm-3">
					<form:select id="role" path="role" class="form-control">
					<form:option value="--Select--">--Select--</form:option>
						<form:option value="USER">USER</form:option>
						<form:option value="Service Provider">Service Provider</form:option>
					</form:select>
				</div>
			</div>
			<br>
			<div class="form-group row">
				<div class="col-sm-2" align="center">
					<button type="submit" class="btn btn-primary">Register</button>
				</div>
				<div class="col-sm-2" align="center">
					<button type="reset" class="btn btn-primary" onclick="resetUser()">Reset</button>
				</div>
			</div>
		</form:form>
	</section>
	<script type="text/javascript">
		$("#roleDiv")
				.bind(
						"change",
						function selectUser1() {
							if ($('#role').val() == "Service Provider") {
								if($('#myDiv1').length) {
									document.getElementById("myDiv1").remove();
									}
								var $newdiv1 = $('<div class="form-group row" id="myDiv1"><label for="accountNumber" class="col-sm-2 col-form-label">Account Number</label><div class="col-sm-3"><spring:bind path="accountNumber"><input name="accountNumber" class="form-control" type="text" /></spring:bind></div></div>');
								var $newdiv2 = $('<div class="form-group row" id="myDiv3"><label for="ifscCode" class="col-sm-2 col-form-label">IFSC Code</label><div class="col-sm-3"><input name="ifscCode" class="form-control" type="text" /></div></div>');
								$("#roleDiv").after($newdiv1, $newdiv2);
								document.getElementById("signup").setAttribute(
										"action", "/signup/serviceprovider");
								document.getElementById("customerName").setAttribute(
										"id", "spName");
								document.getElementById("customerName").setAttribute(
										"name", "spName");
								
							}if ($('#role').val() == "USER") {
								if($('#myDiv1').length) {
									document.getElementById("myDiv1").remove();
									document.getElementById("myDiv3").remove();
									}
								var $newdiv1 = $('<div class="form-group row" id="myDiv1"><label for="account.accountType" class="col-sm-2 col-form-label">Account Type</label><div class="col-sm-8"><spring:bind path="accountType"><input name="account.accountType" id="savings" class="form-input-check" type="checkbox" value="savings" checked/>Savings Account<br><input name="accountType" id="fixeddeposit" class="form-input-check" type="checkbox" value="fixeddeposit"/>Fixed Deposit<br><input name="accountType" id="recurringdeposit" class="form-input-check" type="checkbox" value="recurringdeposit"/>Recurring Deposit</spring:bind></div></div>');
								$("#roleDiv").after($newdiv1);
								document.getElementById("signup").setAttribute(
										"action", "/signup");
								document.getElementById("spName").setAttribute(
										"id", "customerName");
								document.getElementById("spName").setAttribute(
										"name", "customerName");
							}else {
								document.getElementById("myDiv1").remove();
								document.getElementById("myDiv3").remove();
								document.getElementById("signup").setAttribute("action",
										"/signup");

							}
						});
		
		function resetUser() {
			document.getElementById("myDiv1").remove();
			document.getElementById("myDiv3").remove();
			document.getElementById("signup").setAttribute("action", "/signup");
		}

		function calculateAge() {
			var date = new Date(document.getElementById("dateOfBirth").value);
			var today = new Date();
			var age = today.getYear() - date.getYear();
			document.getElementById("age").innerHTML = age.toString();
			var minAge = today.getYear() - 18;
			document.getElementById("dateOfBirth").setAttribute("min",
					date(minAge));

		}
	</script>
</body>
</html>