/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stario.repositories;

import com.stario.consultorio.models.MedicoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Noe
 */
@Repository
public interface MedicoRepositories extends CrudRepository<MedicoModel, Long>{
}
