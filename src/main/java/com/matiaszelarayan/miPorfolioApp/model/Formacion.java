
package com.matiaszelarayan.miPorfolioApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Formacion {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreF;
    private String descripcionF;
    
    //constructores

    public Formacion(String nombreF, String descripcionF) {
        this.nombreF = nombreF;
        this.descripcionF = descripcionF;
    }

    public Formacion() {
    }
    
}
