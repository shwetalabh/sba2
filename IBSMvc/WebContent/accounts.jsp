
<%@page import="java.time.LocalDate"%>


<html>

	<head>

		<title>IBS-Accounts</title>

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
		<h1>IBS BANK</h1>

		<jsp:include page="menuaccounts.jsp"/>

		<h2>Savings Account</h2>
		<h3> Total Account Balance</h3>
		
		<form action="acbal" method="POST" >

			<div>

				<label>Account Number:</label>
				<% String accountNumber = "000123456789";
					out.println(""+ accountNumber);%> 

			</div><br>
			<div>

				<label>Amount:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>	
				<% double totalAmount = 700000;
					out.println(""+ totalAmount);%>
			</div>
			
</body>
		


</html>