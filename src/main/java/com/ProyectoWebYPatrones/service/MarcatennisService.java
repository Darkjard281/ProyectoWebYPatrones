/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones.service;

import com.ProyectoWebYPatrones.domain.Marcatennis;
import java.util.List;

/**
 *
 * @author jarod
 */
public interface MarcatennisService {
   public List<Marcatennis> getMarcas();

    public Marcatennis getMarca(Marcatennis marcatennis);

    public void save(Marcatennis marcatennis);

    public void delete(Marcatennis marcatennis);

}