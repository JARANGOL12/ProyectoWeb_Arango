<%-- 
    Document   : AgregarUsuario
    Created on : 6 may. 2024, 19:41:14
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="principal">
            <div class="encabezado"></div>
            <div class="menu">
                <ul class="listas">
                    <li><a href="FormularioPricipal.jsp">Formulario Principal</a></li>
                   
                </ul>

            </div>
            <div class="contenido">
                <div class="contenedor">
                    <form action="agregarUsuario">
                        <div class="formato">
                            <h1>Login</h1>
                            <label>Nombre Usuario</label>
                            <input type="text" name="txtNombreUsuario">
                            <label>Contraseña</label>
                            <input type="password" name="txtClave">
                            <label>Nombre Completo</label>
                            <input type="text" name="txtNombreCompleto">
                            <label>Email</label>
                            <input type="text" name="txtEmail">
                            <label>Fecha Registro</label>
                            <input type="date" name="txtFecha">
                            <button>AGREGAR</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
