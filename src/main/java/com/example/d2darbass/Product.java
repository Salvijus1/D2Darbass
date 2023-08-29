package com.example.d2darbass;

import java.util.List;

public class Product {
    private String name;
    private int productId;
    private float price;
    private boolean inStock;
    private char category;
    private List<Review> reviews;

    public Product(String name, int productId, float price, boolean inStock, char category, List<Review> reviews) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.inStock = inStock;
        this.category = category;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public float getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public char getCategory() {
        return category;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
