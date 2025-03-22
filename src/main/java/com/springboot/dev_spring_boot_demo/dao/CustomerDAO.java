package com.springboot.dev_spring_boot_demo.dao;

import java.util.List;

import com.springboot.dev_spring_boot_demo.entity.Customer;

public interface CustomerDAO {
    List<Customer> findAll();           //CRUD
    Customer findById(int id);
    Customer save(Customer customer);
    void deleteById(int id);
    
} 
