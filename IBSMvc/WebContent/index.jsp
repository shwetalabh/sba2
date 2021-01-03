<!doctype html>
<%@page import="java.time.LocalDate"%>
<html>
<head>
    <title>IBS-Home</title>
    <link rel="stylesheet" href="/IBSMvc/index.css" />
</head>
<body>
    <h1>IBS BANK</h1>
    <jsp:include page="menu.jsp" />
    <h2>Welcome to IBS Bank</h2>
    <p>IBS Bank provides features like easy fund transfer, services
        provided for bills etc..</p>
    <div class="tooltip">
        <p style="border: 2px; background-image: linear-gradient(grey, lightgrey); border-style: solid; height: 50px; width: 140px; float: left; border-color: #0000A0; font-weight: bold; padding: 1em;">
            <br />ACCOUNTS
        </p>
        <span class="tooltiptext">IBS offers the different type of
            accounts like Savings Deposit , Recurring Deposit, Fixed Deposit. To
            enjoy these features please register by signing up.Already a
            customer, SignIn</span>
    </div>

    <div class="tooltip1">
        <p style="border: 2px; background-image: linear-gradient(grey, lightgrey); border-style: solid; height: 50px; width: 140px; float: left; border-color: #0000A0; font-weight: bold; padding: 1em;">
            <br />FUND TRANSFER
        </p>
        <span class="tooltiptext1">IBS offers easy fund transfer to
            their beneficiaries in the other banks or same bank.To enjoy these
            features, please register by signing up. Already a customer, SignIn</span>
    </div>
    <br>
    <div class="tooltip3">
        <p style="border: 2px; background-image: linear-gradient(grey, lightgrey); border-style: solid; height: 50px; width: 140px; float: left; border-color: #0000A0; font-weight: bold; padding: 1em;">
            <br />BILL PAYMENTS
        </p>
        <span class="tooltiptext3">IBS offers variety of services like
            pay phone bills, electricity bills and lot more just in a click.To
            enjoy these features, please register by signing up. Already a
            customer, SignIn</span>
    </div>

    <div class="tooltip4">
        <p style="border: 2px; background-image: linear-gradient(grey, lightgrey); border-style: solid; height: 50px; width: 140px; float: left; border-color: #0000A0; font-weight: bold; padding: 1em;">
            <br />STATEMENTS
        </p>
        <span class="tooltiptext4">IBS offers bank statements -
            Monthly, Annual and Periodic.To enjoy these features, please register
            by signing up. Already a customer, SignIn</span>
    </div>
</body>
</html>
