/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pe.edu.sise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.sise.dao.ProveedorDAO;
import pe.edu.sise.entity.Proveedor;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ProveedorServlet", urlPatterns =
{
    "/agregarProveedor","/listarProveedor"
})
public class ProveedorServlet extends HttpServlet {

ProveedorDAO proveedorDAO = new ProveedorDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getServletPath();
        if(url.equals("/agregarProveedor")){
            agregarProveedor(request,response);
        }
        if(url.equals("/listarProveedor")){
            listarProveedor(request,response);
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

    private void agregarProveedor(HttpServletRequest request, HttpServletResponse response) {
      
        try{
        Proveedor proveedor = new Proveedor();
        String nombre =request.getParameter("txtNombre");
        String telefono=request.getParameter("txtTelefono");
        String email=request.getParameter("txtEmail");
        String direccion=request.getParameter("txtDireccion");
        String region=request.getParameter("txtRegion");
        String ciudad=request.getParameter("txtCiudad");
        String pais =request.getParameter("txtPais");
        
        proveedor.setNombre(nombre);
        proveedor.setTelefono(telefono);
        proveedor.setEmail(email);
        proveedor.setDireccion(direccion);
        proveedor.setRegion(region);
        proveedor.setCiudad(ciudad);
        proveedor.setPais(pais);
        
        proveedorDAO.guardar(proveedor);
        
          response.sendRedirect("agregarProveedor.jsp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void listarProveedor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     List<Proveedor>lstProveedor=proveedorDAO.listar();
      request.setAttribute("lstProveedor", lstProveedor);
       request.getRequestDispatcher("listarProveedor.jsp").forward(request, response);
     
    }

}
