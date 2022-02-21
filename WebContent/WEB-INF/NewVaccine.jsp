<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Vaccine</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class = "container">
	<form method="post" class="form-group col-md-3">
	
		<div class="form-group">
			Name: <input class="form-control " type="text" name="name" >
		</div>
	
		<div class="form-group">
				Doses Required: 
					<select
						class="form-control" name="DosesRequired" >
						<option>1</option>
						<option>2</option>
					</select>
		</div>
	
		<div class="form-group">
				Days Between Doses: <input class="form-control " type="text" name="betDoses">
		</div>
	
	
	
<!-- 		Name: <input type="text" name="name"><br> 
		Doses Required:
			<select class="form-control" name="name">
				<option>1</option>
				<option>2</option>
			</select> <input type="text" name="DosesRequired"> <br> 
		Days Between Doses: 
			<input type="text" name="betDoses"><br> -->
			
			
			
		<button class="btn btn-small">Add</button>
	</form>
</div>
</body>
</html>