/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.services;

import com.stario.consultorio.models.EstatusPacienteModel;
import com.stario.consultorio.repositories.EstatusPacienteRepositories;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstatusPacienteService {
    
    @Autowired
    EstatusPacienteRepositories estatusPacienteRepositories;
    
    public ArrayList<EstatusPacienteModel> obtenerAllEstatusPaciente(){
        return (ArrayList<EstatusPacienteModel>) estatusPacienteRepositories.findAll();
    }
    
    public Optional <EstatusPacienteModel> obtenerEstatusPacienteId(Long id){
        return estatusPacienteRepositories.findById(id);
    }
    
    public EstatusPacienteModel guardarEstatusPaciente (EstatusPacienteModel estatusPaciente){
        return estatusPacienteRepositories.save(estatusPaciente);
    }
    
    public boolean eliminarEstatusPaciente (Long id){
        try{
             estatusPacienteRepositories.deleteById(id);
             return true;
        }catch(Exception err){
            System.out.println("Error al eliminar el estatus "+err.getMessage().toString());
            return false;
        }
    }
    
    
    
}
