package com.springboot.dev_spring_boot_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dev_spring_boot_demo.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
