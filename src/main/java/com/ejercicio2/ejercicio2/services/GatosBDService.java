package com.ejercicio2.ejercicio2.services;

import java.util.ArrayList;

import com.ejercicio2.ejercicio2.models.Gato;
import com.ejercicio2.ejercicio2.repositories.GatoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatosBDService {
    @Autowired
    GatoRepository gatoRepository;

    public ArrayList<Gato> listaVeterinaria(){
        ArrayList<Gato> gatos =  (ArrayList<Gato>) gatoRepository.findAll();
        return gatos ;
    }

    public Gato guardarGatito(Gato gatito) {
        return gatoRepository.save(gatito);
    }
 
}
