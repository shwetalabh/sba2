<%@page import="com.wellsfargo.batc7.ibsma.model.Customer"%>

<%@page import="java.time.LocalDate"%>


<html>

	<head>

		<title>IBS-Welcome</title>

	</head>

	<body>

<h3><%=LocalDate.now() %></h3>
		<h1>IBS BANK</h1>

		<jsp:include page="menuw.jsp"/>

		

		

		<% Customer customer = (Customer) request.getAttribute("customer"); %>

<table>
			<tr><td><strong>WELCOME</strong></td>
				<td><em><strong><%=customer.getCustomerName() %></strong></em></td></tr>
				<%--<td><em><%=customer.getPassword() %></em></td></tr>--%>
				</table>
				
				
		<p>

		 
		 </p>

	</body>

</html>