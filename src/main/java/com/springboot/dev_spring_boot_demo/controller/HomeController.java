package com.springboot.dev_spring_boot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String shop() {
        return "index";
    }
    @GetMapping("/about")
    public String aboutUs() {
        return "about";
    }
    @GetMapping("/contact")
    public String service() {
        return "contact";
    }
    @GetMapping("/menu")
    public String blog() {
        return "menu";
    }
    @GetMapping("/reservation")
    public String contactUs() {
        return "reservation";
    }
}
