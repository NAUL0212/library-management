package com.springboot.dev_spring_boot_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.springboot.dev_spring_boot_demo.dao.UserRepository;
import com.springboot.dev_spring_boot_demo.entity.User;

@Service
public class UserServiceImp extends BaseServiceImp<User, Long>{

    public UserServiceImp(JpaRepository<User, Long> repository) {
        super(repository);
        //TODO Auto-generated constructor stub
    }

    @Autowired
    private UserRepository userRepository;

    public long getTotalUsers() {
        return userRepository.countTotalUsers();
    }
    
}
