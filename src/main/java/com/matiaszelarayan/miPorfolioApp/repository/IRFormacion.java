
package com.matiaszelarayan.miPorfolioApp.repository;

import com.matiaszelarayan.miPorfolioApp.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRFormacion extends JpaRepository<Formacion, Integer>{

}
