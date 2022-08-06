/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.domain;

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
    
    @Column(name="Ten_CodigoSerial")
    private String TenCodigoSerial;
            
    private String TenNombre,
            TenColor;
    
    private int TenTamaño,
            TenCosto;
    
    
    @JoinColumn(name="marca_cod", referencedColumnName = "marca_cod")
    @ManyToOne
    private Marcatennis marcatennis;
    
    public Articulo() {
    }

    public Articulo(String TenCodigoSerial, String TenNombre, String TenColor, int TenTamaño, int TenCosto) {
        this.TenCodigoSerial = TenCodigoSerial;
        this.TenNombre = TenNombre;
        this.TenColor = TenColor;
        this.TenTamaño = TenTamaño;
        this.TenCosto = TenCosto;
    }    

    public Articulo(String TenCodigoSerial, String TenNombre, String TenColor, int TenTamaño, int TenCosto, Marcatennis marcatennis) {
        this.TenCodigoSerial = TenCodigoSerial;
        this.TenNombre = TenNombre;
        this.TenColor = TenColor;
        this.TenTamaño = TenTamaño;
        this.TenCosto = TenCosto;
        this.marcatennis = marcatennis;
    }
    
    
            
}
