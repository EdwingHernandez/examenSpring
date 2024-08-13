package com.campus.springproject.web.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.springproject.domain.services.CityService;
import com.campus.springproject.domain.services.FarmacyService;
import com.campus.springproject.persistence.entities.Farmacy;

@RestController
@RequestMapping("api/farmacy")
public class FarmacyController {

    @Autowired
    private FarmacyService farmacyService;

    private CityService cityService;

    public FarmacyController(FarmacyService farmacyService, CityService cityService) {
        this.farmacyService = farmacyService;
        this.cityService = cityService;
    }


    @GetMapping("/all")
    public List<Farmacy> findAllfarmacy(){
        // List<City> cities = cityService.findAll();
        return farmacyService.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Farmacy> obtenerCiudad(@PathVariable Long id) {
        Optional<Farmacy> farmacy = farmacyService.findById(id);
        
        return farmacy;
    }
}
