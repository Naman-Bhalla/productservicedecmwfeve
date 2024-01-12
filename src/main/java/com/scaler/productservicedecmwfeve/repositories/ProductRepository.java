package com.scaler.productservicedecmwfeve.repositories;

import com.scaler.productservicedecmwfeve.models.Category;
import com.scaler.productservicedecmwfeve.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository
    extends JpaRepository<Product, Long> {

    List<Product> findByTitleContaining(String word);

    long deleteByTitleIgnoreCase(String title);

    List<Product> findByTitleAndDescription(String title,
                                            String description);
    List<Product> findByPriceBetween(double startRange, double endRange);

    List<Product> findByCategory(Category category);

    Product findByIdAndCategoryOrderByTitle(Long id, Category category);

    List<Product> findByCategory_Id(Long id);


    Optional<Product> findById(Long id);
    // this will return a null ifno product matches the id

    Product save(Product product);
}

// 1. CategoryRepository.findById()
// 2. ProductRepository.findByCategory()
// Problem: API may be a bit slower because 2 DB Calls