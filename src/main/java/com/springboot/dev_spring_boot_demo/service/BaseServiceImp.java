package com.springboot.dev_spring_boot_demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;

public abstract class BaseServiceImp<T, ID> implements BaseService<T, ID> {

    // khai báo JpaRepository từ lớp dao
    protected final JpaRepository<T, ID> repository;

    // contrucstor
    public BaseServiceImp( JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    

    // Methods 
    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public T getById(ID id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy id"));
    }

    @Override
    public T findById(ID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    @Transactional
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void delete(ID id) {
        repository.deleteById(id);
    }
    
}
