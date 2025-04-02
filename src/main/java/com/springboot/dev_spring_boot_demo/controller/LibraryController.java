package com.springboot.dev_spring_boot_demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.dev_spring_boot_demo.entity.Book;
import com.springboot.dev_spring_boot_demo.entity.Category;
import com.springboot.dev_spring_boot_demo.entity.Loan;
import com.springboot.dev_spring_boot_demo.entity.User;
import com.springboot.dev_spring_boot_demo.service.BookServiceImp;
import com.springboot.dev_spring_boot_demo.service.CategoryServiceImp;
import com.springboot.dev_spring_boot_demo.service.LoanServiceImp;
import com.springboot.dev_spring_boot_demo.service.UserServiceImp;

@Controller
@RequestMapping("/library")
public class LibraryController {
    
    // khai báo Service
    private final BookServiceImp bookServiceImp;
    private final UserServiceImp userServiceImp;
    private final LoanServiceImp loanServiceImp;
    private final CategoryServiceImp categoryServiceImp;

    // Contrucstor controller
    public LibraryController(BookServiceImp bookServiceImp, UserServiceImp userServiceImp, LoanServiceImp loanServiceImp, CategoryServiceImp categoryServiceImp){
        this.bookServiceImp = bookServiceImp;
        this.categoryServiceImp = categoryServiceImp;
        this.loanServiceImp = loanServiceImp;
        this.userServiceImp = userServiceImp;
    }

    // REST API
    @GetMapping("/sign-in")
    public String formSignIn(Model model){
        User user = new User();
        model.addAttribute("User", user);
        return "form-sign-in";
    }

    // path Book

    @GetMapping("/books")
    public String list(Model model){
        List<Book> books = bookServiceImp.getAll();
        model.addAttribute("Book", books);
        return "admin/books/books";
    }

    @GetMapping("/book-form-insert")
    public String formInsert(Model model){
        List<Category> categories = categoryServiceImp.getAll();    // // Lấy danh sách thể loại từ DB
        model.addAttribute("categories", categories);
        Book book = new Book();
        model.addAttribute("book", book);
        return "admin/books/book-form-insert";
    }

    @PostMapping("/save")
    public String save(Book book){
        bookServiceImp.save(book);
        return "redirect:/library/books";
    }

    @GetMapping("/book-form-update")
    public String formUpdate(@RequestParam("bookId") long bookId,Model model){
        Book book = bookServiceImp.getById(bookId);

        List<Category> categories = categoryServiceImp.getAll();    // // Lấy danh sách thể loại từ DB
        model.addAttribute("categories", categories);
        model.addAttribute("book", book);
        return "admin/books/book-form-update";
    }

    @DeleteMapping("/delete/{bookId}")
    public String deleteBook(@PathVariable("bookId") long bookId) {
        bookServiceImp.delete(bookId);
        return "redirect:/library/books"; // Điều hướng về danh sách sách sau khi xóa
    }

    // path loans

    @GetMapping("/loans")
    public String getAllLoans(Model model){
        List<Loan> loans = loanServiceImp.getAll();
        model.addAttribute("loans", loans);
        return "admin/loans/bookRental";
    }
    

    @GetMapping("/loan-form-insert")
    public String formLoanInsert(Model model){
        List<User> users = userServiceImp.getAll();
        model.addAttribute("users", users);
        List<Book> books = bookServiceImp.getAll();
        model.addAttribute("books", books);
        model.addAttribute("loans", new Loan());
        return "admin/loans/loan-form-insert";
    }

    @PostMapping("/loan/save")
    public String saveLoan(Loan loan){
        loanServiceImp.save(loan);
        return "redirect:/library/loans";
    }
    

    // path users

    @GetMapping("/users")
    public String getAllUsers(Model model){
        List<User> users = userServiceImp.getAll();
        model.addAttribute("User", users);
        return "admin/users/users";
    }

    @GetMapping("/user-form-insert")
    public String formUserInsert(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "admin/users/user-form-insert";
    }

    @PostMapping("/user/save")
    public String saveUser(User user){
        userServiceImp.save(user);
        return "redirect:/library/users";
    }


    // hiển thị trang dashboard
    @GetMapping("/dashboard")
    public String admin(Model model){
        model.addAttribute("title", "Library Admin Dashboard");
        return "admin/index";
    }

}


