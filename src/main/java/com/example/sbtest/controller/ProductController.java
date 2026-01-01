package com.example.sbtest.controller;

import com.example.sbtest.model.Product;
import com.example.sbtest.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // OLD: in-memory
    @GetMapping("/products")
    public List<Product> getProductsInMemory() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Hamburguesa", 500, LocalDateTime.now()));
        productList.add(new Product("Papas", 250, LocalDateTime.now()));
        productList.add(new Product("Gaseosa", 100, LocalDateTime.now()));

        return productList;
    }

    // NEW: MySQL-backed
    @GetMapping("/list")
    public List<Product> getProductsFromDatabase() {
        return productService.getAllProducts();
    }
}