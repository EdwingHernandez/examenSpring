package com.campus.springproject.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "laboratory")
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecityreg", referencedColumnName ="codecity")
    private City city;

    public Laboratory(Long id, String namelab) {
        this.id = id;
        this.namelab = namelab;
    }

    

    public Laboratory() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

 

    
    

}
