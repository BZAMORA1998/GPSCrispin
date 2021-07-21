/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    
    
    $('#btn_ingreso').click( function () {
        
        
        $.post('/ModuloRecolectorGPS/CtrLogin', {

            opcion: "IngresoUsuario",
            usuario: $("#user").val(),
            password: $("#pass").val()

        }, function (data) {

            if(data.cod === 7){
                window.location.href = '/ModuloRecolectorGPS/home';
            }else{
                alert(data.mensaje);
            }

        }).fail(function () {

        });
        
        
    });
    
    
});

