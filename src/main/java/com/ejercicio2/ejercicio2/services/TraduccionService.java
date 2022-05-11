 package com.ejercicio2.ejercicio2.services;


 import com.ejercicio2.ejercicio2.models.Traduccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


 @Service
 public class TraduccionService {
     @Autowired
      RestTemplate restTemplate ;


     public  Traduccion getTraduccionFromAPI(String texto){
        String url = "https://api.mymemory.translated.net/get?q="+ texto + "&langpair=es|en";
         Traduccion tradcc = restTemplate.getForObject(url, Traduccion.class);
         return tradcc;
     }



 }
