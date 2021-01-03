<%@page import="java.time.LocalDate"%>


<html>

	<head>

		<title>IBS-Fundtransfer</title>

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
		<h1>IBS BANK - Fund Transfer</h1>



<nav>

	<hr />
	 <a href="home.jsp">Home</a>

	 <span>|</span>
	 
	 <a href="addpayee.jsp">Add Payee</a>

	 <span>|</span>

	 <a href="deletepayee.jsp">Delete Payee</a>
	 
	 <span>|</span>

	 <a href="history.jsp">History</a>
	 
	  <span>|</span>

	 <a href="signout.jsp">Signout</a>
	 
	 

	<hr />

</nav>

<p> You can transfer funds to the beneficiary account </p>