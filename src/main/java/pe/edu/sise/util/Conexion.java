/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.sise.util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Usuario
 */
public class Conexion {
           public static SqlSessionFactory conectar(){
    SqlSessionFactory ssf = null;
        try
        {
           String ruta = "pe/edu/sise/mybatis/Mybatis-Config.xml";
           InputStream is =Resources.getResourceAsStream(ruta);
           ssf = new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return ssf;
    }

}
