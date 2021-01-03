<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>IBS-New Savings Account</title>
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
	<jsp:include page="/accountsHeader" />
	<section class="container-fluid p-4">
		<div class="col-sm-4">
			<div align="center">
				<h3>New Savings Account</h3>
			</div>
			<form:form action="/accounts/newSavingsAccount" method="POST"
				modelAttribute="account" class="form-horizontal">
				<div>
					<form:errors path="*" />
				</div>
				<div class="form-control-group">
					<form:label path="accountType" class="sr-only">Deposit
						Amount:</form:label>
					<form:hidden class="form-control" path="accountType" value="savings"/>
				</div>
				<div class="form-control-group">
					<form:label path="amountDeposit" class="form-control-label">Initial Deposit
						Amount:</form:label>
					<form:input class="form-control" type="number" path="amountDeposit" min="1000" onchange="updateBalAmt()"/>
				</div>
				<div class="form-control-group">
					<form:label path="interestRate" class="form-control-label">Interest
						Rate(%)</form:label>
					<form:input class="form-control" type="number" path="interestRate"
						value="4.75" readonly="true"/>
				</div>
				<div class="form-control-group">
					<form:label path="depositDate" class="form-control-label">Deposit
						Date:</form:label>
					<form:input class="form-control" type="date" path="depositDate"/>
				</div>
				 <div class="form-control-group">
					<form:label path="balanceAmt" class="form-control-label">Balance
						Amount </form:label>
					<form:input class="form-control" type="number" path="balanceAmt" readonly="true"/>
				</div>
				<br>
				<div class="form-control-group">
					<button type="submit" class="btn btn-primary">SUBMIT</button>
				</div>
			</form:form>
		</div>
	</section>
	<script>
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //January is 0!
	var yyyy = today.getFullYear();
	 if(dd<10){
	        dd='0'+dd
	    } 
	    if(mm<10){
	        mm='0'+mm
	    } 

	today = yyyy+'-'+mm+'-'+dd;
	document.getElementById("depositDate").setAttribute("min", today);
	
	function updateBalAmt(){
		document.getElementById("balanceAmt").value=document.getElementById("amountDeposit").value;
		} 
		
	</script>
</body>
</html>