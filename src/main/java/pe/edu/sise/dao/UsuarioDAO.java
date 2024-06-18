/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.sise.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pe.edu.sise.entity.Usuario;
import pe.edu.sise.util.Conexion;

/**
 *
 * @author Usuario
 */
public class UsuarioDAO {
     SqlSessionFactory ssf = Conexion.conectar();
     
     public void guardar(Usuario usuario){
         SqlSession session = ssf.openSession();
         try
         {
             session.insert("guardarUsuario",usuario);
             session.commit();
         } catch (Exception e)
         {
             e.printStackTrace();
             session.rollback();
         }
         session.close();
     }
     public List<Usuario>listar(){
         List<Usuario> lstUsuario = null;
         SqlSession session= ssf.openSession();
         try
         {
             lstUsuario = session.selectList("listarUsuario");
         } catch (Exception e)
         {
             e.printStackTrace();
         }
         session.close();
         return lstUsuario;
         
     }
}
