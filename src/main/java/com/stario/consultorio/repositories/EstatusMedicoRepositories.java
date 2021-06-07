/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.consultorio.repositories;

import com.stario.consultorio.models.EstatusMedicoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstatusMedicoRepositories extends CrudRepository <EstatusMedicoModel, Long> {
    
}
