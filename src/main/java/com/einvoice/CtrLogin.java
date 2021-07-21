/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.einvoice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.recolector.objetos.obj_control;
import com.recolector.objetos.obj_usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CRISPIN
 */
@WebServlet(name = "CtrLogin", urlPatterns = {"/CtrLogin"})
public class CtrLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("application/json");

        String op = request.getParameter("opcion");
        PrintWriter RespuestaOut = response.getWriter();
        HttpSession COSessiones = request.getSession(true);

        switch (op) {
            case "IngresoUsuario":
                
                obj_usuario use = new obj_usuario();
                        
                String usuario = request.getParameter("usuario");
                String password = request.getParameter("password");
                
                obj_control ObjCtr = new FncLogin().ValidaUsuario(usuario, password);
                
                if(ObjCtr.getCod().equals(7)){
                    use = new FncLogin().ObtenerDatosUsuario(usuario);
                }
      
                
                COSessiones.setAttribute("completo", use.getNombres()+" "+use.getApellidos());
                COSessiones.setAttribute("nombre", use.getNombres());
                COSessiones.setAttribute("apellidos", use.getApellidos());
                COSessiones.setAttribute("correos", use.getCorreo());
                
                String COLogin = new ObjectMapper().writerWithDefaultPrettyPrinter()
                        .writeValueAsString(ObjCtr);
                
                RespuestaOut.println(COLogin);
                break;
                
            case "CerrarSession":
              
      
                
                COSessiones.setAttribute("completo", null);
                COSessiones.setAttribute("nombre", null);
                COSessiones.setAttribute("apellidos", null);
                COSessiones.setAttribute("correos", null);
                
                obj_control ObjCtrSalir = new obj_control();
                
                String COSalir = new ObjectMapper().writerWithDefaultPrettyPrinter()
                        .writeValueAsString(ObjCtrSalir);
                
                RespuestaOut.println(COSalir);
                break;
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CtrLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CtrLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
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

}
