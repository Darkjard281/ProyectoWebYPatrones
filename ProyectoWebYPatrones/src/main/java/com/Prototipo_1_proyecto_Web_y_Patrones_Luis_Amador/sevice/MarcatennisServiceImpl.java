/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.sevice;

import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.dao.MarcatennisDao;
import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.domain.Marcatennis;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MarcatennisServiceImpl implements MarcatennisService{

    @Autowired
    private MarcatennisDao marcatennisDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Marcatennis> getMarcas() {
        return (List<Marcatennis>)marcatennisDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Marcatennis getMarca(Marcatennis marcatennis) {
        return marcatennisDao.findById(marcatennis.getMarcaCod()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Marcatennis marcatennis) {
       marcatennisDao.save(marcatennis);
    }

    @Override
    @Transactional
    public void delete(Marcatennis marcatennis) {
        marcatennisDao.delete(marcatennis);
    }
    
}
