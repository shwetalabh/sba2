<%@page import="java.time.LocalDate"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<html>
<head>
<title>IBS-Accounts</title>
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
	<br>
	<section class="container-fluid p-4">
		<div class="jumbotron" align="center">
			<div class="btn-lg btn-info">IBS offers below accounts with
				attractive interest rates !!</div>
				<br><br>
			 <a href="/accounts/newSavingsAccount"><button type="button" class="btn-lg btn-success">Savings Account</button></a> 
			<a href="/accounts/newFixedDeposit"><button type="button" class="btn-lg btn-success">Fixed Deposit</button></a>
			<a href="/accounts/newRecurringDeposit"><button type="button" class="btn-lg btn-success">Recurring Deposit</button></a> <br>
			<br>
		</div>
		<%-- <h4>Total Account Balance</h4>
		<div class="col-sm-4">
			<div class="form-control-group">
				<label class="form-control-label">Account Number:</label> <label
					class="form-control"> <%String accountNumber = "000123456789"; out.println("" + accountNumber); %>
				</label>
			</div>
			<div class="form-control-group">
				<label class="form-control-label">Amount:</label>
				<label class="form-control"> <%double totalAmount = 700000;out.println("" + totalAmount);%></label>
			</div>
		</div> --%>
	</section>
</body>
</html>