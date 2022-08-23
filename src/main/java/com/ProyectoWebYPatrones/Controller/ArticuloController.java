/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones.Controller;

import com.ProyectoWebYPatrones.domain.Articulo;

import com.ProyectoWebYPatrones.service.ArticuloService;
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
public class ArticuloController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @Autowired
    private MarcatennisService marcatennisService;

    @GetMapping("/Articulo/listado")
    public String listadoArticulo(Model model) {
        var articulos = articuloService.getArticulos();
        model.addAttribute("articulos", articulos);
        return "/Articulo/listado";
    }

    @GetMapping("/Articulo/nuevo")
    public String nuevoArticulo(Articulo articulo, Model model) {
        var marcatennis = marcatennisService.getMarcas();
        model.addAttribute("marcas", marcatennis);
        return "/Articulo/modificar";
    }

    @PostMapping("/Articulo/guardar")
    public String guardarArticulo(Articulo articulo) {
        articuloService.save(articulo);
        return "redirect:/Articulo/listado";
    }

    @GetMapping("/Articulo/modificar/{TenId}")
    public String modificarArticulo(Articulo articulo, Model model) {
        var marcatennis = marcatennisService.getMarcas();
        model.addAttribute("marcas", marcatennis);
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
