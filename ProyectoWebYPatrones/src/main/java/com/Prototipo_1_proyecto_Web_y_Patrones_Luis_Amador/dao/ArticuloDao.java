/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.dao;
import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.domain.Articulo;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jarod
 */
public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
}