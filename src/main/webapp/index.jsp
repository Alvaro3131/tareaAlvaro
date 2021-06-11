<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" media="all" />
</head>
<body>
	<div class="container" style="max-width: 500px">
		<h1>Registrar Rol</h1>
		<hr />
		<div class="form-group">
			<input type="text" class="form-control" name="nomrol" id="nomrol" />
			<input type="hidden" name="id" id="id" value="0"/>
		</div>
		<div class="form-group">
			<button class="btn btn-primary" onclick="add()">Enviar</button>
		</div>
	</div>
	<div class="container" id="resultado" style="max-width: 500px"></div>
	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<script src="recursos/js/rol.js"></script>
</body>
</html>