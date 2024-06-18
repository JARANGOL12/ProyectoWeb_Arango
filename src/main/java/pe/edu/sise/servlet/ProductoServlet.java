/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pe.edu.sise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.sise.dao.ProductoDAO;
import pe.edu.sise.dao.ProveedorDAO;
import pe.edu.sise.entity.Producto;
import pe.edu.sise.entity.Proveedor;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ProductoServlet", urlPatterns =
{
    "/agregarProdcuto","/listarProducto"
})
public class ProductoServlet extends HttpServlet {

   ProveedorDAO proveedordao = new ProveedorDAO();
   ProductoDAO productodao = new ProductoDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url =request.getServletPath();
        if(url.equals( "/agregarProdcuto")){
            agregarProducto(request,response);
        }
        if(url.equals("/listarProducto")){
            listarProducto(request,response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void agregarProducto(HttpServletRequest request, HttpServletResponse response) {
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            Producto producto = new Producto();
            int codigoProveedor =Integer.parseInt(request.getParameter("cboProveedor"));
            Proveedor proveedor=proveedordao.buscar(codigoProveedor);
            String nombre=request.getParameter("txtNombre");
            String modelo=request.getParameter("txtModelo");
            double precio=Double.parseDouble(request.getParameter("txtPrecio"));
            int stock =Integer.parseInt(request.getParameter("txtStock"));
            String Descripcion =request.getParameter("txtDescripcion");
            Date FechaLanzamiento=sdf.parse(request.getParameter("txtFecha"));
            
            producto.setProveedor(proveedor);
            producto.setNombre(nombre);
            producto.setModelo(modelo);
            producto.setPrecio(precio);
            producto.setStock(stock);
            producto.setDescripcion(Descripcion);
            producto.setFechaLanzamiento(FechaLanzamiento);
            
            productodao.guardar(producto);
            response.sendRedirect("agregarProducto.jsp");
            
            
        } catch (Exception e)
        {
        }
    }

    private void listarProducto(HttpServletRequest request, HttpServletResponse response) {
      
    }

}
