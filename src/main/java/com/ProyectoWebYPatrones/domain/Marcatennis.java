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
@Table(name = "marcatennis")
public class Marcatennis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="marca_cod")
    private Long marcaCod;

    private String MarcaNom;
    
        public Marcatennis() {
    }

    public Marcatennis(String MarcaNom) {
        this.MarcaNom = MarcaNom;
    }



}
