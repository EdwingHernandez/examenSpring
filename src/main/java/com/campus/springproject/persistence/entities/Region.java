package com.campus.springproject.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="region")
public class Region {

    @Id
    @Column(name = "codereg")
    private String codereg;
    private String namereg;

    @ManyToOne()
    @JoinColumn(name = "codecountry", referencedColumnName = "codecountry")
    private Country country;


    public Region(String codereg, String namereg, String codecountry) {
        this.codereg = codereg;
        this.namereg = namereg;

    }

    

    public Region() {
    }



    public String getCodereg() {
        return codereg;
    }


    public void setCodereg(String codereg) {
        this.codereg = codereg;
    }


    public String getNamereg() {
        return namereg;
    }


    public void setNamereg(String namereg) {
        this.namereg = namereg;
    }


    public Country getCountry() {
        return country;
    }


    public void setCountry(Country country) {
        this.country = country;
    }


 
    



}
