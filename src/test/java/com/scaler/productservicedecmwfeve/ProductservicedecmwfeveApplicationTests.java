package com.scaler.productservicedecmwfeve;

import com.scaler.productservicedecmwfeve.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
class ProductservicedecmwfeveApplicationTests {
    @Autowired
    private ProductRepository productRepository;

//    public ProductservicedecmwfeveApplication(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    @Test
    void contextLoads() {
    }

    @Test
    @Transactional
    @Commit
    void testQueries() {
        productRepository.findByTitleContaining("naman");
//        productRepository.deleteByTitle("naman");
    }

}
