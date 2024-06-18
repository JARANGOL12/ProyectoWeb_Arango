/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pe.edu.sise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.sise.dao.UsuarioDAO;

import pe.edu.sise.entity.Usuario;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "UsuarioServlet", urlPatterns =
{
    "/agregarUsuario","/listarUsuario"
})
public class UsuarioServlet extends HttpServlet {

    UsuarioDAO usuariodao= new UsuarioDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url =request.getServletPath();
        if(url.equals("/agregarUsuario")){
            agregarUsuario(request,response);
        }
        if(url.equals("/listarUsuario")){
            listarUsuario(request,response);
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

    private void agregarUsuario(HttpServletRequest request, HttpServletResponse response) {
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
       
        try
        {
            Usuario usuario = new  Usuario();
            String nombreUsuario = request.getParameter("txtNombreUsuario");
            String clave = request.getParameter("txtClave");
           String nombreCompleto=request.getParameter("txtNombreCompleto");
           String email =request.getParameter("txtEmail");
           Date fechaRegistro = sdf.parse(request.getParameter("txtFecha"));
           
           usuario.setNombreUsuario(nombreUsuario);
           usuario.setClave(clave);
           usuario.setNombreCompleto(nombreCompleto);
           usuario.setEmail(email);
           usuario.setFechaRegistro(fechaRegistro);
           
           usuariodao.guardar(usuario);
           response.sendRedirect("AgregarUsuario.jsp");
       
         
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void listarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Usuario>lstUsuario = usuariodao.listar();
       request.setAttribute("lstUsuario", lstUsuario);
       request.getRequestDispatcher("listarUsuario.jsp").forward(request, response);
       
    }

}
