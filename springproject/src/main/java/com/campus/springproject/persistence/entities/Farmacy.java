package com.campus.springproject.persistence.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "farmacy")
public class Farmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfarmacy;


    private String namefarmacy;
    private String addressfarmacy;
    private Float lon;
    private Float latfarmacy;
    private String logofarmacy;

    @ManyToOne
    @JoinColumn(name = "codecityfarm", referencedColumnName = "codecity")
    private City city;
    

    @ManyToMany    
    @JoinTable(
        name = "farmacymedicine",
        joinColumns = @JoinColumn(name = "idfarmacy"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
    private List<Medicine> medicine;



    public Farmacy() {
    }

    public Long getIdfarmacy() {
        return idfarmacy;
    }

    public void setIdfarmacy(Long idfarmacy) {
        this.idfarmacy = idfarmacy;
    }

    public String getNamefarmacy() {
        return namefarmacy;
    }

    public void setNamefarmacy(String namefarmacy) {
        this.namefarmacy = namefarmacy;
    }

    public String getAddressfarmacy() {
        return addressfarmacy;
    }

    public void setAddressfarmacy(String addressfarmacy) {
        this.addressfarmacy = addressfarmacy;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLatfarmacy() {
        return latfarmacy;
    }

    public void setLatfarmacy(Float latfarmacy) {
        this.latfarmacy = latfarmacy;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public void setLogofarmacy(String logofarmacy) {
        this.logofarmacy = logofarmacy;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(List<Medicine> medicine) {
        this.medicine = medicine;
    }




    

}
