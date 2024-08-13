package com.campus.springproject.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.springproject.persistence.entities.City;
import com.campus.springproject.persistence.repositories.CityRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class CityServiceImplement implements CityService{

    @Autowired
    private CityRepository cityRepository;


    public CityServiceImplement(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {

        return (List<City>) cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(String codecity) {
        
        return cityRepository.findById(codecity);
    }

    @Override
    public City save(City city) {

        return cityRepository.save(city);

    }

    @Override
    @Transactional
    public City update(String codecity, City city) {
        if(!cityRepository.existsById(codecity)){
            throw new EntityNotFoundException("City no encontrada con " + codecity);
        }
        city.setCodecity(codecity);
        return cityRepository.save(city);
    }

    @Override
    @Transactional
    public Optional<City> delete(String codecity) {
        Optional<City> city = cityRepository.findById(codecity); 

        if(city.isPresent()){
            cityRepository.deleteById(codecity);
        }

        return city;
    }

}
