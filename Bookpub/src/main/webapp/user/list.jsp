<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Users</title>
</head>


<body>
	<%@ include file="../../layout/header.jsp"%>

	<div class="container-fluid">

		<div class="row">
			<div class="col-md-12">



				<div class="panel panel-default">
					<div class="panel-heading">
						<strong><i class="fa fa-list"></i> List of Users</strong>
					</div>
					<div class="panel-body">
						<table id="usersTbl" border="1"
							class="table table-striped table-bordered">
							<thead>
								<tr>
									<th width="5%">Sno</th>
									<th>Name</th>
									<th>Email</th>
									<th>Status</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${USERS_LIST}" var="user" varStatus="loop">
									<tr>
										<td>${loop.index+1}</td>
										<td>${user.name}</td>
										<td>${user.email }</td>
										<td>${user.active ?"Active":"Inactive"}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$("#usersTbl").DataTable();

			/*$("#usersTbl").dataTable({
				pageLength : 10,
				stateSave : true,
				'aoColumnDefs' : [ {
					'bSortable' : false,
					'aTargets' : [ 'nosort' ]
				} ]
			});
			$("#enrolledPage1").addClass("active");
			$('[data-toggle="tooltip"]').tooltip();*/
		});
	</script>
</body>

</html>