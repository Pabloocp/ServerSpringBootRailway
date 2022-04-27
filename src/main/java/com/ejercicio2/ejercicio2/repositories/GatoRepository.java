package com.ejercicio2.ejercicio2.repositories;

import com.ejercicio2.ejercicio2.models.Gato;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GatoRepository extends CrudRepository<Gato,Long>{


    
}
