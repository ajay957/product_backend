package com.example.product_backend.controller;

import com.example.product_backend.dao.ProductDao;
import com.example.product_backend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @GetMapping("/")
    public String HomePage(){
        return "welcome to product home page";
    }
    @CrossOrigin("*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String ProductAdd(@RequestBody Product p){
        System.out.println(p.getProductCode());
        System.out.println(p.getProductName().toString());
        System.out.println(p.getManuDate().toString());
        System.out.println(p.getExpDate().toString());
        System.out.println(p.getBrand().toString());
        System.out.println(p.getPrice());
        System.out.println(p.getSellName().toString());
        System.out.println(p.getDisName().toString());
        dao.save(p);
        return "product added successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")

    public List<Product> viewAll(){
        return(List<Product>) dao.findAll();
    }
}
