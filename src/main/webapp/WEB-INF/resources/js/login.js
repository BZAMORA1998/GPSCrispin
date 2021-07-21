/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    
    $('.bxslider').bxSlider({
        auto: true,
        autoControls: true,
        stopAutoOnClick: true,
        pager: true,
        slideWidth: 600,
        mode:'fade',
        touchEnabled:true
    });
    
    $("#icono-user").addLiviconEvo({
        name: "user.svg",
        style: "lines",
        tryToSharpen: true
    });
    
    $("#icono-lock").addLiviconEvo({
        name: "lock.svg",
        style: "lines",
        tryToSharpen: true
    });
    
    
    $(".input-login-form").focus( function(){
        var tipo = $(this).attr('type');
        
        if(tipo === 'text'){
            $('.input-radius-usuario').addClass('active');
            $('.input-radius-contrasena').removeClass('active');
        } else{
            $('.input-radius-usuario').removeClass('active');
            $('.input-radius-contrasena').addClass('active');
        }
        
    });
    
    $(".input-login-form").focusout( function(){
       var tipo = $(this).attr('type');
        
        if(tipo === 'text'){
            $('.input-radius-usuario').removeClass('active');
        } else{
            $('.input-radius-contrasena').removeClass('active');
        } 
    });
  
  
});