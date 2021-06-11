<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="recursos/css/bootstrap.min.css" media="all" />
<style>
        *{
            background-color: rgb(231, 231, 255);
        }
        .a{
            color: rgb(255, 255, 255);
            background-color: skyblue;
            font-size: 20px;
            border: 1px solid blue;
            height: 300px;
        }
        
    </style>
</head>
<body>
	 <div class="row">
        <div class="col-3">
            <div class="container" style="max-width: 500px">
                <h1>Registrar Alumno</h1>
                <hr />
                <div class="form-group">
                    <input type="text" class="form-control" name="nomrol" id="n" placeholder="Nombre"/>
                    <br>
                    <input type="text" class="form-control" name="nomrol" id="t" placeholder="Telefono" />
                    <br>
                    <input type="text" class="form-control" name="nomrol" id="c" placeholder="Correo" />
                    <br>
                    <input type="hidden" name="id" id="id" value="0"/>
                </div>
                <div class="form-group">
                    <button class="btn btn-primary" onclick="add()">Enviar</button>
                    
                </div>
            </div>
            <div class="container" id="resultado" style="max-width: 500px"></div>
           </div>
           <div class="col-9" style="padding: 10px;">
            
                <h1>Listar Alumnos</h1>
                <hr />
                
                <div class="form-group">
                    
                    <button class="btn btn-primary" onclick="listar()">Listar</button>
                </div>
                <div class="a" id="resultado1" style="width: 900px"></div>
           </div>
            </div>
            
    </div>
   
   
	<script src="recursos/js/jquery.js"></script>
	<script src="recursos/js/bootstrap.min.js"></script>
	<script src="recursos/js/script.js"></script>
</body>
</html>