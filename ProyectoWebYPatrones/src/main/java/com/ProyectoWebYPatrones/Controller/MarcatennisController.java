/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones.Controller;

import com.ProyectoWebYPatrones.domain.Marcatennis;
import com.ProyectoWebYPatrones.service.MarcatennisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jarod
 */
@Controller
public class MarcatennisController {
    
    @Autowired
    private MarcatennisService marcatennisService;
    
    @GetMapping("/MarcaTennis/listado")
    public String listadoMarcatennis(Model model) {
        var marcatenniss = marcatennisService.getMarcas();
        model.addAttribute("marcatenniss", marcatenniss);
        return "/MarcaTennis/listado";
    }
    
    @GetMapping("/Marcatennis/nuevo")
    public String nuevoMarcatennis(Marcatennis marcatennis) {
        return "/Marcatennis/modificar";
    }
    
    @PostMapping("/Marcatennis/guardar")
    public String guardarMarcatennis(Marcatennis marcatennis) {
        marcatennisService.save(marcatennis);
        return "redirect:/Marcatennis/listado";
    }
    
    @GetMapping("/Marcatennis/modificar/{EmpId}")
    public String modificarMarcatennis(Marcatennis marcatennis, Model model) {
        marcatennis = marcatennisService.getMarca(marcatennis);
        model.addAttribute("marcatennis", marcatennis);
        return "/Marcatennis/modificar";
    }
    
    @GetMapping("/Marcatennis/eliminar/{EmpId}")
    public String elimninarMarcatennis(Marcatennis marcatennis) {
        marcatennisService.delete(marcatennis);
        return "redirect:/Marcatennis/listado";
    }
    
}
