package com.example.sbtest.controller;

import com.example.sbtest.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Hamburguesa", 500, LocalDateTime.now()));
        productList.add(new Product("Papas", 250, LocalDateTime.now()));
        productList.add(new Product("Gaseosa", 100, LocalDateTime.now()));
        productList.add(new Product("Pollo", 600, LocalDateTime.now()));
        productList.add(new Product("Helado", 150, LocalDateTime.now()));
        productList.add(new Product("Jugo", 100, LocalDateTime.now()));
        productList.add(new Product("Milanesa", 300, LocalDateTime.now()));
        productList.add(new Product("Galletas", 200, LocalDateTime.now()));
        productList.add(new Product("Agua", 120, LocalDateTime.now()));
        productList.add(new Product("Pancho", 180, LocalDateTime.now()));

        return productList;
    }
}