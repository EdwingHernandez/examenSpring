package com.campus.springproject.domain.services;

import java.util.List;
import java.util.Optional;

import com.campus.springproject.persistence.entities.City;


public interface CityService {
    List<City> findAll();
    Optional<City> findById(String codecity);
    City save(City City);
    City update(String codecity, City City);
    Optional<City> delete(String codecity);
    

}
