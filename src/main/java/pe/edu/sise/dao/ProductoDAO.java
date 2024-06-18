/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.sise.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pe.edu.sise.entity.Producto;
import pe.edu.sise.util.Conexion;

/**
 *
 * @author Usuario
 */
public class ProductoDAO {
    
    SqlSessionFactory ssf=Conexion.conectar();
    
    public void guardar(Producto producto){
        SqlSession session = ssf.openSession();
        try
        {
            session.insert("guardarProducto",producto);
            session.commit();
            
        } catch (Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        session.close();
    }
    public List<Producto>listar(){
        List<Producto> lstProducto = null;
        SqlSession session = ssf.openSession();
        try
        {
            lstProducto=session.selectList("listarProducto");
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        session.close();
        return lstProducto;
    }
}
