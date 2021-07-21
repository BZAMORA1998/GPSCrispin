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
public class RecolectorController {
    
    
    @RequestMapping(value = {"/recolector/Configuracion_streaming"})
    public String viewConfigPage(Model model) {
        return "recolector/Configuracion_streaming";
    }
    
    @RequestMapping(value = {"/recolector/offline"})
    public String viewRecolectorOffline(Model model) {
        return "recolector/offline";
    }
    
    @RequestMapping(value = {"/recolector/online"})
    public String viewRecolectorOnline(Model model) {
        return "recolector/online";
    }
    @RequestMapping(value = {"/recolector/verificacion"})
    public String viewRecolectorVerificacion(Model model) {
        return "recolector/verificacion";
    }
    
}
