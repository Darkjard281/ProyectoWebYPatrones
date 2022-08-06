/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.controller;

import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.domain.Empleado;
import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.sevice.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author jarod
 */
@Controller
public class IndexController {

    @Autowired
    private EmpleadoService empleadoService;
    

    @GetMapping("/")/*AccionDefault*/
    public String inicio() {//Con el podemos mandar a los documentos html(index) un objeto model
        return "index";/*Buscar en templates una vista llamada index*/
    }

    @GetMapping("/Login")
    public String inicioSesion() {
        return "iniciarSesion";
    }
    
    

}
