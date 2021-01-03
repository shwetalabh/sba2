<%@page import="java.time.LocalDate"%>

<html>

	<head>

		<title>IBS-Delete Biller</title>

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
		<h1>IBS BANK - Delete Biller</h1>

		
		
		
		<nav>

	<hr />
	 
	 <a href="home.jsp">Home</a>

	 <span>|</span>

	 <a href="addbiller.jsp">Add Biller</a>
	 
	 <span>|</span>

	 <a href="paybills.jsp">Pay Bills</a>
	 
	 <span>|</span>

	 <a href="history.jsp">History</a>
	 
	  <span>|</span>

	 <a href="signout.jsp">Signout</a>
	 
	 

	<hr />

</nav>

		<form action="deleteBiller" method="POST" >

			<div>

				<label>Proprietor Name:&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;</label>

				<input type="string" name="proprietorName"  />

			</div> <br>
			<div>

				<label>Account Number:&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp; </label>

				<input type="string" name="accountNumber"  />

			</div><br>
			<div>

				<label>Confirm Account Number:&nbsp;&nbsp;&nbsp; </label>

				<input type="string" name="accountNumber"  />

			</div><br>
					
			<div>

				<button>SUBMIT</button>
				

			</div>
			
			
</form>	
		
	</body>

</html>