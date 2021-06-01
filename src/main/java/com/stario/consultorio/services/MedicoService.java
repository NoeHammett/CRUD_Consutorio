/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.services;




import java.util.ArrayList;

import com.stario.consultorio.models.MedicoModel;   
import com.stario.consultorio.repositories.MedicoRepositories;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noe
 */
@Service
public class MedicoService  {

@Autowired
MedicoRepositories medicoRepositories;
    
    public Optional <MedicoModel> ObtenerMedicoId(Long id){
        return medicoRepositories.findById(id);
    }
    public ArrayList<MedicoModel> obtenerAllMedicos(){
        return (ArrayList<MedicoModel>) medicoRepositories.findAll();
    }
    
    public MedicoModel guardarMedico(MedicoModel medico){
        return  medicoRepositories.save(medico);
    }
    
    
}
