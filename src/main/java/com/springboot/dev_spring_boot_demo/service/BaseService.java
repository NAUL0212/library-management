package com.springboot.dev_spring_boot_demo.service;

import java.util.List;

// interface
public interface BaseService<T, ID> {
    List<T> getAll();
    T getById(ID id);
    T findById(ID id);
    T save (T entity);
    void delete(ID id);
    
}
