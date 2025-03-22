package com.springboot.dev_spring_boot_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dev_spring_boot_demo.dao.BookRepository;
import com.springboot.dev_spring_boot_demo.entity.Book;

@Service
public class BookServiceImp extends BaseServiceImp<Book, Long> {

    // contrucstor
    public BookServiceImp(BookRepository bookRepository){
        super(bookRepository);
    }

    @Autowired
    private BookRepository bookRepository;

    public long getTotalBooks() {
        return bookRepository.countTotalBooks();
    }


    
}
