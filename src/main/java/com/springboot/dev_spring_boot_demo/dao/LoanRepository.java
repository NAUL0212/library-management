package com.springboot.dev_spring_boot_demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dev_spring_boot_demo.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByUser_UserId(Long userId);  // Tìm danh sách mượn theo userId
    List<Loan> findByBook_BookId(Long bookId);  // Tìm danh sách mượn theo bookId
}
