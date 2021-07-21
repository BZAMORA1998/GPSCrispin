/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.einvoice.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author CRISPIN
 */
public class ReporteriaController {
    @RequestMapping(value = {"/reporteria/reporte_general"})
    public String viewConfigPage(Model model) {
        return "reporteria/reporte_general";
    }
    
}
