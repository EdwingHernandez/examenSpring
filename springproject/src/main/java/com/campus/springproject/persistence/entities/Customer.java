package com.campus.springproject.persistence.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "customer")
public class Customer {

    private String idcustomer;
    private String namecustomer;
    private String lastnamecustomer;
    private String codecitycustomer;
    private String emailcustomer;
    private Date bithdate;
    private Float lon;
    private Float latitud;
    
}
