/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones.dao;

import com.ProyectoWebYPatrones.domain.Empleado;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jarod
 */
public interface EmpleadoDao extends CrudRepository<Empleado, Long> {
    
}
