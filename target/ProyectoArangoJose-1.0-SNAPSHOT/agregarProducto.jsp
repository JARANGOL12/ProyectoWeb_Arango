<%-- 
    Document   : agregarProducto
    Created on : 17 jun. 2024, 20:41:52
    Author     : Usuario
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <link href="estilos.css" rel="stylesheet" type="text/css"/>
    <body>
        <div class=" principal">
            <div class="encabezado"> </div>
            <div class="menu"></div>
            <div class="contenido">
                <div class="contenedor">
                    <form action="agregarProduccto">
                        <div class="formato">
                            <label>Proveedor</label>
                           
                                <select name="cboProveedor">
                                <jsp:useBean class="pe.edu.sise.dao.ProveedorDAO" id="proveedordao"></jsp:useBean>
                                <c:forEach items="${proveedordao.listar()}" var="proveedor">
                                    <option value="${proveedor.codigo}"> ${proveedor}</option>
                                </c:forEach>
                                
                                </select>   
                        
                            <label>Ingrese el Nombre</label>
                            <input type="text" name="txtNombre" placeholder="Comlete Campo">
                            <label>Ingrese el Modelo</label>
                            <input type="text" name="txtModelo" placeholder="Complete Campo">
                            <label>Ingrese el Precio</label>
                            <input type="text" name="txtPrecio" placeholder="Complete Campo">
                            <label>Ingrese el Stock</label>
                            <input type="text" name="txtStock" placeholder="Complete el Campo">
                            <label>Ingrese la Descripcion</label>
                            <input type="text" name="txtDescripcion" placeholder="Complete el Campo">
                            <label>Ingrese el Fecha de lanzamiento</label>
                            <input type="date" name="txtFecha">
                            <button>Agregar</button>                            

                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
