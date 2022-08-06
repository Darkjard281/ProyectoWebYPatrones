package com.ProyectoWebYPatrones.service;

import com.ProyectoWebYPatrones.dao.EmpleadoDao;
import com.ProyectoWebYPatrones.domain.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service//Los servicios requieren de esta anotacion Me permite pasar de EmpleadoService a EmpleadoServiceImpl
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly = true)//Mejorar el rendimiento para los Get van como readOnly
    public List<Empleado> getEmpleados(boolean activos) {
        var lista = (List<Empleado>) empleadoDao.findAll();
        
        if(activos){
        lista.removeIf(e->!e.isEmpActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDao.findById(empleado.getEmpId()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Empleado empleado) {
        empleadoDao.delete(empleado);
    }

}
