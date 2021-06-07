/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.repositories;

import com.stario.consultorio.models.PacienteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PacienteRepositories extends CrudRepository <PacienteModel,Long>{
    
}
