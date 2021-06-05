/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.controller;

import com.stario.consultorio.models.EstatusMedicoModel;
import com.stario.consultorio.services.EstatusMedicoService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Noe
 */

@Service
@RestController

//Ruta por la cual se accede a la peticion
@RequestMapping("/api/estatusmedico")
public class EstatusMedicoController {
    
    @Autowired
    EstatusMedicoService estatusMedicoService;
    
    @GetMapping("/listadoestatusmedico")
    public ArrayList<EstatusMedicoModel> obtenerAllEstatusMedico(){
       return estatusMedicoService.obtenerAllEstatusMedico();
   }
    
    @GetMapping(path = "/{id}")
    public Optional<EstatusMedicoModel> obtenerEstatusMedicoById(@PathVariable("id") Long id){
        return estatusMedicoService.ObtenerEstatusMedicoId(id);
    }
    
    @PostMapping("/agregaestatusmedico")
    public EstatusMedicoModel guardarEstatusMedico (@RequestBody EstatusMedicoModel estatusMedico){
        return estatusMedicoService.guardarEstatusMedico(estatusMedico);
    }
    
    @DeleteMapping("/{id}")
    public String eliminaEstatusMedico (@PathVariable("id") Long id){
     boolean ok = this.estatusMedicoService.eliminarEstatusMedico(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }   
    } 
    
    
}
