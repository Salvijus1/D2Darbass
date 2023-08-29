package com.example.d2darbass;

import javax.jws.WebService;

@WebService
public interface ProductService {
    void addProduct(String product);
    String getProduct(int productId);
    void removeProduct(int productId);
}