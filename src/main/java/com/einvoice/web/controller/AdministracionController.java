/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.einvoice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Desarrollo
 */
@Controller
public class AdministracionController {
    
    
    @RequestMapping(value = {"/administracion/contrasenia"})
    public String viewConfigPage(Model model) {
        return "administracion/cambio_contrasenia";
    }
    
    
    @RequestMapping(value = {"/administracion/usuario"})
    public String viewEmpresaPage(Model model) {
       
        return "administracion/usuario";
    }
    
    @RequestMapping(value = {"/administracion/firmaelectronica"})
    public String viewFirmaPage(Model model) {
       
        return "administracion/firma_electronica";
    }
    
}
