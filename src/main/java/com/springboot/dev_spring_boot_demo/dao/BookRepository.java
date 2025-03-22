package com.springboot.dev_spring_boot_demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.dev_spring_boot_demo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByCategory_CategoryName(String categoryName);  // Tìm sách theo category name
    @Query("SELECT COUNT(b) FROM Book b")
    long countTotalBooks();
}