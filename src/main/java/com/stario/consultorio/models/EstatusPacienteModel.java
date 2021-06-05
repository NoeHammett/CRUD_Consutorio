/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="estatus_paciente")
public class EstatusPacienteModel {
    
    private String nombre;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_estatus_paciente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId_estatus_paciente() {
        return id_estatus_paciente;
    }

    public void setId_estatus_paciente(Long id_estatus_paciente) {
        this.id_estatus_paciente = id_estatus_paciente;
    }
    
    
}
