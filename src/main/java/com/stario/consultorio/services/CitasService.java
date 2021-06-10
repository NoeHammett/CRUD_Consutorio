/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.services;

import com.stario.consultorio.models.CitasModel;
import com.stario.consultorio.repositories.CitasRepositories;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CitasService {
    
    @Autowired CitasRepositories citasRepositories;
    
    public ArrayList<CitasModel> obtenerAllCitas(){
        return (ArrayList <CitasModel>) citasRepositories.findAll();
    } 
    
    public CitasModel guardarCita( CitasModel cita){
        return citasRepositories.save(cita);
    }
    
    public boolean eliminarCita (Long id){
        try{
            citasRepositories.deleteById(id);
            return true;
        }catch(Exception err){
            System.out.println("Error al momento de eliminar" + err.getMessage().toString());
            return false;
        }
        
    }
}
