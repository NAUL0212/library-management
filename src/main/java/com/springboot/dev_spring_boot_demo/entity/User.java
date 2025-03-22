package com.springboot.dev_spring_boot_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId; // ID tự động tăng

    @Column(nullable = false, length = 100)
    private String name; // Họ và tên

    @Column(length = 255)
    private String photoUrl; // Ảnh thẻ độc giả (lưu URL ảnh)

    @Column(unique = true, nullable = false, length = 100)
    private String email; // Email

    @Column(nullable = false, length = 255)
    private String address; // Địa chỉ

    @Column(nullable = false, length = 15)
    private String phone; // Số điện thoại
}