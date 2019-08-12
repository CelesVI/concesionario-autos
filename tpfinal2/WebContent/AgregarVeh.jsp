<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar vehiculo - Concesionario IT</title>
</head>
<body background="AudiR8.jpg" style="background-repeat:no-repeat" style="background-attachment:fixed" style="background-position: top center">
<p1>Ingrese los datos en los campos correspondentes</p1>
<form action="VehiculoServlet" method="post">
	Ingrese id : <input type="text" name="id"> <BR>
	Ingrese marca : <input type="text" name="marca"> <BR>
	Ingrese modelo : <input type="text" name="modelo"> <BR>
	Ingrese año : <input type="text" name="año"> <BR>
	Ingrese motor : <input type="text" name="motor"> <BR>
	Ingrese kilometraje : <input type="text" name="kilometraje"> <BR>
	Ingrese color : <input type="text" name="color"> <BR>
	Ingrese precio : <input type="text" name="precio"> <BR>
	<input type="submit" />
</form>
<a href="Main.jsp">Volver al menu principal</a> <br>
</body>
</html>