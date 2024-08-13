package com.campus.springproject.domain.services;

import java.util.List;
import java.util.Optional;


import com.campus.springproject.persistence.entities.Farmacy;


public interface FarmacyService {
    
    List<Farmacy> findAll();
    Optional<Farmacy> findById(Long idfarmacy);
    Farmacy save(Farmacy farmacy);
    Farmacy update(Long idfarmacy, Farmacy farmacy);
    Optional<Farmacy> delete(Long idfarmacy);
    

}
