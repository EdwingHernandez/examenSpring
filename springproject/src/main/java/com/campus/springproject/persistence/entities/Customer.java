package com.campus.springproject.persistence.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "customer")
public class Customer {

    private String idcustomer;
    private String namecustomer;
    private String lastnamecustomer;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer", referencedColumnName = "codecity")
    private City city;


    private String emailcustomer;
    private Date bithdate;
    private Float lon;
    private Float latitud;


    public Customer() {
    }
    public Customer(String idcustomer, String namecustomer, String lastnamecustomer, String codecitycustomer,
            String emailcustomer, Date bithdate, Float lon, Float latitud) {

    }


    public String getIdcustomer() {
        return idcustomer;
    }


    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }


    public String getNamecustomer() {
        return namecustomer;
    }


    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }


    public String getLastnamecustomer() {
        return lastnamecustomer;
    }


    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }


    public String getEmailcustomer() {
        return emailcustomer;
    }


    public void setEmailcustomer(String emailcustomer) {
        this.emailcustomer = emailcustomer;
    }


    public Date getBithdate() {
        return bithdate;
    }


    public void setBithdate(Date bithdate) {
        this.bithdate = bithdate;
    }


    public Float getLon() {
        return lon;
    }


    public void setLon(Float lon) {
        this.lon = lon;
    }


    public Float getLatitud() {
        return latitud;
    }


    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }



    
    
    
    
}
