package com.ejercicio2.ejercicio2.utils;

public class Utils {
    public static int[] ContarVocales(String name){
        String palabra = name.toLowerCase();
        int [] resultado = new int[1];
        int vocales = 0;
        int consonantes =0;
        for(int i = 0;i < name.length();i++){
            char letraActual = palabra.charAt(i);
            if(letraActual == 'a' || letraActual == 'e' || letraActual == 'i' ||  letraActual == 'o' || letraActual == 'u' ){
                vocales++;
            }else{
                consonantes++;
            }

        }
        resultado[0] = vocales;
        resultado[1] = consonantes;

        return resultado;

     }
}
