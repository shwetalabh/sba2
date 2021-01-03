<%@page import="java.time.LocalDate"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>

	<head>
<meta http-equiv="Content-Type" content="application/x-www-form-urlencoded; charset=ISO-8859-1">
		<title>IBS-AddPayee</title>

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
		<h2>IBS BANK-Add Payee</h2>
		
		<nav>

	<hr />
	
	<a href="home.jsp">Home</a>

	 <span>|</span>
 
	 <a href="deletepayee.jsp">Delete Payee</a>
	 
	 <span>|</span>

	 <a href="history.jsp">History</a>
	 
	  <span>|</span>

	 <a href="signout.jsp">Signout</a>
	<hr />

</nav>

<form method="get" action="addpayee.jsp"> 
<INPUT TYPE="radio" name="command" value="0"/>IBS Bank
<INPUT TYPE="radio" NAME="command" VALUE="1"/>Other Bank
<INPUT TYPE="submit" VALUE="Go" />
</form>
<%
String sCommand = request.getParameter("command");

%>

<%-- out.println(sCommand);
out.println(""+request.getParameter("command")); --%>

<form action="adpy" method="POST" >

<%-- <c:if test="${sCommand==0}"> --%>


			<div>
				<label>Account No:&nbsp;&nbsp;</label>

				<input type="string" name="accountNumber"  />

			</div><br>
			<div>

				<label>IFSC Code:&nbsp;&nbsp;&nbsp; </label>

				<input type="string" name="ifscCode"  />

			</div><br>
			<div>

				<label>Payee Name:&nbsp; </label>
				<input type="string" name="payeeName"  />

			</div>		<br>	
			<div>
				<label>Mobile No:&emsp; </label>
				<input type="string" name="mobileNumber"  />

			</div><br>
			<div>
				<label>Email ID:&emsp;&nbsp;&nbsp;&nbsp; </label>
				<input type="email" name="emailID"  />

			</div><br>
			
							<button>SUBMIT</button>
				

			</div>
		<%--	</c:if> --%>
			
</form>	

		
		</body>
		


</html>