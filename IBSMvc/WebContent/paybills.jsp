<%@page import="java.time.LocalDate"%>

<html>

	<head>

		<title>IBS-Pay Bill</title>

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

		<h1>IBS BANK - Pay Bills</h1>

		
		<nav>

	<hr />
	 
	 <a href="home.jsp">Home</a>

	 <span>|</span>

	 <a href="addbiller.jsp">Add Biller</a>
	 
	 <span>|</span>

	 <a href="deletebiller.jsp">Delete Biller</a>
	 
	 <span>|</span>

	 <a href="history.jsp">History</a>
	 
	  <span>|</span>

	 <a href="signout.jsp">Signout</a>
	 
	 

	<hr />

</nav>

		<form action="payBill" method="POST" >

			<div>

				<label>Category:&nbsp;&nbsp;&nbsp;</label>

				<input type="string" name="proprietorName"  />

			</div>
			
			
			
			
			
</form>	
		
	</body>

</html>