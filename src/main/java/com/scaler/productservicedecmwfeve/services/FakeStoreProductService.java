package com.scaler.productservicedecmwfeve.services;

import com.scaler.productservicedecmwfeve.dtos.FakeStoreProductDto;
import com.scaler.productservicedecmwfeve.models.Category;
import com.scaler.productservicedecmwfeve.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
    private final RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long id) {
        FakeStoreProductDto productDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class
        );

        return productDto != null ? convertFakeStoreProductToProduct(productDto) : null;
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] productDtos = restTemplate.getForObject(
                "https://fakestoreapi.com/products",
                FakeStoreProductDto[].class
        );

        return productDtos != null ? Arrays.stream(productDtos)
                .map(this::convertFakeStoreProductToProduct)
                .toList() : Collections.emptyList();
    }

    private Product convertFakeStoreProductToProduct(FakeStoreProductDto fakeStoreProduct) {
        Product product = new Product();
        product.setTitle(fakeStoreProduct.getTitle());
        product.setId(fakeStoreProduct.getId());
        product.setPrice(fakeStoreProduct.getPrice());
        product.setDescription(fakeStoreProduct.getDescription());
        product.setImageUrl(fakeStoreProduct.getImage());
        product.setCategory(new Category());
        product.getCategory().setName(fakeStoreProduct.getCategory());

        return product;
    }
}
