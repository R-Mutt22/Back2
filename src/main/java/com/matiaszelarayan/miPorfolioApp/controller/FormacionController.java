/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.matiaszelarayan.miPorfolioApp.controller;

import com.matiaszelarayan.miPorfolioApp.dto.DtoFormacion;
import com.matiaszelarayan.miPorfolioApp.model.Formacion;
import com.matiaszelarayan.miPorfolioApp.model.Mensaje;
import com.matiaszelarayan.miPorfolioApp.service.SFormacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/formacion")
@CrossOrigin(origins = {"https://portfolio-matiaszelarayan.web.app/","http://localhost:4200"})
public class FormacionController {
   @Autowired
   SFormacion sFormacion;
   
   @GetMapping("/lista")
   public ResponseEntity<List<Formacion>> list(){
       List<Formacion> list = sFormacion.list();
       return new ResponseEntity(list, HttpStatus.OK); 
   }
   
    @GetMapping("/detail/{id}")
    public ResponseEntity<Formacion> getById(@PathVariable("id") int id){
        if(!sFormacion.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Formacion formacion = sFormacion.getOne(id).get();
        return new ResponseEntity(formacion, HttpStatus.OK);
    }
   
   @PostMapping("/create")
   public ResponseEntity<?> create (@RequestBody DtoFormacion dtoforma){
        
       Formacion formacion = new Formacion(dtoforma.getNombreF(), dtoforma.getDescripcionF());
       sFormacion.save(formacion);
       
       return new ResponseEntity(new Mensaje("Formacion agregada"), HttpStatus.OK);
   
   }
   
   @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoFormacion dtoforma){
        if(!sFormacion.existsById(id))
            return new ResponseEntity(new Mensaje("el ID no existe"), HttpStatus.BAD_REQUEST);
        
        Formacion formacion = sFormacion.getOne(id).get();
        formacion.setNombreF(dtoforma.getNombreF());
        formacion.setDescripcionF(dtoforma.getDescripcionF());
        
        sFormacion.save(formacion);
        return new ResponseEntity(new Mensaje("Formacion actualizada"), HttpStatus.OK);
    }
    
        @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id") int id){
        
        if(!sFormacion.existsById(id))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        
        sFormacion.delete(id);
        
        return new ResponseEntity(new Mensaje ("Formacion eliminada"), HttpStatus.OK);
    }
    
   

}
