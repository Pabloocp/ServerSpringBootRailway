package com.ejercicio2.ejercicio2.controllers;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

import com.ejercicio2.ejercicio2.models.Gato;
import com.ejercicio2.ejercicio2.repositories.GatoRepository;
import com.ejercicio2.ejercicio2.services.GatosBDService;
import com.ejercicio2.ejercicio2.utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Ejercicio2 {
   
   // ES UN SERVICIO
    @Autowired
    GatosBDService gatoBD;


    @GetMapping("/")
    public String Bienvenida(){
        return "Bienvenido al servidor backend 2";
    }

    @GetMapping("/contar/{palabra}")
    public String EsVocalCons(@PathVariable String palabra){
       int[] vocalesCons = Utils.ContarVocales(palabra);
       return "Hay "+ vocalesCons[0] + " vocales y " + vocalesCons[1] + " consonantes";
    }


    @GetMapping("/listarGatitos")
    public String gatitos() {
        ArrayList<Gato> gatos = gatoBD.listaVeterinaria();
        String listado = "";
        for(Gato cat: gatos){
            listado += cat.getId();
            
            listado += "<br/>";
        }
        return listado;
    }

    @PostMapping("/insertaGatito")
    public String insertaGatito(@RequestParam Long id,@RequestParam String raza,@RequestParam int edad) {
       return "terminar";
    }
 
   
}
