<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="tpfinal2.ProgramaDB" %>
<%@ page import="tpfinal2.Vehiculo" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar Vehiculo Aceptada - Concesionario IT</title>
</head>
<body background="AudiR8.jpg" style="background-repeat:no-repeat" style="background-attachment:fixed" style="background-position: top center">
<h1>Detalles del vehiculo</h1>
   
    ID del vehiculo: ${requestScope['vehiculo'].id}. <br>
    Marca del vehiculo: ${requestScope['vehiculo'].marca}. <br>
    Modelo del vehiculo: ${requestScope['vehiculo'].modelo}. <br>
    Año del vehiculo: ${requestScope['vehiculo'].año}. <br>
    Motor del vehiculo: ${requestScope['vehiculo'].motor}. <br>
    Kilometraje del vehiculo: ${requestScope['vehiculo'].kilometraje}. <br>
    Color del vehiculo: ${requestScope['vehiculo'].color}. <br>
    Precio del vehiculo: ${requestScope['vehiculo'].precio}. <br>
<a href="Main.jsp">Volver al menu principal</a> <br>
</body>
</html>