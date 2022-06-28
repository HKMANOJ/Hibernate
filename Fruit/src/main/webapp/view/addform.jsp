<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<!DOCTYPE html>
<html lang="eng">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

<style type="text/css">
	.container{
		margin-top: 150px;
	}

	.card
	{
	
		width: 90px;
	}
</style>
</head>
<body>
	<div class="container">
		<div class="card" style="width: 20cm;">
		<div class="card-header" style="align-content: center;">
			<strong>ADD NEW DETAILS</strong>
		</div>
  	<div class="card-body">
  	
<form action="/save" method="post">
  <div class="row mb-3">
    <label class="col-sm-2 col-form-label"><strong>ID</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="id" name="id" placeholder="Enter ID">
    </div>
  </div>
  <div class="row mb-3">
    <label class="col-sm-2 col-form-label"><strong>FRUIT NAME</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="fruitname" name="fruitname" placeholder="Enter the name">
    </div>
  </div>
  <div class="row mb-3">
    <label class="col-sm-2 col-form-label"><strong>FRUIT PRICE</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="fruitprice" name="fruitprice" placeholder="Enter the price">
    </div>
  </div>
  <div class="row mb-3">
    <label class="col-sm-2 col-form-label"><strong>QUANTITY</strong></label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="quantity" name="quantity" placeholder="Enter the quantity">
    </div>
  </div>
  
  <button type="submit" class="btn btn-success" style="align-content: center;"><strong>STORE</strong></button>
</form>
 	 </div>
	</div>
	</div>
</body>
</html>
