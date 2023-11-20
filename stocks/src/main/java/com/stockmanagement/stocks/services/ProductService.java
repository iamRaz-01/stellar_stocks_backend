package com.stockmanagement.stocks.services;

import com.stockmanagement.stocks.exception.InvalidDataException;
import com.stockmanagement.stocks.model.Product;
import com.stockmanagement.stocks.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo ;
    public int addProduct(){
        Product pro =  new Product();
        try {
            pro.setProductName("wheel spanner");
            pro.setCost(30);
            pro.setCompany("rools");
            pro.setQuantity(3);
            pro.setVehicle(3);
            pro.setDescription("nil");
            if (repo != null) {
                Product p =  repo.save(pro);
            }


         return pro.getId();
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }
    }
}
