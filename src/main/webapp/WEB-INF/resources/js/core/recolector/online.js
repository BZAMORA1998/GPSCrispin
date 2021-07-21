/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* global Clappr, RTMP */

$(document).ready(function () {
    
     var player = videojs('#player');
    
//    var player = new Clappr.Player({
//        source: "rtmp://159.65.233.9:1935/live",
//        parentId: "#reproductorpruebas",
//        plugins: {'playback': [RTMP]},
//        mimeType: 'rtmp/flv',
//        swfPath: '/ModuloRecolectorGPS/plugins/rtmp/assets/RTMP.swf',
//        rtmpConfig: {
//            swfPath: '/ModuloRecolectorGPS/plugins/rtmp/assets/RTMP.swf',
//            scaling: 'stretch',
//            playbackType: 'live',
//            bufferTime: 1,
//            startLevel: 0,
//            switchRules: {
//                "SufficientBandwidthRule": {
//                    "bandwidthSafetyMultiple": 1.15,
//                    "minDroppedFps": 2
//                },
//                "InsufficientBufferRule": {
//                    "minBufferLength": 2
//                },
//                "DroppedFramesRule": {
//                    "downSwitchByOne": 10,
//                    "downSwitchByTwo": 20,
//                    "downSwitchToZero": 24
//                },
//                "InsufficientBandwidthRule": {
//                    "bitrateMultiplier": 1.15
//                }
//            }
//        }
//    });
    
    $('#iniciar_streaming').click(function () {
        
        $.post('/ModuloRecolectorGPS/CtrLogin', {

            opcion: "online"

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

