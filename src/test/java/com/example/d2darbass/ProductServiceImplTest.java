package com.example.d2darbass;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductServiceImplTest {

    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productService = new ProductServiceImpl();
    }

    @Test
    public void testAddProduct() {
        productService.addProduct("Car");
        assertNotNull(productService.getProduct(0));
    }

    @Test
    public void testGetProduct() {
        productService.addProduct("Car");
        assertEquals("Car", productService.getProduct(0));
    }
}
