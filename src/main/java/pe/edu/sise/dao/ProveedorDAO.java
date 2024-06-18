/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.sise.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pe.edu.sise.entity.Proveedor;
import pe.edu.sise.util.Conexion;

/**
 *
 * @author Usuario
 */
public class ProveedorDAO {
    
    SqlSessionFactory ssf=Conexion.conectar();
    
    public void guardar(Proveedor proveedor ){
        SqlSession session = ssf.openSession();
        try
        {
            session.insert("guardarProveedor",proveedor);
            session.commit();
        } catch (Exception e)
        {
            e.printStackTrace();
            session.rollback();
        }
        session.close();
    }
    public List<Proveedor>listar(){
        List<Proveedor> lstProveedor = null;
        SqlSession session=ssf.openSession();
        try
        {
            lstProveedor=session.selectList("listarProveedor");
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        session.close();
        return lstProveedor;
    }
    public Proveedor buscar( int codigoProveedor){
        Proveedor proveedor = null;
        SqlSession session = ssf.openSession();
        try
        {
            proveedor=session.selectOne("buscarProveedor",codigoProveedor);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        session.close();
        return proveedor;
    }
}
