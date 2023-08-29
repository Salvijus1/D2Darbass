package com.example.d2darbass;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "com.example.d2darbass.ProductService")
public class ProductServiceImpl implements ProductService {
    private Map<Integer, Product> products = new HashMap<>();

    @Override
    public void addProduct(String product) {
        List<Review> dummyReviews = new ArrayList<>();
        dummyReviews.add(new Review("Alice", 5, "Good product"));
        dummyReviews.add(new Review("Bob", 4, "Nice product"));
        products.put(0, new Product(product, 1, 1.0F, false, 'e', dummyReviews));
    }

    @Override
    public String getProduct(int productId) {
        return products.get(productId).getName();
    }

    @Override
    public void removeProduct(int productId) {
        products.remove(productId);
    }
}
