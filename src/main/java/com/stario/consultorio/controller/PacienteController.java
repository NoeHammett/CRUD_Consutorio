/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.controller;

import com.stario.consultorio.models.PacienteModel;
import com.stario.consultorio.services.PacienteService;
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
@RequestMapping("/api/paciente")
public class PacienteController {
    
    @Autowired PacienteService pacienteService;
    
    @GetMapping("/listadopacientes")
    public ArrayList<PacienteModel> obtenerAllPacientes(){
        return pacienteService.obtenerAllPacientes();
    }

    @GetMapping(path = "/{id}")
    public Optional <PacienteModel> obtenerMedicoId(@PathVariable("id") Long id){
        return pacienteService.obtenerPacienteId(id);
    } 
    
    @PostMapping("/agregapaciente")
    public PacienteModel guardarPaciente (@RequestBody PacienteModel paciente){
        return pacienteService.guardarPaciente(paciente);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPaciente(@PathVariable ("id") Long id){
        boolean ok=this.pacienteService.eliminarPaciente(id);
        if(ok){
            return "Se elimino el paciente con el id "+id;
        }else{
            return "Hubo un problema al eliminar el paciente con el id "+id;
        }
    }
    
}
