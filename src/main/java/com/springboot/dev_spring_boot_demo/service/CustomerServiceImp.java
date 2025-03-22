package com.springboot.dev_spring_boot_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dev_spring_boot_demo.dao.CustomerDAO;
import com.springboot.dev_spring_boot_demo.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImp implements CustomerService{

    private CustomerDAO customerDAO;

    @Autowired
    public CustomerServiceImp(CustomerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerDAO.findById(id);
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        customerDAO.deleteById(id);
    }
    
}
