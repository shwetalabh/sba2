<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!doctype html>
<html>
<head>
<title>IBS-SignIn</title>
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
	<jsp:include page="/header1" />
	<section class="container-fluid p-4">
		<div>Customer Pending Approval Requests</div>
		<c:choose>
				<c:when test="${customers==null || customers.isEmpty() }">
					<div class="alert alert-info">
						<strong>No pending approval requests available to display</strong>
					</div>
				</c:when>
				<c:otherwise>
				<table class="table table-bordered table-striped">
						<thead>
							<tr align="center">
								<th>Full Name</th>
								<th>Gender</th>
								<th>Date Of Birth</th>
								<th>Phone Number</th>
								<th>Address</th>
								<th>Email</th>
								<th>Registration Status</th>
								<th colspan="2"> Approve / Reject </th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${customers }">
								<tr align="center">
									<td>${c.customerName}</td>
									<td>${c.gender}</td>
									<td>${c.dateOfBirth } </td>
									<td>${c.phoneNumber} </td>
									<td>${c.address} </td>
									<td>${c.emailId} </td>
									<td>${c.registrationStatus} </td>
									<td>
										<a href="/admin/approve?cid=${c.userId }" class="btn btn-sm btn-success">
											Approve
										</a>
									</td>
									<td>
										<a href="/admin/reject?cid=${c.userId }" class="btn btn-sm btn-danger">
											Reject
										</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>					
					</table>
				</c:otherwise>
				</c:choose>
	</section>
	<section class="container-fluid p-4">
		<div>Service Provider Pending Approval Requests</div>
		<c:choose>
				<c:when test="${serviceproviders==null || serviceproviders.isEmpty() }">
					<div class="alert alert-info">
						<strong>No pending approval requests available to display</strong>
					</div>
				</c:when>
				<c:otherwise>
				<table class="table table-bordered table-striped">
						<thead>
							<tr align="center">
								<th>Full Name</th>
								<th>Gender</th>
								<th>Date Of Birth</th>
								<th>Phone Number</th>
								<th>Address</th>
								<th>Email</th>
								<th>Registration Status</th>
								<th>Account Number</th>
								<th>IFSC Code</th>
								<th colspan="2"> Approve / Reject </th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${serviceproviders }">
								<tr align="center">
									<td>${c.customerName}</td>
									<td>${c.gender}</td>
									<td>${c.dateOfBirth } </td>
									<td>${c.phoneNumber} </td>
									<td>${c.address} </td>
									<td>${c.emailId} </td>
									<td>${c.registrationStatus} </td>
									<td>${c.accountNumber }</td>
									<td>${c.ifscCode }</td>
									<td>
										<a href="/admin/approveSP?spid=${c.userId }" class="btn btn-sm btn-success">
											Approve
										</a>
									</td>
									<td>
										<a href="/admin/rejectSP?spid=${c.userId }" class="btn btn-sm btn-danger">
											Reject
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
