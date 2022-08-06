/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.sevice;

import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.domain.Empleado;
import java.util.List;

/**
 *
 * @author jarod
 */
public interface EmpleadoService {

    public List<Empleado> getEmpleados(boolean activos);

    public Empleado getEmpleado(Empleado empleado);

    public void save(Empleado empleado);

    public void delete(Empleado empleado);

}
