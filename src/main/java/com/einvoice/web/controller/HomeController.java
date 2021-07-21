/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Document   : index
Created on : 06/07/2021, 11:02:16
Author     : CRISPIN
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
public class HomeController {
    
    
     @RequestMapping(value = {"/home"})
    public String viewLoginPage(Model model) {
       
        return "home/home";
    }
    
    
     @RequestMapping(value = {"/pruebasurl"})
    public String viewLoginPruebasPage(Model model) {
       
        return "home/home";
    }
    
}
