package com.springboot.dev_spring_boot_demo.service;

import java.util.List;

import com.springboot.dev_spring_boot_demo.entity.Customer;

public interface CustomerService {
    List<Customer> findAll();           //CRUD
    Customer findById(int id);
    Customer save(Customer customer);
    void deleteById(int id);
    
} 