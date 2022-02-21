<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Vaccine</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">

		<form method="post" class="form-group col-md-3">
			<div class="form-group">
				Name: <input class="form-control " type="text" name="name" value="${entry.vaccine}">
			</div>

<!-- something is wrong here it doesnt show correct doses required for each vaccine -->
			<div class="form-group">
				Doses Required: 
					<select
						class="form-control" name="DosesRequired" id="${entry.dosesRequired}">
						<option>1</option>
						<option>2</option>
					</select>
			</div>


			<div class="form-group">
				Days Between Doses: <input class="form-control " type="text" name="betDoses">
			</div>
			




<%-- 	<input class="form-control" type="hidden" name="id"
			value="${entry.id}"> 
				Name: 
					<input type="text" name="name"
						value="${entry.vaccine}"><br>  --%>
			
<%-- 	Doses Required: <input type="text" name="DosesRequired" 
			value="${entry.dosesRequired}"><br> --%>
			
			
<!-- Days Between Doses: <input type="text" name="betDoses" 
			value="${entry.betDoses}"><br>-->



				
			<button class="btn btn-small">Save</button>
		</form>

	</div>

</body>
</html>