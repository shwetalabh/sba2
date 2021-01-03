<%@page import="java.time.LocalDateTime"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
<%LocalDateTime localDateTime = LocalDateTime.now();%>
<% String date=localDateTime.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY hh:mm a"));%>


<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
<a class="navbar-brand" href="/signin/home">IBS Bank</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarText" aria-controls="navbarText"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">

		<ul class="navbar-nav mr-auto">
    	<li class="nav-item">
      		<a class="nav-link" href="/signin/home">Home</a>
    	</li>
    	<li class="nav-item active ">
     		 <a class="nav-link" href="/fundtransfer">Fund Transfer</a>
    	</li> 
    	<li class="nav-item ">
     		 <a class="nav-link" href="/fundtransfer/beneficiaryList">Beneficiaries</a>
    	</li>
    	<li class="nav-item ">
     		 <a class="nav-link" href="/fundtransfer/transactionsList">Transactions</a>
    	</li>    	    	 
   		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
			aria-haspopup="true" aria-expanded="false"> ${userName }<span
				class="caret"></span></a>
			<div class="dropdown-menu" aria-labelledby="navbarDropdown">
				<a class="dropdown-link" href="/changePassword">Change Password</a>
				<div class="dropdown-divider"></div>
				<a class="dropdown-link" href="/signout">Sign Out</a>
			</div></li>
   </ul>
		<span class="navbar-text" style="color: white"><%=date%></span>
	</div>  
</nav>