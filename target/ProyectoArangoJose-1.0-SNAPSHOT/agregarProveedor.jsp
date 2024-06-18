<%-- 
    Document   : agregarProducto
    Created on : 7 jun. 2024, 22:11:23
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="estilos.css" rel="stylesheet" type="text/css"/>
    <body>
        <div class="principal">
            <div class="encabezado"></div>
            <div class="menu"></div>
            <div class="contenido">
                <div class="contenedor">
                    <form action="agregarProveedor">
                        <div class="formato">
                            <label>Ingrese el Nombre:</label>
                            <input type="text" name="txtNombre" placeholder="Complete Campo">
                            <label>Ingrese el Telefono:</label>
                            <input type="text" name="txtTelefono" placeholder="Complete el Campo">
                            <label>Ingrese el Email</label>
                            <input type="text" name="txtEmail" placeholder="Complete Campo">
                            <label>Ingrese la Direccion</label>
                            <input type="text" name="txtDireccion" placeholder="Complete Campo">
                            <label> Ingrese Region </label>
                            <input type="text" name="txtRegion" placeholder="Complete Campo">
                            <label>Ingrese la Ciudad</label>
                            <input type="text" name="txtCiudad" placeholder="Complete Campo">
                            <label>Ingrese Pais</label>
                            <input  type="text" name="txtPais" placeholder="Complete Campo">d
                            <button> Agregar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
