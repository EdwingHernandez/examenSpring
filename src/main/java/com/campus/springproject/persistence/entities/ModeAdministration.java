
package com.campus.springproject.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modeadministration")
public class ModeAdministration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String descriptionmode;


    public ModeAdministration() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getDescriptionmode() {
        return descriptionmode;
    }


    public void setDescriptionmode(String descriptionmode) {
        this.descriptionmode = descriptionmode;
    }

    
}
