/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.einvoice.business.entities.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.einvoice.business.entities.SeedStarter;


@Repository
public class SeedStarterRepository {
   
    private final List<SeedStarter> seedStarters = new ArrayList<SeedStarter>();
    
    
    
    public SeedStarterRepository() {
        super();
    }
    
    
    
    public List<SeedStarter> findAll() {
        return new ArrayList<SeedStarter>(this.seedStarters);
    }

    
    public void add(final SeedStarter seedStarter) {
        this.seedStarters.add(seedStarter);
    }
    
}
