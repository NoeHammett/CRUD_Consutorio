/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.controller;

import com.stario.consultorio.models.EstatusPacienteModel;
import com.stario.consultorio.services.EstatusPacienteService;
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

@Service
@RestController

@RequestMapping("api/estatuspaciente")
public class EstatusPacienteController {

    @Autowired
    EstatusPacienteService estatusPacienteService;
    
    @GetMapping("/listadoestatuspaciente")
    public ArrayList<EstatusPacienteModel> obtenerAllEstatusPaciente(){
        return estatusPacienteService.obtenerAllEstatusPaciente();
    }
    
    @GetMapping(path ="/{id}")
    public Optional<EstatusPacienteModel> obtenerEstatusPacienteId(@PathVariable ("id") Long id){
        return estatusPacienteService.obtenerEstatusPacienteId(id);
    } 
    
    @PostMapping("/agregaestatuspaciente")
    public EstatusPacienteModel guardarEstatusPaciente(@RequestBody EstatusPacienteModel estatuspaciente){
        return estatusPacienteService.guardarEstatusPaciente(estatuspaciente);
    }
    
    @DeleteMapping("/{id}")
    public String eliminaEstatusPaciente (@PathVariable ("id") Long id){
        boolean ok = this.estatusPacienteService.eliminarEstatusPaciente(id);
        if(ok){
            return "Se elimino correctamente el estatus";
        }else{
            return "Hubo un error al intentar eliminar el estatus"; 
        }
    }
}
