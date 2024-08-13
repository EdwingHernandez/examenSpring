package com.campus.springproject.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unitmeasurement")
public class UnitMeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idum;

    private String nameum;

    public UnitMeasurement() {
    }

    public Long getIdum() {
        return idum;
    }

    public void setIdum(Long idum) {
        this.idum = idum;
    }

    public String getNameum() {
        return nameum;
    }

    public void setNameum(String nameum) {
        this.nameum = nameum;
    }


    
}
