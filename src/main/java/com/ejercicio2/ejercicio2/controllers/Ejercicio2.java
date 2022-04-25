package com.ejercicio2.ejercicio2.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio2.ejercicio2.utils.Utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Ejercicio2 {
    


    @GetMapping("/")
    public String Bienvenida(){
        return "Bienvenido al servidor backend 2";
    }

    @GetMapping("/contar/{palabra}")
    public String EsVocalCons(@PathVariable String palabra){
       int[] vocalesCons = Utils.ContarVocales(palabra);
       return "Hay "+ vocalesCons[0] + " vocales y " + vocalesCons[1] + " consonantes";
    }

}
