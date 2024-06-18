<%-- 
    Document   : listarUsuario
    Created on : 6 may. 2024, 20:08:35
    Author     : Usuario
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <div class="menu"></div>
            <div class="contenido">
                <div class="contenedor">
                    <div class="titulo"> Lista de Usuarios</div>
                    <table class="tablaDatos">
                        <tr>
                            <th>Codigo</th>
                            <th>NombreUsuario</th>
                            <th>Clave</th>
                            <th>Nombre Completo</th>
                            <th>Email</th>
                            <th>Fecha Registro</th>
                        </tr>
                        
                        <c:forEach items="${lstUsuario}" var="usuario">
                            <tr>
                                <td>${usuario.codigo}</td>
                                <td>${usuario.nombreUsuario}</td>
                                <td>${usuario.clave}</td>
                                <td>${usuario.nombreCompleto}</td>
                                <td>${usuario.email}</td>
                                <td><fmt:formatDate pattern="dd-MM-yyyy" value="${usuario.fechaRegistro}"></fmt:formatDate></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
