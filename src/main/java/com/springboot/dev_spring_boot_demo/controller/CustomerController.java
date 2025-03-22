package com.springboot.dev_spring_boot_demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.dev_spring_boot_demo.service.CustomerService;
import com.springboot.dev_spring_boot_demo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    // khai báo Service
    private CustomerService customerService;

    // contrucstor controller
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    // REST API
    @GetMapping("/list-customer")
    public String list(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("Customers", customers);
        return "list-customer";
       
    }

    @GetMapping("/customer-form-insert")
    public String formInsert(Model model){
        Customer customer = new Customer();
        model.addAttribute("Customer", customer);
        return "customer-form-insert";
    }

    @PostMapping("/save")
    public String save(Customer customer){
        customerService.save(customer);
        return "redirect:/customer/list-customer";
    }

    @GetMapping("/customer-form-update")
    public String formUpdate(@RequestParam("id") int id, Model model){
        Customer customer = customerService.findById(id);

        model.addAttribute("Customer", customer);
        return "customer-form-update";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {  
        customerService.deleteById(id);
        return "redirect:/customer/list-customer";
    }

        
    


    
}
