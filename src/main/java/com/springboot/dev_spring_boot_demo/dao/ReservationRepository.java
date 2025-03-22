package com.springboot.dev_spring_boot_demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dev_spring_boot_demo.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUser_UserId(Long userId);  // Tìm danh sách đặt trước theo userId
    List<Reservation> findByBook_BookId(Long bookId);  // Tìm danh sách đặt trước theo bookId
    List<Reservation> findByFulfilled(boolean fulfilled);  // Lọc danh sách đã hoàn thành/chưa hoàn thành
}