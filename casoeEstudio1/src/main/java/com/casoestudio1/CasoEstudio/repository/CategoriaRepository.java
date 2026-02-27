/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.casoestudio1.CasoEstudio.repository;
import com.casoestudio1.CasoEstudio.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author abbyc
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
     public List<Categoria> findBy();
    
}
