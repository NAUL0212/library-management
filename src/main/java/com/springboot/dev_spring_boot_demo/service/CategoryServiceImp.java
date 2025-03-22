package com.springboot.dev_spring_boot_demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springboot.dev_spring_boot_demo.entity.Category;

@Service
public class CategoryServiceImp extends BaseServiceImp<Category, Long> {

    public CategoryServiceImp(JpaRepository<Category, Long> repository) {
        super(repository);
        //TODO Auto-generated constructor stub
    }
    
}
