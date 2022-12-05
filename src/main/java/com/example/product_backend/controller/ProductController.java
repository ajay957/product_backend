package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
    public String HomePage(){
        return "welcome to product home page";
    }
    @PostMapping("/add")
    public String ProductAdd(){
        return "welcome to add product page";
    }
    @PostMapping("/search")
    public String ProductSearch(){
        return "welcome to product search page";
    }
    @PostMapping("/edit")
    public String ProductEdit(){
        return "welcome to product edit page";
    }


}
