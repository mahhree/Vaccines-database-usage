<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Doses</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<form class="form-group col-md-3" method="post">
			Vaccines: <select class="form-control" name="name">
				<c:forEach items="${entry}" var="entry">
					<option>${entry.vaccine}
				</c:forEach>
			</select>
			<div class="form-group">
				New Doses Received: <input class="form-control" type="text"
					name="newDoses">

				<button class="btn btn-small">Add</button>
			</div>
		</form>
	</div>

</body>
</html>