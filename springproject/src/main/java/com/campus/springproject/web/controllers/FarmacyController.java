package com.campus.springproject.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.springproject.domain.services.FarmacyService;
import com.campus.springproject.persistence.entities.Farmacy;

@RestController
@RequestMapping("api/farmacy")
public class FarmacyController {

    @Autowired
    private FarmacyService farmacyService;

    public FarmacyController(FarmacyService farmacyService) {
        this.farmacyService = farmacyService;
    }


    @GetMapping("/all")
    public List<Farmacy> findAllfarmacy(){

        return farmacyService.findAll();
    }
    

}
