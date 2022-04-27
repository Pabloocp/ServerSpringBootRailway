package com.ejercicio2.ejercicio2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gatitos")
public class Gato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    String raza;

    @Column(nullable = false)
    int edad;

    public Long getId() {
        return id;
    }


    
}
