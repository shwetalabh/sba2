<%@page import="com.wellsfargo.batc7.ibsma.model.Account"%>
<%@page import="java.time.LocalDate"%>
<html>
	<head>
		<title>fixed deposit form</title>
	</head>
	
	<style>

a{

background-color: LightGray;
color:#990000;
font-size: large;
border: 2px black;
}

a:hover{
background-color: yellow;
}

body{
		background-color: #FFFFF0;
		
		background-image: url(https://st.depositphotos.com/1760261/1348/i/950/depositphotos_13481996-stock-photo-bank.jpg);
		background-position: center top;
		background-size: 150px;
 		
  		
		background-repeat: no-repeat;
		background-attachment: fixed;
		}
		
</style>
	<body>
		<h3><%=LocalDate.now() %></h3>
		<h1>IBS Bank</h1>
		<jsp:include page="menuaccounts.jsp"/>
		
		<h2>Fixed Deposit</h2>
		<%-- 
		<% Loan loan = (Loan) request.getAttribute("loan"); %>
		
		<table>
			<tr><td><strong>Loan Amount</strong></td>
				<td><em><%=loan.getLoanAmount() %></em></td></tr>
			<tr><td><strong>Rate Of Interest %</strong></td>
				<td><em><%=loan.getRate() %></em></td></tr>
			<tr><td><strong>Disbursement Date</strong></td>
				<td><em><%=loan.getDisbursementDate() %></em></td></tr>
			<tr><td><strong>Due Date</strong></td>
				<td><em><%=loan.getDueDate() %></em></td></tr>
			<tr><td><strong>Time</strong></td>
				<td><em><%=loan.getTimeInYears() %> yrs</em></td></tr>
			<tr><td><strong>Interest</strong></td>
				<td><em><%=loan.getInterest() %></em></td></tr>
			<tr><td><strong>Payable Amount</strong></td>
				<td><em><%=loan.getPayableAmount() %></em></td></tr>
		</table> --%>
				
		<table>
			<tr><td><strong>Deposit Amount</strong></td>
				<td><em>${account.amountDeposit}</em></td></tr>			
			<tr><td><strong>Deposit Date</strong></td>
				<td><em>${account.depositDate}</em></td></tr>
			<tr><td><strong>Maturity Date</strong></td>
				<td><em>${account.maturityDate}</em></td></tr>
			<tr><td><strong>Period</strong></td>
				<td><em>${account.timeInYears} yrs</em></td></tr>
			<tr><td><strong>Interest Received</strong></td>
				<td><em>${account.interestRate}</em></td></tr>
			<tr><td><strong>Amount on Maturity</strong></td>
				<td><em>${account.maturityAmount}</em></td></tr>
		</table>
		
	</body>
</html>