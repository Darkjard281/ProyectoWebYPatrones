/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Prototipo_1_proyecto_Web_y_Patrones_Luis_Amador.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data//Notacion de lombok me da metodos como los getter and setters
@Entity/*Importar javax.persitence*/
@Table(name = "empleado")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id/*Llave primaria para la base de datos*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmpId;
    /*El motor que tenemos de ORM llamado hibernate lo interpreta como EmpId*/

    private String EmpCedula,
            EmpNombre,
            EmpApellidopaterno,
            EmpApellidomaterno,
            EmpCorreo,
            EmpContraseña;
    private int EmpTelefono;
    
    private boolean EmpActivo;

    public Empleado() {
    }

    public Empleado(String EmpCedula, String EmpNombre, String EmpApellidopaterno, String EmpApellidomaterno, String EmpCorreo, String EmpContraseña, int EmpTelefono, boolean EmpActivo) {
        this.EmpCedula = EmpCedula;
        this.EmpNombre = EmpNombre;
        this.EmpApellidopaterno = EmpApellidopaterno;
        this.EmpApellidomaterno = EmpApellidomaterno;
        this.EmpCorreo = EmpCorreo;
        this.EmpContraseña = EmpContraseña;
        this.EmpTelefono = EmpTelefono;
        this.EmpActivo = EmpActivo;
    }

}
