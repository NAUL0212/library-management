package com.springboot.dev_spring_boot_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name="company_name", nullable = false)
    private String company_name;

    @Column(name="street_address")
    private String street_address;

    @Column(name="city")
    private String city;

    @Column(name="region")
    private String region;

    @Column(name="postal")
    private int postal;

    @Column(name="country")
    private String country;

    public Customer(){

    }
    
    public Customer(String company_name, String street_address, String city, String region, int postal, String country){
        this.company_name = company_name;
        this.street_address = street_address;
        this.city = city;
        this.postal = postal;
        this.country = country;
        this.region = region;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getStreet_address() {
        return street_address;
    }

    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public String getCompany_name() {
        return company_name;
    }
    public int getPostal() {
        return postal;
    }
    public String getRegion() {
        return region;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPostal(int postal) {
        this.postal = postal;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

}
