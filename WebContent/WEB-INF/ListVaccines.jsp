<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Vaccines</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<p>
		<a href="NewVaccine"> New Vaccine</a> |
		<a href="NewDoses"> New Doses</a>
	</p>
<div class = "container">
	<table class = "table table-bordered">
		<thead>
			<tr>
				<th scope = "col">Vaccine</th>
				<th scope = "col">Doses Required</th>
				<th scope = "col">Days Between Doses</th>
				<th scope = "col">Total Doses Received</th>
				<th scope = "col">Total Doses Left</th>
				<th scope = "col"> </th>
			</tr>
		</thead>
		<c:forEach items="${entry}" var="entry">
		<tbody>
			<tr>
				<th scope = "row">${entry.vaccine}</th>
				<th scope = "row">${entry.dosesRequired}</th>
				<th scope = "row">${entry.betDoses}</th>
				<th scope = "row">${entry.dosesRec}</th>
				<th scope = "row">${entry.dosesLeft}</th>
				<th scope = "row"><a href="EditVaccine?id=${entry.id}"> Edit</a></th>
			
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
	
</body>
</html>