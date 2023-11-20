package com.stockmanagement.stocks.repository;
import com.stockmanagement.stocks.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
