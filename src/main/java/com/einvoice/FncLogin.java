/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.einvoice;

import com.recolector.conexion.DataBase;
import com.recolector.objetos.obj_control;
import com.recolector.objetos.obj_usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author CRISPIN
 */
public class FncLogin extends DataBase {

    obj_control ObjCtr = new obj_control();
    private Connection conn = null;
    private ResultSet rs = null;
    private Statement stmt = null;
    //DataBase dt = new DataBase();

    public obj_control ValidaUsuario(String usuario, String password){

        try{
            try{
                String res="";
                conn = getConexion();    
                stmt = conn.createStatement();
                  rs = stmt.executeQuery("SELECT login_user('"+usuario+"','"+password+"'); ");
                  while (rs.next())
                  {
                    res=rs.getString(1);
                  }

                ObjCtr.setCod(7);
                ObjCtr.setMensaje("prueba");
                ObjCtr.setDato1("prueba");
                ObjCtr.setDato2("prueba");

                stmt.close();
                conn.close();

                return ObjCtr;
            }catch (SQLException ex) {
    	        System.err.println( ex.getMessage() );
    	   }		        
    	}catch(Exception e) {
    		  System.out.print("Exception:"+e);
    	}
          return ObjCtr;   
    }

    public obj_usuario ObtenerDatosUsuario(String usuario) throws SQLException {

        obj_usuario ObjUser = new obj_usuario();

        String query = "SELECT nombre, apellido, correo FROM dbousuario where usuario = '" + usuario + "'";

        try {

            conn = getConexion();

            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {

                ObjUser.setNombres(rs.getString("nombre"));
                ObjUser.setApellidos(rs.getString("apellido"));
                ObjUser.setCorreo(rs.getString("correo"));
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            conn.close();
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return ObjUser;

    }

}
