package com.ejercicio2.ejercicio2.controllers;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


import com.ejercicio2.ejercicio2.models.Gato;
import com.ejercicio2.ejercicio2.models.Traduccion;
import com.ejercicio2.ejercicio2.models.ResponseData;

import com.ejercicio2.ejercicio2.services.GatosBDService;
import com.ejercicio2.ejercicio2.services.TraduccionService;
import com.ejercicio2.ejercicio2.utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Ejercicio2 {
   
   // ES UN SERVICIO
    @Autowired
    GatosBDService gatoBD;
  
    @Autowired
    TraduccionService traduccionService;


    @GetMapping("/")
    public String Bienvenida(){
        return "Bienvenido al servidor backend 2";
    }

    @GetMapping("/contar/{palabra}")
    public String EsVocalCons(@PathVariable String palabra){
       int[] vocalesCons = Utils.ContarVocales(palabra);
       return "Hay "+ vocalesCons[0] + " vocales y " + vocalesCons[1] + " consonantes";
    }


    @GetMapping("/{low}")
    public String toUpperCase(@PathVariable String low){
       return  Utils.tuUpperCase(low);
    }

    @GetMapping("/traduce/{texto}")
    public String getRyMortyRandCharacter(@PathVariable String texto){
        Traduccion c = traduccionService.getTraduccionFromAPI(texto);
        return  c.responseData.translatedText ;
    }

    @GetMapping("/listarGatitos")
    public String gatitos() {
        ArrayList<Gato> gatos = gatoBD.listaVeterinaria();
        String listado = "";
        for(Gato cat: gatos){
            listado += cat.toString();
            
            listado += "<br/>";
        }
        return listado;
    }

    @GetMapping("/insertaGatito")
    public String insertaGatito(@RequestParam Long id,@RequestParam String raza,@RequestParam int edad) {
       Gato gatito = new Gato();
        boolean insertable = true;
       ArrayList<Gato> gatos = gatoBD.listaVeterinaria();
       for(Gato cat: gatos){
        if(cat.getId().equals(id)){
            insertable = false;
        }
    }
      if(insertable){
        gatito.setId(id);
        gatito.setRaza(raza);
       gatito.setEdad(edad);
       gatoBD.guardarGatito(gatito);
       return "Gatito guardado con exito";
      }else{
          return "Gatito ya existente";
      }

      
        
    }
 
   
}
