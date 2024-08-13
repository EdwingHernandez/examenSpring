package com.campus.springproject.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activeprinciple")

public class ActivePrinciple {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idap;

    private String nameap;

    public ActivePrinciple() {
    }

    public Long getIdap() {
        return idap;
    }

    public void setIdap(Long idap) {
        this.idap = idap;
    }

    public String getNameap() {
        return nameap;
    }

    public void setNameap(String nameap) {
        this.nameap = nameap;
    }


    

}
