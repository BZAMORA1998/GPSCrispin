/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recolector.objetos;

/**
 *
 * @author CRISPIN
 */
public class obj_control {

    //se creo variables usuario y password 12/07/2021
    private String usuario;
    private String password;
    private Integer cod;
    
    private String mensaje;
    private String dato1;
    private String dato2;
    
    public obj_control() {
    }

    public obj_control(String usuario, String password, Integer cod, String mensaje, String dato1, String dato2) {
        this.usuario = usuario;
        this.password = password;
        this.cod = cod;
        this.mensaje = mensaje;
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

   
    
    

}