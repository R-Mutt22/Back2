
package com.matiaszelarayan.miPorfolioApp.service;

import com.matiaszelarayan.miPorfolioApp.model.Formacion;
import java.util.List;
import java.util.Optional;


public interface IFormacionService {
    
    public List<Formacion> list();
    public Optional<Formacion> getOne(int id);
    public void save(Formacion formacion);
    public void delete(int id);
    public boolean existsById(int id);
}
