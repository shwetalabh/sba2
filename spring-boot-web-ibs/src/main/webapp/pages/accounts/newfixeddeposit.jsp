<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.time.LocalDate"%>
<html>
<head>
<title>IBS-FixedDeposits</title>
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
				<h3>New Fixed Deposit</h3>
			</div>
			<form:form action="/accounts/newFixedDeposit" method="POST"
				modelAttribute="account" class="form-horizontal">
				<div>
					<form:errors path="*" />
				</div>
				<div class="form-control-group">
					<form:label path="accountType" class="sr-only">Deposit
						Amount:</form:label>
					<form:hidden class="form-control" path="accountType" value="fixeddeposit"/>
				</div>
				<div class="form-control-group">
					<form:label path="amountDeposit" class="form-control-label">Deposit
						Amount:</form:label>
					<form:input class="form-control" type="number" path="amountDeposit" />
				</div>
				<div class="form-control-group">
					<form:label path="interestRate" class="form-control-label">Interest
						Rate(%)</form:label>
					<form:input class="form-control" type="number" path="interestRate"
						value="6.5" readonly="true"/>
				</div>
				<div class="form-control-group">
					<form:label path="depositDate" class="form-control-label">Deposit
						Date:</form:label>
					<form:input class="form-control" type="date" path="depositDate"/>
				</div>
				<div class="form-control-group">
					<form:label path="timeInYears" class="form-control-label">Select
						Years </form:label>
					<form:input class="form-control" type="number" path="timeInYears" min="0" max="15" value="0"
						onchange="calculateMaturityDate()" />
				</div>
				<div class="form-control-group">
					<form:label path="timeInMonths" class="form-control-label">Select
						Months </form:label>
					<form:input class="form-control" type="number" min="0" max="11"
						path="timeInMonths" value="0" onchange="calculateMaturityDate()" />
				</div>
				<div class="form-control-group">
					<form:label path="maturityDate" class="form-control-label">Maturity
						Date: </form:label>
					<form:input class="form-control" type="date" path="maturityDate" />
				</div>
				<div class="form-control-group">
					<form:label path="interestReceived" class="form-control-label">Interest
						Received </form:label>
					<form:input class="form-control" type="text"
						path="interestReceived" readonly="true" />
				</div>
				<div class="form-control-group">
					<form:label path="maturityAmount" class="form-control-label">Maturity
						Amount </form:label>
					<form:input class="form-control" type="number" path="maturityAmount" readonly="true" />
				</div>
				<div class="form-control-group">
					<form:label path="balanceAmt" class="form-control-label">Balance
						Amount </form:label>
					<form:input class="form-control" type="number" path="balanceAmt" readonly="true" />
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
	
		function calculateMaturityDate() {
			var depositDate = document.getElementById("depositDate").value;
			var timeInYears = parseInt(document.getElementById("timeInYears").value);
			var timeInMnth = parseInt(document.getElementById("timeInMonths").value);
			var maturityDate = new Date(depositDate);
			maturityDate.setMonth(maturityDate.getMonth() + timeInMnth);
			maturityDate.setFullYear(maturityDate.getFullYear() + timeInYears);
			var endDate = maturityDate.toISOString().substr(0, 4)+ "-"
					+ maturityDate.toISOString().substr(5, 2) + "-"
					+ maturityDate.toISOString().substr(8, 2) ;
			document.getElementById("maturityDate").value = endDate;

			var amountDeposit = parseInt(document
					.getElementById("amountDeposit").value);
			var interestRate = parseFloat(document.getElementById("interestRate").value);
			var term = timeInYears + (timeInMnth / 12);
			var maturityAmt = amountDeposit
					* (1 + ((interestRate * term) / 100));
			var interestReceived = maturityAmt - amountDeposit;
			document.getElementById("maturityAmount").value = maturityAmt;
			document.getElementById("interestReceived").value = interestReceived;
			document.getElementById("balanceAmt").value = maturityAmt;

		}
	</script>
</body>


</html>