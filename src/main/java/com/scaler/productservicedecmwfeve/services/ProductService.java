package com.scaler.productservicedecmwfeve.services;

import com.scaler.productservicedecmwfeve.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long id);

    List<Product> getAllProducts();
}
