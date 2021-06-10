/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.controller;

import com.stario.consultorio.models.CitasModel;
import com.stario.consultorio.services.CitasService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/api/cita")
public class CitasController {
    
   @Autowired CitasService citasService;
   
   @GetMapping("/listadocitas")
   public ArrayList<CitasModel> obtenerAllCitas(){
    return citasService.obtenerAllCitas();
    }
   
   @PostMapping("/agregacita")
   public CitasModel guardarCita (@RequestBody CitasModel cita){
       return this.citasService.guardarCita(cita);
   }
   
   
   
}
