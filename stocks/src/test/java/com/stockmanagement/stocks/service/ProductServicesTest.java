package com.stockmanagement.stocks.service;

import com.stockmanagement.stocks.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServicesTest {

    @Autowired
    private ProductService productRepository;

    @Test
    void addProduct(){
        Assertions.assertNotEquals(0,productRepository.addProduct());

    }
}
