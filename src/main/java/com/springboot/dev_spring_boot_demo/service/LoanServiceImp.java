package com.springboot.dev_spring_boot_demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springboot.dev_spring_boot_demo.entity.Loan;

@Service
public class LoanServiceImp extends BaseServiceImp<Loan, Long> {

    public LoanServiceImp(JpaRepository<Loan, Long> repository) {
        super(repository);
        //TODO Auto-generated constructor stub
    }
    
}
