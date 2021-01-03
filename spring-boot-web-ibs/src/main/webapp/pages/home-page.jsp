<!doctype html>
<%@page import="java.time.LocalDate"%>
<html>
<head>
    <title>IBS-Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>  	
    <%-- <link rel="stylesheet" href="/css/index.css" /> --%>
</head>
<body>
    <jsp:include page="/header" />    
    <h2>Welcome to IBS Bank</h2>
    <p>IBS Bank provides features like easy fund transfer, services
        provided for bills etc..</p>
    <section class="container-fluid p-4">
		<div class="jumbotron">
			<button type="button" class="btn-lg btn-dark" data-toggle="tooltip" data-placement="top" title="IBS offers the different type of accounts like Savings Deposit , Recurring Deposit, Fixed Deposit. To
            enjoy these features please register by signing up.Already a
            customer, SignIn">Accounts</button>
			<button type="button" class="btn-lg btn-dark" data-toggle="tooltip" data-placement="right" title="IBS offers easy fund transfer to their beneficiaries in the other banks or same bank.To enjoy these
 			features, please register by signing up. Already a customer, SignIn">Fund Transfer</button>
		<button type="button" class="btn-lg btn-dark" data-toggle="tooltip" data-placement="bottom" title="IBS offers variety of services like
            pay phone bills, electricity bills and lot more just in a click.To
            enjoy these features, please register by signing up. Already a
            customer, SignIn">Bill Payments</button>
		<button type="button" class="btn-lg btn-dark" data-toggle="tooltip" data-placement="left" title="IBS offers bank statements -
            Monthly, Annual and Periodic.To enjoy these features, please register
            by signing up. Already a customer, SignIn">Statements</button>
   
    </div>
    </section>
</body>
</html>
