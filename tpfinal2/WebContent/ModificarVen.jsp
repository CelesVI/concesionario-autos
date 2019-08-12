<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar Venta - Concesionario IT</title>
</head>
<body background="AudiR8.jpg" style="background-repeat:no-repeat" style="background-attachment:fixed" style="background-position: top center">
<form action="VentaModificarServlet" method="post">
	Ingrese id : <input type="text" name="id"> <BR>
	Ingrese monto : <input type="text" name="monto"> <BR>
	Ingrese id del vehiculo : <input type="text" name="idv"> <BR>
	Ingrese id del cliente: <input type="text" name="idc"> <BR>
<input type="submit" /> <br>
<a href="Main.jsp">Volver al menu principal</a> <br>
</body>
</html>