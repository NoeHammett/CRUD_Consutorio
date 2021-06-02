/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.services;

import com.stario.consultorio.models.EspecialidadModel;
import com.stario.consultorio.repositories.EspecialidadRepositories;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noe
 */
@Service
public class EspecialidadService {
    
    @Autowired
    EspecialidadRepositories especialidadRepositories;
    
    public ArrayList<EspecialidadModel> obtenerAllEspecialidad(){
        return (ArrayList<EspecialidadModel>) especialidadRepositories.findAll();
    }
    
    public EspecialidadModel guardarEspecialidad (EspecialidadModel especialidad){
        return especialidadRepositories.save(especialidad);
    }
    
     public boolean eliminarEspecialidad(Long id){
        try{
            especialidadRepositories.deleteById(id);
            return true;
        }catch (Exception err){
            System.out.println("Error al momento de eliminar" + err.getMessage().toString());
            return false;
        }
    }
    
}
