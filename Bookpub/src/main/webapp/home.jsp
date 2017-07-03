<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Publishing System</title>
</head>
<link id="theme" rel="stylesheet" type="text/css" href="style.css"
	title="theme" />
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto+Condensed|Roboto+Condensed|Droid+Sans|Droid+Sans|Droid+Sans|Droid+Sans"
	type="text/css" />
<script type="text/javascript" lang="javascript"
	src="js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" lang="javascript" src="js/scripts.js"></script>
<script type="text/javascript" lang="javascript" src="js/theme.js"></script>
<script type="text/javascript" lang="javascript" src="js/custom.js"></script>
</head>
<body>
	<%@ include file="../../layout/header.jsp"%>
	
<div class="portlet-title">
					<div class="page-header">
						<h3>Login</h3>
					</div>
				</div>
				<div class="portlet-body">
					<form action="../auth/login" method="POST">
						<div class="form-group">
							<label for="userName">EmailId :</label> <input type="email"
								class="form-control" name="emailId" placeholder="Enter emailId"
								autofocus="autofocus" required="required" id="emailId"
								 />
								 </div>
						</form>
						
						</div>
	

						<div class="form-group">
							<label for="password">Password :</label> <input type="password"
								class="form-control" name="password"
								placeholder="Enter Password" required="required" id="password"
								 />
						</div>
						<div class="form-group">
							<button type="submit" name="add" class="btn btn-success"
								id="addLoginBtn"><a href="book/list"></a>SIGN IN
								</button>
							

							<a href="auth/register" class='btn btn-primary'>SIGN UP</a>
						</div>
</body>
</html>