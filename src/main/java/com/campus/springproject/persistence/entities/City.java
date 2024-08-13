package com.campus.springproject.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "codecity")
    private String codecity;
    private String namecity;

    @ManyToOne()
    @JoinColumn(name = "codereg", referencedColumnName = "codereg")
    private Region region;

    
    public City(String codecity, String namecity) {
        this.codecity = codecity;
        this.namecity = namecity;
    }


    public String getCodecity() {
        return codecity;
    }


    public void setCodecity(String codecity) {
        this.codecity = codecity;
    }


    public String getNamecity() {
        return namecity;
    }


    public void setNamecity(String namecity) {
        this.namecity = namecity;
    }


    public Region getRegion() {
        return region;
    }


    public void setRegion(Region region) {
        this.region = region;
    }





    

}
