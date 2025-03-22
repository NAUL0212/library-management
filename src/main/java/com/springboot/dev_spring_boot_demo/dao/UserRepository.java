package com.springboot.dev_spring_boot_demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.dev_spring_boot_demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT COUNT(u) FROM User u")
    long countTotalUsers();
}
