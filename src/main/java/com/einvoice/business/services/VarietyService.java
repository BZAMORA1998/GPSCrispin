/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.einvoice.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.einvoice.business.entities.Variety;
import com.einvoice.business.entities.repositories.VarietyRepository;

@Service
public class VarietyService {
    
    @Autowired
    private VarietyRepository varietyRepository; 
    
    
    public VarietyService() {
        super();
    }
    
    
    
    public List<Variety> findAll() {
        return this.varietyRepository.findAll();
    }

    public Variety findById(final Integer id) {
        return this.varietyRepository.findById(id);
    }
    
}
