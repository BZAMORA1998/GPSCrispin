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
public class DataBase {
    
    public static final String URL = "jdbc:postgresql://159.65.231.9:5432/rtmp_test";
    public static final String USER = "postgres";
    public static final String CLAVE = "password";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("Conexion exitosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
         return con;
         
    
    
//    public static final String URL = "jdbc:mysql://localhost:3306/modulogps";
//    public static final String USER = "root";
//    public static final String CLAVE = "";
//     
//    public Connection getConexion(){
//        Connection con = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.println("Error: " + e.getMessage());
//        }
//        return con;
    
    }
    }


