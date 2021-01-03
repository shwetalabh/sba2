<%@page import="java.time.LocalDateTime"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
	LocalDateTime localDateTime = LocalDateTime.now();
%>
<%
	String date = localDateTime.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY hh:mm a"));
%>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark ">
	<a class="navbar-brand" href="/home">IBS Bank</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarText" aria-controls="navbarText"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav mr-auto">

			<c:choose>
				<c:when test="${role=='ADMIN' }">
					<li class="nav-item active "><a class="nav-link" href="/admin">Home</a></li>
					<li class="nav-item "><a class="nav-link" href="/bankservices">Bank
							Services</a></li>
					<li class="nav-item "><a class="nav-link" href="/signout">Sign Out</a></li>
				</c:when>
				<c:when test="${role=='SP' || role=='NEWSP' }">
					<li class="nav-item active "><a class="nav-link" href="/sp-home">Home</a></li>
					<li class="nav-item "><a class="nav-link" href="/bankservices">Bank
							Services</a></li>
					<li class="nav-item "><a class="nav-link" href="/signout">Sign Out</a></li>
				</c:when>
				<c:otherwise>
					<li class="nav-item active "><a class="nav-link"
						href="/signin/home">Home</a></li>
					<li class="nav-item "><a class="nav-link" href="/accounts">Accounts</a>
					</li>
					<li class="nav-item "><a class="nav-link" href="/fundtransfer">Fund
							Transfer</a></li>
					<li class="nav-item "><a class="nav-link" href="/bankservices">Bank
							Services</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> ${userName }<span class="caret"></span></a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-link" href="/changePassword">Change
								Password</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-link" href="/signout">Sign Out</a>
						</div></li>
				</c:otherwise>
			</c:choose>
		</ul>
		<span class="navbar-text" style="color: white"><%=date%></span>
	</div>
</nav>