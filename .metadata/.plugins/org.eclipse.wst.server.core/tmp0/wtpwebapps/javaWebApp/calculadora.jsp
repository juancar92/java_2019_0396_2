<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	//recibir atributos del controlador
	String mensaje = (String)request.getAttribute("mensaje");
	if (mensaje != null) {
%>

	<p style="color:green;"><%=mensaje%></p>

<% } %>

<a href="index.jsp">Cerrar sesión</a>

	<form action="sumar" method="post">

		<p>Elige una operación</p>
		<label for="operacion">Operaciones:</label> 
		<select name="operacion" id="operacion">
			<option value="1" selected>Suma</option>
			<option value="2">Resta</option>
			<option value="3">Multiplicación</option>
			<option value="4">División</option>	
		</select> 
		
		<input type="number" name="op1" id="numero1" required step="1"
			placeholder="Introduce el numero 1"> 
			
			<input type="number" name="op2" id="numero2" required step="1"
			placeholder="Introduce el numero 2"> 
			
			<input type="submit" value="Calcular">
			
	</form>

</body>
</html>