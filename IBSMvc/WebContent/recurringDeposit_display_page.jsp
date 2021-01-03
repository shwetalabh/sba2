<%@page import="com.wellsfargo.batc7.ibsma.model.Account"%>
<%@page import="java.time.LocalDate"%>
<html>
	<head>
		<title>recurring deposit form</title>
	</head>
	<body>
		<h3><%=LocalDate.now() %></h3>
		<h1>IBS Bank</h1>
		<jsp:include page="menuaccounts.jsp"/>
		
		<h2>Recurring Deposit</h2>	
				
		<table>
			<tr><td><strong>Deposit Amount</strong></td>
				<td><em>${account.amountDeposit}</em></td></tr>			
			<tr><td><strong>Deposit Date</strong></td>
				<td><em>${account.depositDate}</em></td></tr>
			<tr><td><strong>Maturity Date</strong></td>
				<td><em>${account.maturityDate}</em></td></tr>
			<tr><td><strong>Period</strong></td>
				<td><em>${account.timeInMonths} months</em></td></tr>
			<tr><td><strong>Interest Received</strong></td>
				<td><em>${account.interestRate}</em></td></tr>
			<tr><td><strong>Amount on Maturity</strong></td>
				<td><em>${account.maturityAmount}</em></td></tr>
		</table>
		
	</body>
</html>