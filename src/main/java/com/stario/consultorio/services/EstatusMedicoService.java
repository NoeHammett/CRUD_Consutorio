/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.services;

import com.stario.consultorio.models.EstatusMedicoModel;
import com.stario.consultorio.repositories.EstatusMedicoRepositories;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noe
 */

@Service
public class EstatusMedicoService {
 
    @Autowired
    EstatusMedicoRepositories estatusMedicoRepositories;
    
    public ArrayList<EstatusMedicoModel> obtenerAllEspecialidad(){
        return (ArrayList<EstatusMedicoModel>) estatusMedicoRepositories.findAll();
    }
    
     public Optional <EstatusMedicoModel> ObtenerMedicoId(Long id){
        return estatusMedicoRepositories.findById(id);
    }
    
    public EstatusMedicoModel guardarEstatusMedico (EstatusMedicoModel estatusMedico){
        return estatusMedicoRepositories.save(estatusMedico);
    }
    
    public boolean eliminarEstatusMedico(Long id){
        try{
            estatusMedicoRepositories.deleteById(id);
            return true;
        }catch(Exception err){
             System.out.println("Error al momento de eliminar" + err.getMessage().toString());
            return false;
        }
               
    }
}
