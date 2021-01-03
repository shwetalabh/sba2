<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>IBS-Beneficiary</title>
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
	<jsp:include page="/fundtransferHeader" />
	<section class="container-fluid p-4">
		<div class="col-sm-4">
			<div align="center">
				<h3>New Beneficiary</h3>
			</div>
			<form:form action="/fundtransfer/newBenef" method="POST"
				modelAttribute="beneficiary" class="form-horizontal">
				<div>
					<form:errors path="*" />
				</div>
				<div class="form-control-group">
					<form:label path="account.accountNum" class="sr-only">Current User
						Account:</form:label>
					<form:hidden class="form-control" path="account.accountNum"/>
				</div>				
				<div class="form-control-group">
					<form:label path="beneficiaryAccNum" class="form-control-label">Beneficiary Account #</form:label>
					<form:input path="beneficiaryAccNum" class="form-control"/>
				</div>
				<div class="form-control-group">
					<form:label path="beneficiaryName" class="form-control-label">Beneficiary Name</form:label>
					<form:input path="beneficiaryName" class="form-control"/>
				</div>
				<div class="form-control-group">
					<form:label path="ifscCode" class="form-control-label">IFSC</form:label>
					<form:input path="ifscCode" class="form-control"/>
				</div>
				 <div class="form-control-group">
					<form:label path="transactionDate" class="form-control-label">Transaction Date:</form:label>
					<form:input class="form-control" type="date" path="transactionDate"
						value="<%=new java.util.Date()%>"/>
				</div>
				<br>
				<div class="form-control-group">
					<button type="submit" class="btn btn-primary">SUBMIT</button>
				</div>
			</form:form>
		</div>
	</section>
</body>
</html>