<%-- 
    Document   : Registro
    Created on : 14-oct-2018, 16:34:26
    Author     : eog
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
    </head>
    <body>
        <h1>Registro de Usuarios</h1>
        <form method="POST" action='RegistroServlet'>
            <BR>
            <BR>
            <center>
                Introduzca su nombre y pulse el bot&oacute;n de enviar<BR>
                <BR>Nombre:<input type=text name="Nom">
                <BR>
                <BR>A. Paterno:<input type=text name="AP">
                <BR>
                <BR>A. Materno:<input type=text name="AM">
                <BR>
                <BR>Usuario:<input type=text name="Usu">
                <BR>
                <BR>Password: <input type=text name="Pas">
                    Repita Password: <input type=text name="Pas1">
                <BR>
                <BR>Telefono:<input type=number name="Tel">
                <BR>
                <BR>Escuela:<input type=text name="Esc">
                <BR>
                <BR>Materia Favorita:<input type=text name="MF">
                <BR>
                <BR>Deporte Favorito:<input type=text name="DF">
                <BR>
                <BR>Rol<input type=number name="Rol">
                <BR>
                <BR><input type=submit value="Aceptar">
                <input type=reset value="Borrar">
            </center>
        </form>
    </body>
</html>
