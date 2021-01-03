<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>IBS-Amount Transfer</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
</head>
<body>
	<jsp:include page="/fundtransferHeader" />
	<section class="container-fluid p-4">
		<h3>Fund Transfer to Beneficiary</h3>

		<div class="col-sm-4">
			<form:form
				action="/fundtransfer/amountTransfer "
				method="POST" modelAttribute="fund" class="form">
				<%-- <div class="form-control-group">
					<form:errors path="*"></form:errors>
				</div>--%>
				<%-- <div class="form-control-group">
					<form:label path="account.accountNum" class="sr-only">Current User
						Account:</form:label>
					<form:hidden class="form-control" path="account.accountNum"/>
				</div>	 --%>
				<div class="form-control-group">
					<form:label path="account.accountNum" class="form-control-label">Current User
						Account:</form:label>
					<form:select path="account.accountNum" class="form-control">
						<form:options items="${accounts}" itemLabel="accountNum"
							itemValue="accountNum" />
					</form:select>
				</div>
				<div class="form-control-group">
					<form:label path="beneficiaryAccNum" class="form-control-label">Beneficiary Account #</form:label>			
					<form:select id="beneficiaryAccNum" path="beneficiaryAccNum" class="form-control">
					<%-- <form:option value="--Select Beneficiary--">--Select Beneficiary--</form:option>	--%>					
						<form:options items="${fundTransfers}" itemLabel="beneficiaryAccNum"
							itemValue="beneficiaryAccNum" />
					<%-- 	<c:forEach items="${fundTransfers}" var="c"> 
     					<option value="${c.beneficiaryAccNum}" ${c.beneficiaryAccNum == selectedModule ? 'selected':''}>...</option>  
						</c:forEach>--%>
					</form:select>
				</div>
				<div class="form-control-group">
					<form:label path="amtTransfer" class="form-control-label">Enter Amount: </form:label>
					<form:input path="amtTransfer" class="form-control" onchange="calculateCurrentBalance()"/>
				</div>				
				<div class="form-control-group">
					<form:label path="transactionDate" class="form-control-label">Transaction Date: </form:label>
					<form:input class="form-control" type="date" path="transactionDate" />
				</div>
				<div class="form-control-group">
					<form:label path="account.balanceAmt" class="form-control-label">User Balance
						Amount </form:label>
					<form:input class="form-control" type="number" path="account.balanceAmt" readonly="true" />
				</div>
				<br>
				<div class="form-control-group">
					<button class="btn btn-primary">SAVE</button>
				</div>
			</form:form>
		</div>
	</section>
	<script>
		function calculateCurrentBalance() {
			var txnDate = document.getElementById("transactionDate").value;
			var amountAvailable=parseInt(document.getElementById("account.balanceAmt").value);
			var amountTransferred = parseInt(document.getElementById("amtTransfer").value);
			var curBal= amountAvailable - amountTransferred;
			document.getElementById("account.balanceAmt").value = curBal;
		}
			
	</script>
</body>
</html>