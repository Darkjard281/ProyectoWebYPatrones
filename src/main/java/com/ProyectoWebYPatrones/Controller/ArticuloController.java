/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones.Controller;

import com.ProyectoWebYPatrones.domain.Articulo;
import com.ProyectoWebYPatrones.service.ArticuloService;
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
public class ArticuloController {
    
    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/Articulo/listado")
    public String listadoArticulo(Model model) {
        var articulos = articuloService.getArticulos();
        model.addAttribute("articulos", articulos);
        return "/Articulo/listado";
    }

    @GetMapping("/Articulo/nuevo")
    public String nuevoArticulo(Articulo articulo) {
        return "/Articulo/modificar";
    }

    @PostMapping("/Articulo/guardar")
    public String guardarArticulo(Articulo articulo) {
        articuloService.save(articulo);
        return "redirect:/Articulo/listado";
    }

    @GetMapping("/Articulo/modificar/{TenId}")
    public String modificarArticulo(Articulo articulo, Model model) {
        articulo = articuloService.getArticulo(articulo);
        model.addAttribute("articulo", articulo);
        return "/Articulo/modificar";
    }

    @GetMapping("/Articulo/eliminar/{TenId}")
    public String elimninarArticulo(Articulo articulo) {
        articuloService.delete(articulo);
        return "redirect:/Articulo/listado";
    }
    
}
