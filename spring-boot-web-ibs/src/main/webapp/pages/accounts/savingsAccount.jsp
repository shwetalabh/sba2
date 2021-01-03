<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>IBS-Open Savings Account</title>
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
				<h2>Savings Account Summary</h2>
				<c:choose>
				<c:when test="${account==null || account.isEmpty() }">
					<div class="alert alert-info">
						<strong>No Savings Account Available to Display</strong>
					</div>
				</c:when>
				<c:otherwise>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>Account No</th>
								<th>Initial Amount Deposit</th>
								<th>Interest Rate</th>
								<th>Deposit Date</th>
								<th>Balance Amount</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${account }">
								<tr>
									<td>${c.accountNum}</td>
									<td>${c.amountDeposit}</td>
									<td>${c.interestRate } </td>
									<td>${c.depositDate} </td>
									<td>${c.balanceAmt} </td>
								</tr>
							</c:forEach>
						</tbody>					
					</table>
				</c:otherwise>
			</c:choose>
	</section>
</body>
</html>