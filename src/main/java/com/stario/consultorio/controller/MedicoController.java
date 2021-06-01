/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.controller;

import com.stario.consultorio.models.MedicoModel;
import com.stario.consultorio.services.MedicoService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
@RequestMapping("/api/medico")
public class MedicoController {
    
   @Autowired
    MedicoService medicoService;
    
    @GetMapping("/listado")
    public ArrayList<MedicoModel> obtenerAllMedicos(){
        return medicoService.obtenerAllMedicos();
    }

    @GetMapping(path = "/{id}")
    public Optional<MedicoModel> obtenerMedicoId(@PathVariable("id") Long id) {
        return this.medicoService.ObtenerMedicoId(id);
    }
    
    @PostMapping()
    public MedicoModel guardarMedicos(@RequestBody MedicoModel medico){
        System.out.println(medico);
        return this.medicoService.guardarMedico(medico);  
    }
    

    
}
