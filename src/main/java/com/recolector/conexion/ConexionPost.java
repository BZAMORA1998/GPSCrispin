/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recolector.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CRISPIN
 */
public class ConexionPost {
//    public static final String URL = "jdbc:postgresql://159.65.233.9:5432/rtmp_test";
//    public static final String USER = "postgres";
//    public static final String CLAVE = "password";
//     
//    public Connection getConexion(){
//        Connection con = null;
//        try{
//            Class.forName("org.postgresql.Driver");
//            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.println("Error: " + e.getMessage());
//        }
//         return con;
//    }
            public static Connection getConnection() {
        Connection cn=null;
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado");
            System.out.println(e.getMessage());
        }
        
        try {            
            cn = DriverManager.getConnection(
           "jdbc:postgresql://159.65.233.9:5432/rtmp_test"
                    ,"postgres", "password");            
        }
        catch (SQLException e) {
            System.out.println("Error de conexion!!");
            System.out.println(e.getMessage());    
        }
        
        return cn;
    }
    
    public static void probarConexion() {
        Connection cn = ConexionPost.getConnection();
        if (cn!=null) {
            System.out.println("Conexion ok");
        }
        else {
            System.out.println("Conexion NO establecida");
        }
    }
    
}
