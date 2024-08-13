package com.campus.springproject.persistence.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String proceedings;
    private String namemedicine;
    private String healthregister;
    private String  description;
    private String descriptionshort;
    private String namerol;


    @ManyToOne
    @JoinColumn(name = "codemodeadmin", referencedColumnName = "id")
    private ModeAdministration modeAdministration;

    @ManyToOne
    @JoinColumn(name = "codeap", referencedColumnName = "idap")
    private ActivePrinciple activePrinciple;

    @ManyToOne
    @JoinColumn(name = "codeum", referencedColumnName = "idum")
    private UnitMeasurement unitMeasurement;

    @ManyToOne
    @JoinColumn(name = "codelab", referencedColumnName = "id")
    private Laboratory laboratory;

    
    private List<Farmacy> farmacy;
    

    public Medicine() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getProceedings() {
        return proceedings;
    }


    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }


    public String getNamemedicine() {
        return namemedicine;
    }


    public void setNamemedicine(String namemedicine) {
        this.namemedicine = namemedicine;
    }


    public String getHealthregister() {
        return healthregister;
    }


    public void setHealthregister(String healthregister) {
        this.healthregister = healthregister;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getDescriptionshort() {
        return descriptionshort;
    }


    public void setDescriptionshort(String descriptionshort) {
        this.descriptionshort = descriptionshort;
    }


    public String getNamerol() {
        return namerol;
    }


    public void setNamerol(String namerol) {
        this.namerol = namerol;
    }


    public ModeAdministration getModeAdministration() {
        return modeAdministration;
    }


    public void setModeAdministration(ModeAdministration modeAdministration) {
        this.modeAdministration = modeAdministration;
    }


    public ActivePrinciple getActivePrinciple() {
        return activePrinciple;
    }


    public void setActivePrinciple(ActivePrinciple activePrinciple) {
        this.activePrinciple = activePrinciple;
    }


    public UnitMeasurement getUnitMeasurement() {
        return unitMeasurement;
    }


    public void setUnitMeasurement(UnitMeasurement unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }


    public Laboratory getLaboratory() {
        return laboratory;
    }


    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }


    public List<Farmacy> getFarmacy() {
        return farmacy;
    }


    public void setFarmacy(List<Farmacy> farmacy) {
        this.farmacy = farmacy;
    }




    



}
