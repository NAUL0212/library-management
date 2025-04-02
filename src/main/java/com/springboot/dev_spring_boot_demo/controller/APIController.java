package com.springboot.dev_spring_boot_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dev_spring_boot_demo.entity.Book;
import com.springboot.dev_spring_boot_demo.entity.Loan;
import com.springboot.dev_spring_boot_demo.entity.User;
import com.springboot.dev_spring_boot_demo.service.BookServiceImp;
import com.springboot.dev_spring_boot_demo.service.LoanServiceImp;
import com.springboot.dev_spring_boot_demo.service.UserServiceImp;

@RestController         // sử dụng @RestController = @Controller + @ResponeBody
@RequestMapping("/api")
public class APIController {
    // khai báo
    private final BookServiceImp bookServiceImp;
    private final UserServiceImp userServiceImp;
    private final LoanServiceImp loanServiceImp;

    // khởi tạo
    public APIController(BookServiceImp bookServiceImp, UserServiceImp userServiceImp, LoanServiceImp loanServiceImp){
        this.bookServiceImp = bookServiceImp;
        this.userServiceImp = userServiceImp;
        this.loanServiceImp = loanServiceImp;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userServiceImp.getAll();
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookServiceImp.getAll();
    }


    @GetMapping("/loans")
    public List<Loan> getAllLoans() {
        return loanServiceImp.getAll();
    }
}
