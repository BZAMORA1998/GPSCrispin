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
public class MantenimientoController {
    
    
    
    @RequestMapping(value = {"/mantenimiento/inventario"})
    public String viewIntentarioPage(Model model) {
       
        return "mantenimiento/productos_servicios";
    }
    
}
