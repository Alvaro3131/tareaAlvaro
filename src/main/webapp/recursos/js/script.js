$(document).ready(function(){
	
})

function add(){
alert("registrar");
var datos = {"no":$("#n").val(), "te":$("#t").val(), "co":$("#c").val(), "opc":1};
$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: datos,
		url: 'rc',
		type: 'POST',
		success: function(response){
			if(response==1){
				$('#resultado').html("<div class='alert alert-success' role='alert'>Registro guardado correctamente...!</div>");
			}else{
				$('#resultado').html("<div class='alert alert-danger' role='alert'>Erro al guardar el registro...!</div>");
			}
			
		},
		error: function(jqXHR, estado, error){
		console.log(estado)
		console.log(error)
		},
		complete: function (jqXHR, estado){
			console.log(estado)
		}		
	});
}
function listar(){
alert("registrar");
var m = {"opc":5};
$.ajax({
		beforeSend: function(){
			$('#resultado').html('Esperando...!');
		},
		data: m,
		url: 'rc',
		type: 'POST',
		success: function(response){
			$('#resultado1').html(response);
		},
		error: function(jqXHR, estado, error){
		console.log(estado)
		console.log(error)
		},
		complete: function (jqXHR, estado){
			console.log(estado)
		}		
	});
}