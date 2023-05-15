/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matiaszelarayan.miPorfolioApp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoFormacion {
    private String nombreF;
    private String descripcionF;
    
    //Constructores

    public DtoFormacion() {
    }

    public DtoFormacion(String nombreF, String descripcionF) {
        this.nombreF = nombreF;
        this.descripcionF = descripcionF;
    }
    
}
