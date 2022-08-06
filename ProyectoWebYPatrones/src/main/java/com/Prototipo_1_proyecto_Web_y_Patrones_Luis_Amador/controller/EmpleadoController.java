package com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.controller;

import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.domain.Empleado;
import com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.sevice.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/Empleado/listadoEmpleado")
    public String listadoEmpleado(Model model, boolean activos) {
        var empleados = empleadoService.getEmpleados(activos);
        model.addAttribute("empleados", empleados);
        return "/Empleado/listadoEmpleado";
    }

    @GetMapping("/Empleado/nuevo")
    public String nuevoEmpleado(Empleado empleado) {
        return "/Empleado/modificarEmpleado";
    }

    @PostMapping("/Empleado/guardar")
    public String guardarEmpleado(Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/Empleado/listadoEmpleado";
    }

    @GetMapping("/Empleado/modificar/{EmpId}")
    public String modificarEmpleado(Empleado empleado, Model model) {
        empleado = empleadoService.getEmpleado(empleado);
        model.addAttribute("empleado", empleado);
        return "/Empleado/modificarEmpleado";
    }

    @GetMapping("/Empleado/eliminar/{EmpId}")
    public String elimninarEmpleado(Empleado empleado) {
        empleadoService.delete(empleado);
        return "redirect:/Empleado/listadoEmpleado";
    }
    
    @GetMapping("/Empleado/xxxxx")
    public String xxxxx() {
        return "/Empleado/xxxxx";
    }

}
