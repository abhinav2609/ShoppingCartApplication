package com.ShoppingCart.ProductService.service;

import com.ShoppingCart.ProductService.model.ProductRequest;
import com.ShoppingCart.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(Long productId);

    void reduceQuantity(Long productId, long quantity);
}
