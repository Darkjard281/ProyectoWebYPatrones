/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author jarod
 */
@Controller
public class IndexController {

    @GetMapping("/")/*AccionDefault*/
    public String inicio() {//Con el podemos mandar a los documentos html(index) un objeto model
        return "index";/*Buscar en templates una vista llamada index*/
    }

    @GetMapping("/Login")
    public String inicioSesion() {
        return "iniciarSesion";
    }

    @GetMapping("/busqueda")
    public String busqueda() {
        return "busqueda";
    }

    @GetMapping("/sobreN")
    public String sobreN() {
        return "sobreN";
    }
    
    @GetMapping("/favoritos")
    public String favoritos() {
        return "favoritos";
    }
    
    @GetMapping("/pago")
    public String pago() {
        return "pago";
    }
    
    @GetMapping("/carrito")
    public String carrito() {
        return "carrito";
    }
    
    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }
    
    @GetMapping("/marcas")
    public String marcas() {
        return "marcas";
    }
    @GetMapping("/reviews")
    public String reviews() {
        return "reviews";
    }
    @GetMapping("/tallas")
    public String tallas() {
        return "tallas";
    }
}
