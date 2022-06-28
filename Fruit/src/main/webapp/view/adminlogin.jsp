
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="eng">
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
 

</style>
</head>
<body>
<nav class ="de">
	<div class="container">
		<div class="header">
			<div class="card text-center" style="width: 40em;">
				<div class="card-header">
					<h4>
						<strong> ADMIN LOGIN</strong>
					</h4>
				</div>
				<br>
				<form action="login" method="post" modelattribute="user" >
					<div class="form-group row">
						<label class="col-sm-2 col-form-label"><strong>Username</strong></label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="name" 
								name="name" placeholder="Username" required="required">
						</div>
					</div>
					<br>
					<div class="form-group row">
						<label class="col-sm-2 col-form-label"><strong>Password</strong></label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="password"
								name="password" placeholder="Password" required="required">
						</div>
					</div>
					<br>
					<button class="btn btn-success">LOGIN</button>
					<br>
				</form>
				<br>
			</div>
		</div>
	</div>
	</nav>
</body>
</html>