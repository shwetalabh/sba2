<%@page import="java.time.LocalDateTime"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
 <link rel="stylesheet" href="/IBSMvc/style.css" />
<nav class="nav">
		
	<hr />

	 <a href="index.jsp">Home</a>

	 <span>|</span>

	 <a href="signup.jsp">Sign Up</a>
	 
	 <span>|</span>

	 <a href="signin.jsp">Sign In</a>
	 
	 <div class="date">
		<%LocalDateTime localDateTime = LocalDateTime.now();%>
		<%=localDateTime.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY hh:mm a"))%>
	</div>

	<hr />

</nav>