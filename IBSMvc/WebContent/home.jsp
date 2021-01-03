<%@page import="java.time.LocalDate"%>


<html>

	<head>

		<title>IBS-Welcome</title>

	</head>
	
	<style>
p{
		
		border:2px;background-image: linear-gradient(grey, lightgrey); border-style:solid;height:50px;width:140px;float:left; border-color:#0000A0; font-weight:bold;padding: 1em;
		
		}
</style>
	<body>

<h3><%=LocalDate.now() %></h3>
		<h1>IBS BANK</h1>
		
		

		<jsp:include page="menuw.jsp"/>

		<h2><strong>WELCOME</strong></h2>

<p style="border:2px; border-style:solid;height:50px;width:140px;float:left; border-color:#0000A0; font-weight:normal;padding: 1em;"><br/><a href="accounts.jsp">ACCOUNTS</a></p>

<p style="border:2px; border-style:solid;height:50px;width:140px;float:right;margin-right:900px; border-color:#0000A0;font-weight:normal; padding: 1em;"><br/><a href="fundtransfer.jsp">FUND TRANSFER</p>
		
<p style="border:2px; border-style:solid;height:50px;width:140px;float:left; border-color:#0000A0; font-weight:normal;padding: 1em;"><br/><a href="menuservices.jsp">BILL PAYMENTS</p>

<p style="border:2px; border-style:solid;height:50px;width:140px;float:right;margin-right:900px; border-color:#0000A0;font-weight:normal; padding: 1em;"><br/><a href="accounts.jsp">STATEMENTS</p>

</body>

</html>