package com.scaler.productservicedecmwfeve.services;

import com.scaler.productservicedecmwfeve.exceptions.ProductNotExistsException;
import com.scaler.productservicedecmwfeve.models.Category;
import com.scaler.productservicedecmwfeve.models.Product;
import com.scaler.productservicedecmwfeve.repositories.CategoryRepository;
import com.scaler.productservicedecmwfeve.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public SelfProductService(ProductRepository productRepository,
                              CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long id) throws ProductNotExistsException { // In Class

        Optional<Product> productOptional = productRepository.findById(1L);

        if (productOptional.isEmpty()) {
            throw new ProductNotExistsException("Product with id: " + id + " doesn't exist.");
        }

        Product product = productOptional.get();

        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) { // In Class
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product addNewProduct(Product product) { // In Class
        Optional<Category> categoryOptional = categoryRepository.findByName(product.getCategory().getName());

        if (categoryOptional.isEmpty()) {

        } else {
            product.setCategory(categoryOptional.get());
        }

        return productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(Long id) {
        return false;
    }
}
