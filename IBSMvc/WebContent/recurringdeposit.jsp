
<%@page import="java.time.LocalDate"%>


<html>

	<head>

		<title>IBS-RecurringDeposits</title>

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
		<h2>IBS BANK-Recurring Deposit</h2>
		
		<nav>

	<hr />
	  
	 <a href="accounts.jsp">Accounts</a>

	 <span>|</span>

	 <a href="fixeddeposit.jsp">Fixed Deposit</a>
	 
	 <span>|</span>

	 <a href="signout.jsp">Signout</a>	 

	<hr />

</nav>

<form action="rd" method="POST" >

			<div>
				<label>Deposit Amount:&emsp;&emsp;&nbsp; </label>
				<input type="number" name="amountDeposit" required /> 
			</div><br/>
			<div>
				<label>Interest Rate(%) (0-1): </label>
				<input type="number" name="interestRate" min="0" max="1" step="0.01" required />
			</div><br/>
			<div>
				<label>Deposit Date:&emsp;&emsp;&emsp;&nbsp; </label>
				<input type="date" name="depositDate" required />
			</div><br/>			
			<div>
				<label>Maturity Date:&emsp;&emsp;&emsp; </label>
				<input type="date" name="maturityDate" required />
			</div><br/>
			<div>
				<label>Next Deposit Date:&emsp; </label>
				<input type="date" name="depositDate" required />
			</div><br/>
			<div>
				<button>SUBMIT</button>		
			</div>		
		</form>			
	</body>
</html>