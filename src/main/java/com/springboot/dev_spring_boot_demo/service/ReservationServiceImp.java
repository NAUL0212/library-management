package com.springboot.dev_spring_boot_demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springboot.dev_spring_boot_demo.entity.Reservation;

@Service
public class ReservationServiceImp extends BaseServiceImp<Reservation, Long>{

    public ReservationServiceImp(JpaRepository<Reservation, Long> repository) {
        super(repository);
        //TODO Auto-generated constructor stub
    }
    
}
