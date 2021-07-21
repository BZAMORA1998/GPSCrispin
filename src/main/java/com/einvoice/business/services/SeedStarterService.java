/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.einvoice.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.einvoice.business.entities.SeedStarter;
import com.einvoice.business.entities.repositories.SeedStarterRepository;

@Service
public class SeedStarterService {
    
    
    @Autowired
    private SeedStarterRepository seedstarterRepository; 
    
    
    public SeedStarterService() {
        super();
    }
    
    
    
    public List<SeedStarter> findAll() {
        return this.seedstarterRepository.findAll();
    }

    public void add(final SeedStarter seedStarter) {
        this.seedstarterRepository.add(seedStarter);
    }
    
}
