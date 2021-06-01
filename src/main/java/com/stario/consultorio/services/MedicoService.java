/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.services;




import java.util.ArrayList;

import com.stario.consultorio.models.MedicoModel;
import com.stario.consultorio.repositories.MedicoRepositories;

import org.hibernate.annotations.SourceType;
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
    
    public ArrayList<MedicoModel> obtenerAllMedicos(){
        return (ArrayList<MedicoModel>) medicoRepositories.findAll();
    }
    
    public MedicoModel guardarMedico(MedicoModel medico){
        return  medicoRepositories.save(medico);
    }

    public boolean eliminarMedico(Long id){
        try{
            medicoRepositories.deleteById(id);
            return true;
        }catch (Exception err){
            System.out.println("Error al momento de eliminar" + err.getMessage().toString());
            return false;
        }
    }
}
