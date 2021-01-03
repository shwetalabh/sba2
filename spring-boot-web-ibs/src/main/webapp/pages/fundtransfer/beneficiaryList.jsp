<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>IBS-Beneficiaries</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="/fundtransferHeader" />
	<section class="container-fluid p-4">
				<h2>Beneficiary Details</h2>
				<c:choose>
				<c:when test="${beneficiary==null || beneficiary.isEmpty() }">
					<div class="alert alert-info">
						<strong>No Beneficiary is added to Display</strong>
					</div>
				</c:when>
				<c:otherwise>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>User Account #</th>
								<th>Beneficiary Account #</th>
								<th>Beneficiary Name</th>
								<th>IFSC Code</th>								
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${beneficiary }">
								<tr>
									<td>${c.account.accountNum }</td>
									<td>${c.beneficiaryAccNum}</td>
									<td>${c.beneficiaryName}</td>
									<td>${c.ifscCode } </td>
									<td>
										<a href="/fundtransfer/edit?benefAccNum=${c.beneficiaryAccNum }" class="btn btn-sm btn-info">
											EDIT
										</a>
									</td>																		
								</tr>
							</c:forEach>
						</tbody>					
					</table>
				</c:otherwise>
			</c:choose>
	</section>
</body>
</html>