/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "articulo")
public class Articulo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TenId;
    
    
            
    private String TenNombre,
            TenCodigoserial,
            TenColor;
    
    private int TenTamanno,
            TenCosto;
    
    
    @JoinColumn(name="marca_cod", referencedColumnName = "marca_cod")
    @ManyToOne
    private Marcatennis marcatennis;
    
    public Articulo() {
    }

    public Articulo(String TenCodigoSerial, String TenNombre, String TenColor, int TenTamanno, int TenCosto) {
        this.TenCodigoserial = TenCodigoSerial;
        this.TenNombre = TenNombre;
        this.TenColor = TenColor;
        this.TenTamanno = TenTamanno;
        this.TenCosto = TenCosto;
    }    

    public Articulo(String TenCodigoserial, String TenNombre, String TenColor, int TenTamanno, int TenCosto, Marcatennis marcatennis) {
        this.TenCodigoserial = TenCodigoserial;
        this.TenNombre = TenNombre;
        this.TenColor = TenColor;
        this.TenTamanno = TenTamanno;
        this.TenCosto = TenCosto;
        this.marcatennis = marcatennis;
    }
    
    
            
}
