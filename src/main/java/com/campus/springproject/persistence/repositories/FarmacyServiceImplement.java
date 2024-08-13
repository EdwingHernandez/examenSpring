package com.campus.springproject.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.springproject.domain.services.FarmacyService;
import com.campus.springproject.persistence.entities.Farmacy;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class FarmacyServiceImplement implements FarmacyService{

    @Autowired
    private FarmacyRepository farmacyRepository;

    

    public FarmacyServiceImplement(FarmacyRepository farmacyRepository) {
        this.farmacyRepository = farmacyRepository;
    }

    @Override
    public List<Farmacy> findAll() {

        return (List<Farmacy>) farmacyRepository.findAll();
    }

    @Override
    public Optional<Farmacy> findById(Long idfarmacy) {
        
        return farmacyRepository.findById(idfarmacy);
    }

    @Override
    public Farmacy save(Farmacy farmacy) {

        return farmacyRepository.save(farmacy);

    }

    @Override
    @Transactional
    public Farmacy update(Long idfarmacy, Farmacy farmacy) {
        if(!farmacyRepository.existsById(idfarmacy)){
            throw new EntityNotFoundException("Farmacy no encontrada con " + idfarmacy);
        }
        farmacy.setIdfarmacy(idfarmacy);
        return farmacyRepository.save(farmacy);
    }

    @Override
    @Transactional
    public Optional<Farmacy> delete(Long idfarmacy) {
        Optional<Farmacy> farmacy = farmacyRepository.findById(idfarmacy); 

        if(farmacy.isPresent()){
            farmacyRepository.deleteById(idfarmacy);
        }

        return farmacy;
    }


}
