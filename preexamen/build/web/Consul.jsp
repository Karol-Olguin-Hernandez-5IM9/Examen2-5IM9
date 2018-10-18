<%-- 
    Document   : Consul
    Created on : 18/10/2018, 08:38:18 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Generar Nuevo Arquitecto</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Styles2.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div style=" position: static; left: 50%; text-align: center">
            <form action="Consulta" method="Post">
            <h1>Busqueda de Usuario</h1><br><br>
            
                <p>Nombre</p><input type="text" name="Nom"><br><br>
                <p>Apellido Paterno</p><input type="text" name="Ap"><br><br>
                <p>Apellido Materno</p><input type="text" name="Am"><br><br>
                <input type="submit" name="Buscar" value="Buscar"><br><br>
            </form>
            <input type="submit" name="Volver" value="Volver" onclick="window.location.href='index.jsp'"><br><br>
        </div>
    </body>
</html>