/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import BD.conexion;
import Model.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author j0rg3
 */
public class LoginDAO {
    int rspta=0;
    String sql="";
    ResultSet rs=null;
    conexion cn=new conexion();

    public int validarLogin(Usuario tm) throws Exception{
        sql="SELECT COUNT(id) AS cantidad FROM `tb_usuario` WHERE usuario='"+tm.getUsuario()+"' AND clave='"+tm.getClave()+"'";
        rs=cn.ejecutarConsulta(sql);
        while(rs.next()){
            rspta=rs.getInt("cantidad");
        }
     return rspta;      
    }

    
}
