/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.services;

import com.stario.consultorio.models.PacienteModel;
import com.stario.consultorio.repositories.PacienteRepositories;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    
    @Autowired PacienteRepositories pacienteRepositories;
    
    public Optional <PacienteModel> obtenerPacienteId (Long Id){
        return pacienteRepositories.findById(Id);
    }
    
    public ArrayList <PacienteModel> obtenerAllPacientes (){
        return (ArrayList <PacienteModel>) pacienteRepositories.findAll();
    }
    
    public PacienteModel guardarPaciente (PacienteModel paciente){
        return pacienteRepositories.save(paciente);
    }
    
    public boolean eliminarPaciente (Long Id){
        try{
            pacienteRepositories.deleteById(Id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}

