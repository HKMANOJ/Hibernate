<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="eng">
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
.container {
	margin-top: 180px;
}

.btn {
	min-width: 50px;
}

.title {
	background-color: white;
	width: 300px;
	border: 15px solid green;
	padding: 50px;
	margin: 20px;
}

.header {
	margin-left: 220px;
}
</style>
</head>
<body>

	<div class="container">
		<div class="header">
			<div class="card text-center" style="width: 40em;">
				<div class="card-header">
					<h4>
						<strong> Welcome Web Shop</strong>
					</h4>
				</div>
			</div>
		</div>
		<div>

			<div class="row">
				<div class="col-4 d-flex justify-content-center text-center">
					<br>
					<br>
					<div class="btn">
						<a role="button" class="btn btn-dark btn-info" href="/admin"><strong>ADMIN</strong></a>
						<a role="button" class="btn btn-dark btn-info" href="/register"><strong>REGISTER</strong></a>
						<a role="button" class="btn btn-dark btn-info" href="/loginu"><strong>LOGIN</strong></a>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>