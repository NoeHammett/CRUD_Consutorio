/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.controller;

import com.stario.consultorio.models.EspecialidadModel;
import com.stario.consultorio.services.EspecialidadService;
import java.util.ArrayList;
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

//Ruta por la cual se accede a la peticion
@RequestMapping("/api/especialidad")
public class EspecialidadController {

    //Anotación que permite inyectar unas dependencias
   @Autowired
   EspecialidadService especialidadService;
   
   //Peticion GET para obtener el listado las especialidades
   @GetMapping("/listadoespecialidad")
   public ArrayList<EspecialidadModel> obtenerAllEspecialidad(){
       return especialidadService.obtenerAllEspecialidad();
   }
   
   //Peticion POST para registrar una nueva especialidad
   @PostMapping("/agregaespecialidad")
   public EspecialidadModel guardarEspecialidad (@RequestBody EspecialidadModel especialidad){
       return this.especialidadService.guardarEspecialidad(especialidad);
   }
   
   //Peticion DELETE para eliminar una especialidad por id
   @DeleteMapping("/{id}")
   public String eliminaEspecialidad (@PathVariable("id") Long id){
         boolean ok = this.especialidadService.eliminarEspecialidad(id);
         if (ok){
             return "Se ha eliminado la especialidad con id " + id;
         }else{
             return "No pudo eliminar el usuario con id " + id;
         }
   }
   
}
