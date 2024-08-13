package com.campus.springproject.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campus.springproject.persistence.entities.City;

public interface CityRepository extends JpaRepository<City, String>{

}
