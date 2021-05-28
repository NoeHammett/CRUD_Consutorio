/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.controller;

import com.stario.consultorio.models.MedicoModel;
import com.stario.consultorio.services.MedicoService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
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
    
    @GetMapping()
    public ArrayList<MedicoModel> obtenerAllMedicos(){
        return medicoService.obtenerAllMedicos();
    }
    
    @PostMapping()
    public MedicoModel guardarMedicos(@RequestBody MedicoModel medico){
        return this.medicoService.guardarMedico(medico);
        
    }
     
    
}
