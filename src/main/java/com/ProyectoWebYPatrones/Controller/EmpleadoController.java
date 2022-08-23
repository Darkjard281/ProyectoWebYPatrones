package com.ProyectoWebYPatrones.Controller;

import com.ProyectoWebYPatrones.domain.Empleado;
import com.ProyectoWebYPatrones.service.EmpleadoService;
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
    

}
