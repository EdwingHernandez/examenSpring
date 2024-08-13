package com.campus.springproject.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "codecountry")
    private String codecountry;

    private String namecountry;

    
    public Country(String codecountry, String namecountry) {
        this.codecountry = codecountry;
        this.namecountry = namecountry;
    }

    


    public Country() {
    }




    public String getCodecountry() {
        return codecountry;
    }


    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }


    public String getNamecountry() {
        return namecountry;
    }


    public void setNamecountry(String namecountry) {
        this.namecountry = namecountry;
    }

    

}
