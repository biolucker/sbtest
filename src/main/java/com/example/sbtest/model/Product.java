package com.example.sbtest.model;

import java.time.LocalDateTime;

public class Product {

    private String name;
    private int price;
    private LocalDateTime createdAt;

    public Product(String name, int price, LocalDateTime createdAt) {
        this.name = name;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
