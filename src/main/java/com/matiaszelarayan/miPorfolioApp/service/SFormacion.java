
package com.matiaszelarayan.miPorfolioApp.service;

import com.matiaszelarayan.miPorfolioApp.model.Formacion;
import com.matiaszelarayan.miPorfolioApp.repository.IRFormacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SFormacion implements IFormacionService{
    @Autowired
    IRFormacion rFormacion;
    
    @Override
    public List<Formacion> list(){
        return rFormacion.findAll();
    }
    
 
    
    @Override
    public void save(Formacion forma){
        rFormacion.save(forma);
    }
    
    @Override
    public void delete(int id){
        rFormacion.deleteById(id);
    }
    
    @Override
    public boolean existsById(int id){
        return rFormacion.existsById(id);
    }
    
   

    @Override
    public Optional<Formacion> getOne(int id) {
        return rFormacion.findById(id);
    }
  
    

}
