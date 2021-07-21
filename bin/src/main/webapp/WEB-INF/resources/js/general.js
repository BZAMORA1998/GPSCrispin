/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Document   : index
   Created on : 06/07/2021, 11:02:16
   Author     : CRISPIN
 */

$(document).ready(function () {
    
    
    $('#salir_perfil').click( function () {
        
        
        $.post('/ModuloRecolectorGPS/CtrLogin', {

            opcion: "CerrarSession"

        }, function (data) {
            
            window.location.href = '/ModuloRecolectorGPS/';

        }).fail(function () {

        });
        
        
    });
    
    
});
